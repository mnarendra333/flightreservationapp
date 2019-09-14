package com.pragim.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pragim.flightreservation.entity.Flight;
@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer> {

}
