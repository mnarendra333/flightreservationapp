package com.pragim.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pragim.flightreservation.entity.Passenger;
@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

	Passenger findByEmail(String email);

}
