package com.rjs.myshows.server.config;

import org.springframework.beans.factory.annotation.Value;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AppProperties {
	@Value("${datePattern:yyyy-MM-dd}")
	private String datePattern;
	@Value("${localFilePath}")
	private String localFilePath;

	public AppProperties() {
	}
}
