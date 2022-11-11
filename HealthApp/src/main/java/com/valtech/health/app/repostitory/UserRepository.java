package com.valtech.health.app.repostitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.valtech.health.app.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	 User findByEmail(String email);

}
