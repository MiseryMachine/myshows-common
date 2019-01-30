package com.rjs.myshows.domain.dto;

import java.util.Objects;

import com.rjs.myshows.domain.BaseElement;

public abstract class BaseDto implements BaseElement {
	protected String id;

	protected BaseDto() {
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

	public String getUniqueName() {
		return String.format("%s:%s", getClass().getName(), id);
	}

	@Override
	public String toString() {
		return getUniqueName();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		BaseDto baseDto = (BaseDto) o;

		return Objects.equals(id, baseDto.id);
	}

	@Override
	public int hashCode() {
		return id != null ? id.hashCode() : 0;
	}
}
