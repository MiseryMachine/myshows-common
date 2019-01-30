package com.rjs.myshows.domain;

import java.time.LocalDate;
import java.util.HashSet;

public interface Show extends BaseElement {
	String getMdbId();
	void setMdbId(String mdbId);

	String getImdbId();
	void setImdbId(String imdbId);

	String getTitle();
	void setTitle(String title);

	String getShowRating();
	void setShowRating(String showRating);

	HashSet<String> getContents();
	void setContents(HashSet<String> contents);

	String getTagLine();
	void setTagLine(String tagLine);

	String getDescription();
	void setDescription(String description);

	LocalDate getReleaseDate();
	void setReleaseDate(LocalDate releaseDate);

	String getReleaseDateText();
	void setReleaseDateText(String releaseDateText);

	Integer getRuntime();
	void setRuntime(Integer runtime);

	String getShowType();
	void setShowType(String showType);

	HashSet<String> getGenres();
	void setGenres(HashSet<String> genres);

	String getMediaFormat();
	void setMediaFormat(String mediaFormat);

	String getPersonalNotes();
	void setPersonalNotes(String personalNotes);

	int getStarRating();
	void setStarRating(int starRating);
}
