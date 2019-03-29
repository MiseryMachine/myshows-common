package com.rjs.myshows.server.service.mdb;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;

import com.rjs.myshows.server.domain.dto.ShowDto;
import com.rjs.myshows.server.service.ImageService;

public abstract class MdbService {
	protected ImageService imageService;

	@Value("localFilePath")
	protected String localFilePath;

	protected MdbService(ImageService imageService) {
		this.imageService = imageService;
	}

	public abstract List<ShowSummary> searchShows(String showTypeName, String title);
	public abstract Optional<ShowDto> addShow(String mdbId, String showTypeName);
	public abstract Set<String> getGenres(String showTypeName);

	public String getLocalImagePath(String showId) {
		return String.format("%s/shows/%s/images", localFilePath, showId);
	}

	public String getLocalFilePath() {
		return localFilePath;
	}

	public void setLocalFilePath(String localFilePath) {
		this.localFilePath = localFilePath;
	}
}
