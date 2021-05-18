package de.tekup.user.data.repos;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import de.tekup.user.data.models.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Long>{
	Optional<UserEntity> findByEmail(String username);
}
