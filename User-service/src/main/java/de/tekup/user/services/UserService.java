package de.tekup.user.services;

import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import de.tekup.user.data.models.UserEntity;
import de.tekup.user.data.repos.UserRepository;
import de.tekup.user.ui.models.UserDTO;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {

	private UserRepository userRepository;
	private ModelMapper mapper;
	
	public UserDTO saveUSerToDB(UserDTO userDTO) {
		UserEntity user = mapper.map(userDTO, UserEntity.class);
		user.setUserId(UUID.randomUUID().toString());
		user = userRepository.save(user);
		return mapper.map(user, UserDTO.class);
	}
}
