package com.pragim.flightreservation.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Flight {

	@Id
	private int id;
	private String flightNumber;
	private String operatingAirlines;
	@Column(name="DEPARTURE_CITY")
	private String depatureCity;
	private String arrivalCity;
	@Column(name="DATE_OF_DEPARTURE")
	private Date dateOfDepature;
	@Column(name="ESTIMATED_DEPARTURE_TIME")
	private Timestamp estimatedDepatureTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOperatingAirlines() {
		return operatingAirlines;
	}

	public void setOperatingAirlines(String operatingAirlines) {
		this.operatingAirlines = operatingAirlines;
	}

	public String getDepatureCity() {
		return depatureCity;
	}

	public void setDepatureCity(String depatureCity) {
		this.depatureCity = depatureCity;
	}

	public String getArrivalCity() {
		return arrivalCity;
	}

	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}

	public Date getDateOfDepature() {
		return dateOfDepature;
	}

	public void setDateOfDepature(Date dateOfDepature) {
		this.dateOfDepature = dateOfDepature;
	}

	public Timestamp getEstimatedDepatureTime() {
		return estimatedDepatureTime;
	}

	public void setEstimatedDepatureTime(Timestamp estimatedDepatureTime) {
		this.estimatedDepatureTime = estimatedDepatureTime;
	}

}
