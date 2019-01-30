package com.rjs.myshows.domain.security;

import java.util.Arrays;

public enum Role {
	ROLE_USER("User"),
	ROLE_REST_USER("REST User"),
	ROLE_ADMIN("Admin");

	public final String text;

	Role(String text) {
		this.text = text;
	}

	public static Role findByText(String txt) {
		return Arrays.stream(Role.values())
			.filter(r -> r.text.equals(txt))
			.findFirst()
			.orElse(null);
	}

	@Override
	public String toString() {
		return text;
	}
}
