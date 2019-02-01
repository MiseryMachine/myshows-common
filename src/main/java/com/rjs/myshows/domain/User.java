package com.rjs.myshows.domain;

import java.time.LocalDate;
import java.util.Set;

import com.rjs.myshows.domain.security.Role;

public interface User extends BaseElement {
	String getUsername();
	void setUsername(String username);

	String getEmail();
	void setEmail(String email);

	String getFirstName();
	void setFirstName(String firstName);

	String getLastName();
	void setLastName(String lastName);

	boolean isEnabled();
	void setEnabled(boolean enabled);

	LocalDate getDateOfBirth();
	void setDateOfBirth(LocalDate dateOfBirth);

	Set<Role> getRoles();
	void setRoles(Set<Role> roles);
}
