package com.rjs.myshows.domain.dto;

import java.util.HashSet;
import java.util.Set;

import com.rjs.myshows.domain.ShowType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShowTypeDto extends BaseDto implements ShowType {
	private String name;
	private Set<String> genres = new HashSet<>();

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
}
