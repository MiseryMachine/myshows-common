package com.rjs.myshows.util;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.spi.ImageReaderSpi;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.lang3.StringUtils;
import org.imgscalr.Scalr;

public class ImageUtil {
	public final String JPEG_IMG = "JPEG";
	public final String PNG_IMG = "PNG";

	private final Logger logger = Logger.getLogger(ImageUtil.class.getName());
	private final double thumbWidth = 92;

	public ImageUtil() {
	}

	public BufferedImage createThumbImage(BufferedImage original) {
		double ratio = thumbWidth / original.getWidth();
		double thumbHeight = ratio * original.getHeight();

		return Scalr.resize(original, Scalr.Method.ULTRA_QUALITY, (int) thumbWidth, (int) thumbHeight);
	}

	public void saveImage(URL imageUrl, String savePathStr, String imageName) {
		if (StringUtils.isBlank(savePathStr)) {
			logger.severe("Save image error: savePathStr parameter is blank.");

			return;
		}

		saveImage(imageUrl, new File(savePathStr), imageName);
	}

	public void saveImage(URL imageUrl, File savePath, String imageName) {
		if (!savePath.exists()) {
			if (savePath.mkdirs()) {
				logger.info(String.format("Created local image path: %s.", savePath));
			}
			else {
				logger.severe(String.format("Unable to create local image path: %s.", savePath));

				return;
			}
		}

		if (!savePath.isDirectory()) {
			logger.severe(String.format("Save image error: %s is not a directory.", savePath));

			return;
		}

		if (StringUtils.isBlank(imageName)) {
			logger.severe("Save image error: imageName parameter is blank.");

			return;
		}

		try {
			String imageFileSuffix = JPEG_IMG;
			URLConnection connection = imageUrl.openConnection();

			try (InputStream imgStream = connection.getInputStream()) {
				BufferedImage img = ImageIO.read(imgStream);
				Iterator<ImageReader> readers = ImageIO.getImageReadersByMIMEType(connection.getContentType());
				boolean suffixFound = false;

				while (!suffixFound && readers.hasNext()) {
					ImageReaderSpi provider = readers.next().getOriginatingProvider();

					if (provider != null) {
						String[] suffixes = provider.getFileSuffixes();

						if (suffixes != null && suffixes.length > 0) {
							imageFileSuffix = suffixes[0].startsWith(".") ? suffixes[0].substring(1) : suffixes[0];
							suffixFound = true;
						}
					}
				}

				String imgName = String.format("%s.%s", imageName, imageFileSuffix);
				ImageIO.write(img, imageFileSuffix, new FileOutputStream(new File(savePath, imgName)));
			}
		}
		catch (IOException e) {
			logger.log(Level.SEVERE, String.format("Save image error: %s", imageUrl.toExternalForm()), e);
		}
	}
}
