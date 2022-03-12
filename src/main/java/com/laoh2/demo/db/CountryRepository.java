package com.laoh2.demo.db;

import com.laoh2.demo.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CountryRepository extends JpaRepository<Country, Long> {

    Optional<Country> findById(Long id);
}
