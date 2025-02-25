package com.project.Flight_Management_System.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Flight_Management_System.dto.Airport;

public interface AirportRepo extends JpaRepository<Airport, Integer>{

}
