package com.rjs.myshows.service;

import java.util.List;
import java.util.Set;

import com.rjs.myshows.domain.Show;
import com.rjs.myshows.domain.mdb.MdbShow;

public interface MdbService<S extends Show> {
	List<MdbShow> searchShows(String showTypeName, String title);
	S addShow(String showTypeName, String mdbId);
	Set<String> getGenres(String showTypeName);
}
