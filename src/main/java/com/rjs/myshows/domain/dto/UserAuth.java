package com.rjs.myshows.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserAuth {
	private String username;
	private String password;
	private String confirmPassword;
}
