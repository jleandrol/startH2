package com.laoh2.demo.controller;

import com.laoh2.demo.db.CountryRepository;
import com.laoh2.demo.domain.Country;
import com.laoh2.demo.domain.CountryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/country/")
public class CountryController {

    @Autowired
    private CountryRepository countryRepository;

    @GetMapping()
    public ResponseEntity get() {
        List<Country> all = countryRepository.findAll();
        return ResponseEntity.ok(all);
    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id) {
        Optional<Country> country = countryRepository.findById(id);
        return ResponseEntity.ok(country.get());
    }

    @GetMapping("/last/{id}")
    public ResponseEntity getCountry(@PathVariable("id") Long id) {
        Optional<Country> country = countryRepository.findById(id);
        CountryDTO dto = CountryDTO.create(country.get());
        return ResponseEntity.ok(dto);
    }

}
