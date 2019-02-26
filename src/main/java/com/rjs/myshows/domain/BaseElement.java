package com.rjs.myshows.domain;

import java.io.Serializable;

public interface BaseElement<E extends Serializable> {
	E getId();
	void setId(E id);
}
