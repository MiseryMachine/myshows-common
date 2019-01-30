package com.rjs.myshows.domain.mdb;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MdbShowDetail extends MdbShow {
	public ArrayList<MdbGenre> genres = new ArrayList<>();
	public String imdbId= "";
	public int runtime = -1;
	public String tagline = "";
}
