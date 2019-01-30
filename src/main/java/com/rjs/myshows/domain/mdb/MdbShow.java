package com.rjs.myshows.domain.mdb;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MdbShow {
	public int id = -1;
	public String title = "";
	public String overview = "";
	@JsonProperty("poster_path")
	public String posterPath = "";
	@JsonProperty("release_date")
	public String releaseDate = "";
	@JsonProperty("genere_ids")
	public ArrayList<Integer> genreIds = new ArrayList<>();
}
