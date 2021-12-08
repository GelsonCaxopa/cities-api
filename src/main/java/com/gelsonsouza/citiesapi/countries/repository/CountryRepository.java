package com.gelsonsouza.citiesapi.countries.repository;

import com.gelsonsouza.citiesapi.countries.entities.Country;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
