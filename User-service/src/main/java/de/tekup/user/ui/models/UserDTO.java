package de.tekup.user.ui.models;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class UserDTO {
	@Size(min = 2, max = 45)
	private String name;
	@NotBlank
	@Email
	private String email;
	@Pattern(regexp = "$[0-9]{4-8}^")
	private String password;
	
	private String userId;
	
	private List<AlbumResponseModel> albums;

}
