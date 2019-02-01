package com.rjs.myshows.domain;

import java.util.Set;

public interface ShowType extends BaseElement {
	String getName();
	void setName(String name);

	Set<String> getGenres();
	void setGenres(Set<String> genres);

	void addGenre(String genre);
	void removeGenre(String genre);
	boolean hasGenre(String genre);
}
