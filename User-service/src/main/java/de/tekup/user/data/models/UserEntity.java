package de.tekup.user.data.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import lombok.Data;

@Entity
@Data
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(length = 45, nullable = false)
	private String name;
	@Column(length = 45, nullable = false, unique = true)
	private String email;
	@Column(nullable = false)
	private String password;
	@Column( nullable = false)
	private String userId;
	
	public void setPassword(String rawPassword) {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		this.password = bCryptPasswordEncoder.encode(rawPassword);
	}
}
