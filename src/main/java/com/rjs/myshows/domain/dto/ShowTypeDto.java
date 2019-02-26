package com.rjs.myshows.domain.dto;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.rjs.myshows.domain.ShowType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShowTypeDto extends BaseDto implements ShowType {
	private String name;
	@JsonDeserialize(as = HashSet.class)
	private Set<String> genres = new HashSet<>();
	@JsonDeserialize(as = HashSet.class)
	private Set<String> ratings = new HashSet<>();

	public ShowTypeDto() {
	}

	@Override
	public void addGenre(String genre) {
		genres.add(genre);
	}

	@Override
	public void removeGenre(String genre) {
		genres.remove(genre);
	}

	@Override
	public boolean hasGenre(String genre) {
		return genres.contains(genre);
	}

	@Override
	public void addRating(String rating) {
		ratings.add(rating);
	}

	@Override
	public void removeRating(String rating) {
		ratings.remove(rating);
	}

	@Override
	public boolean hasRating(String rating) {
		return ratings.contains(rating);
	}
}
