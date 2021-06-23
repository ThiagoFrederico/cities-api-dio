package com.github.thiagoFrederico.citiesapi.countries.repository;

import com.github.thiagoFrederico.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
