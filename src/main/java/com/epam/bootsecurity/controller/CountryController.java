package com.epam.bootsecurity.controller;

import com.epam.bootsecurity.entity.Country;
import com.epam.bootsecurity.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;


    @RequestMapping("/all")
    public String findAllCountries(ModelMap modelMap){
        modelMap.addAttribute("countriesFromServer", countryService.findAllCountries());
        return "countries";
    }

    @RequestMapping("/{id}")
    public ResponseEntity<Country> findCountry(@PathVariable long id){
        return new ResponseEntity<>(countryService.findCountryById(id).get(), HttpStatus.ACCEPTED);
    }




}
