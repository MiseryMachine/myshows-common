package com.rjs.myshows.domain.dto;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.rjs.myshows.domain.Show;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShowDto extends BaseDto implements Show {
	private String mdbId;
	private String imdbId;
	private String title;
	private String showRating;
	@JsonDeserialize(as = HashSet.class)
	private Set<String> contents = new HashSet<>();;
	private String tagLine;
	private String description;
	private LocalDate releaseDate;
	private String releaseDateText;
	private Integer runtime;
	private String showType;
	@JsonDeserialize(as = HashSet.class)
	private Set<String> genres = new HashSet<>();;
	private String mediaFormat;
	private String personalNotes;
	private int starRating = 0;
}
