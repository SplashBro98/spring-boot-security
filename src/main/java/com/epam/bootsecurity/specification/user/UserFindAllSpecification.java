package com.epam.bootsecurity.specification.user;

import com.epam.bootsecurity.specification.Specification;
import com.epam.bootsecurity.entity.User;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class UserFindAllSpecification implements Specification<User> {

    @Override
    public Predicate getPredicate(Root<User> root, CriteriaBuilder cb) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Class<User> getType() {
        return User.class;
    }
}
