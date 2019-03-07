package com.epam.bootsecurity.specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;


public interface Specification<T> {

    Predicate getPredicate(Root<T> root, CriteriaBuilder cb);
    Class<T> getType();
}
