package com.rjs.myshows.domain.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRegister {
	private String username;
	private String email;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String password;
	private String confirmPassword;
}
