package de.tekup.user.data.repos;

import org.springframework.data.repository.CrudRepository;

import de.tekup.user.data.models.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Long>{

}
