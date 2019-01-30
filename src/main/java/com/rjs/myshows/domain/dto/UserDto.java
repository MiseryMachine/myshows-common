package com.rjs.myshows.domain.dto;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.rjs.myshows.domain.User;
import com.rjs.myshows.domain.security.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto extends BaseDto implements User {
	private String username;
	private String email;
	private String firstName;
	private String lastName;
	private boolean enabled;
	private LocalDate dateOfBirth;
	private final Set<Role> roles = new HashSet<>();

	@Override
	public void grantRole(Role role) {
		if (role != null) {
			roles.add(role);
		}
	}

	@Override
	public void revokeRole(Role role) {
		if (role != null) {
			roles.remove(role);
		}
	}
}
