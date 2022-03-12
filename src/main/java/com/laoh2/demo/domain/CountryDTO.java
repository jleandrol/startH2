package com.laoh2.demo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
public class CountryDTO {
    private String name;
    private Date lastUpdateTime;

    public static CountryDTO create(Country country){
        ModelMapper mapper = new ModelMapper();
        CountryDTO countryDTO = mapper.map(country, CountryDTO.class);
        updateTimefield(countryDTO);
        return countryDTO;
    }

    private static void updateTimefield(CountryDTO countryDTO) {
        countryDTO.setLastUpdateTime(new Date());
    }
}

