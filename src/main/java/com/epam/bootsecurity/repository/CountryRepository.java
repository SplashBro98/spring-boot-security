package com.epam.bootsecurity.repository;

import com.epam.bootsecurity.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

    Country findByName(String name);
    void deleteByName(String name);
}
