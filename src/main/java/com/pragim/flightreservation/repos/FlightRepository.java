package com.pragim.flightreservation.repos;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pragim.flightreservation.entity.Flight;
@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer> {

	@Query("from Flight f where f.depatureCity=:depatureCity and f.arrivalCity=:arrivalCity and f.dateOfDepature=:dateOfDepature")
	List<Flight> findByDepatureCity(@Param("depatureCity") String depatureCity,@Param("arrivalCity") String arrivalCity,
			@Param("dateOfDepature") Date dateOfDepature);

}
