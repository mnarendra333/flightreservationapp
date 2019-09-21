package com.pragim.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pragim.flightreservation.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User findByEmail(String email);

}
