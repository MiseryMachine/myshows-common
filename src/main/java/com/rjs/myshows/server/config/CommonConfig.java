package com.rjs.myshows.server.config;

import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.modelmapper.ModelMapper;

@Getter
@Setter
@NoArgsConstructor
@Configuration
public class CommonConfig {
	@Value("${datePattern:yyyy-MM-dd}")
	private String datePattern;

	@Value("${localFilePath}")
	private String localFilePath;


	@Bean
	public DateTimeFormatter dateFormat() {
		return DateTimeFormatter.ofPattern(datePattern);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
