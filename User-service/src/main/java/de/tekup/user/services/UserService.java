package de.tekup.user.services;

import java.util.ArrayList;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import de.tekup.user.data.models.UserEntity;
import de.tekup.user.data.repos.UserRepository;
import de.tekup.user.ui.models.UserDTO;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService implements UserDetailsService{

	private UserRepository userRepository;
	private ModelMapper mapper;
	
	public UserDTO saveUSerToDB(UserDTO userDTO) {
		UserEntity user = mapper.map(userDTO, UserEntity.class);
		user.setUserId(UUID.randomUUID().toString());
		user = userRepository.save(user);
		return mapper.map(user, UserDTO.class);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserEntity userEntity = userRepository.findByEmail(username)
								.orElseThrow(() -> new UsernameNotFoundException("User email not found"));
		return new User(userEntity.getEmail(), userEntity.getPassword(), true, true, true, true, new ArrayList<>());
	}
	
	public UserDTO getUserByEmail(String email) {
		UserEntity userEntity = userRepository.findByEmail(email)
				.orElseThrow(() -> new UsernameNotFoundException("User email not found"));
		return mapper.map(userEntity, UserDTO.class);
	}
}
