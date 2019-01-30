package com.rjs.myshows.domain.dto;

import java.time.LocalDate;
import java.util.HashSet;

import com.rjs.myshows.domain.Show;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShowDto extends BaseDto implements Show {
	private String mdbId;
	private String imdbId;
	private String title;
	private String showRating;
	private HashSet<String> contents;
	private String tagLine;
	private String description;
	private LocalDate releaseDate;
	private String releaseDateText;
	private Integer runtime;
	private String showType;
	private HashSet<String> genres;
	private String mediaFormat;
	private String personalNotes;
	private int starRating = 0;
}
