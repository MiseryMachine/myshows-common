package com.rjs.myshows.domain.dto;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.rjs.myshows.domain.User;
import com.rjs.myshows.domain.security.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDto extends BaseDto implements User {
	private String username;
	private String email;
	private String firstName;
	private String lastName;
	private boolean enabled;
	private LocalDate dateOfBirth;
	@JsonDeserialize(as = HashSet.class)
	private Set<Role> roles = new HashSet<>();

	public void grantRole(Role role) {
		if (role != null) {
			roles.add(role);
		}
	}

	public void revokeRole(Role role) {
		if (role != null) {
			roles.remove(role);
		}
	}
}
