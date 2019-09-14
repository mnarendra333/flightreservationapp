package com.pragim.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pragim.flightreservation.entity.Reseravation;
@Repository
public interface ReservationRepository extends JpaRepository<Reseravation, Integer> {

}
