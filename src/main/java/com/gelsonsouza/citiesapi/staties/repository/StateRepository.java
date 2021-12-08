package com.gelsonsouza.citiesapi.staties.repository;

import com.gelsonsouza.citiesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}