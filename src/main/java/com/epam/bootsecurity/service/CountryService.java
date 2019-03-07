package com.epam.bootsecurity.service;

import com.epam.bootsecurity.repository.CountryRepository;
import com.epam.bootsecurity.specification.country.CountryFindAllSpecification;
import com.epam.bootsecurity.specification.country.CountryFindByIdSpecification;
import com.epam.bootsecurity.specification.country.CountryFindByNameSpecification;
import com.epam.bootsecurity.entity.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;


    public List<Country> findAllCountries() {

        return countryRepository.findAll();
    }

    public Optional<Country> findCountryById(long id) {

        return countryRepository.findById(id);
    }

    public Country findCountryByName(String name){

        return countryRepository.findByName(name);
    }

    public void addCountry(Country country) {
        countryRepository.save(country);
    }


}

