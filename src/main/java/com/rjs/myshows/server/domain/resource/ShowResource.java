package com.rjs.myshows.server.domain.resource;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;

import org.springframework.hateoas.ResourceSupport;

import com.rjs.myshows.server.domain.Show;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShowResource<ID extends Serializable> extends ResourceSupport {
	private ID elementId;
	private String mdbId;
	private String imdbId;
	private String title;
	private String showRating;
	private HashSet<String> contents = new HashSet<>();
	private String tagLine;
	private String description;
	private LocalDate releaseDate;
	private String releaseDateText;
	private Integer runtime;
	private String showType;
	private HashSet<String> genres = new HashSet<>();;
	private String mediaFormat;
	private String personalNotes;
	private int starRating = 0;

	public ShowResource(Show<ID> show) {
		elementId = show.getElementId();
		mdbId = show.getMdbId();
		imdbId = show.getImdbId();
		title = show.getTitle();
		showRating = show.getShowRating();

		if (show.getContents() != null) {
			contents.addAll(show.getContents());
		}

		tagLine = show.getTagLine();
		description = show.getDescription();
		releaseDate = show.getReleaseDate();
		releaseDateText = show.getReleaseDateText();
		runtime = show.getRuntime();
		showType = show.getShowType();

		if (show.getGenres() != null) {
			genres.addAll(show.getGenres());
		}

		mediaFormat = show.getMediaFormat();
		personalNotes = show.getPersonalNotes();
		starRating = show.getStarRating();
	}
}
