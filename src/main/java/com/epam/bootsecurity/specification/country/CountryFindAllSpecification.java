package com.epam.bootsecurity.specification.country;

import com.epam.bootsecurity.specification.Specification;
import com.epam.bootsecurity.entity.Country;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;


public class CountryFindAllSpecification implements Specification<Country> {

    @Override
    public Predicate getPredicate(Root<Country> root, CriteriaBuilder cb) {
       throw new UnsupportedOperationException();
    }

    @Override
    public Class<Country> getType() {
        return Country.class;
    }
}
