package com.kodlamaio.rentACar.business.responses.users;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor 
@AllArgsConstructor
public class UserResponse {
	private String firstName;
	private String lastName;
	private String tcNo;
	private String email;
	private String password;
}
