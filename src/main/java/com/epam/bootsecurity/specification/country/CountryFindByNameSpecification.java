package com.epam.bootsecurity.specification.country;

import com.epam.bootsecurity.specification.Specification;
import com.epam.bootsecurity.entity.Country;
import com.epam.bootsecurity.metamodel.Country_;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class CountryFindByNameSpecification implements Specification<Country> {

    private String countryName;

    public CountryFindByNameSpecification(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public Predicate getPredicate(Root<Country> root, CriteriaBuilder cb) {
        return cb.equal(root.get(Country_.NAME), countryName);
    }

    @Override
    public Class<Country> getType() {
        return Country.class;
    }
}
