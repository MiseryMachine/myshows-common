package com.rjs.myshows.domain;

import java.util.Set;

public interface ShowType {
	String getName();
	void setName(String name);

	Set<String> getGenres();
	void setGenres(Set<String> genres);

	void addGenre(String genre);
	void removeGenre(String genre);
	boolean hasGenre(String genre);

	Set<String> getRatings();
	void setRatings(Set<String> ratings);

	void addRating(String rating);
	void removeRating(String rating);
	boolean hasRating(String rating);
}