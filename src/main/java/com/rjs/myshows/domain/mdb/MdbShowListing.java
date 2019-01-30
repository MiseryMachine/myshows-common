package com.rjs.myshows.domain.mdb;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MdbShowListing {
	public int page = 0;
	public ArrayList<MdbShow> results = new ArrayList<>();
}
