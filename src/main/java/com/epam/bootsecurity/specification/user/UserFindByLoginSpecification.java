package com.epam.bootsecurity.specification.user;

import com.epam.bootsecurity.specification.Specification;
import com.epam.bootsecurity.entity.User;
import com.epam.bootsecurity.metamodel.User_;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class UserFindByLoginSpecification implements Specification<User> {

    private String login;

    public UserFindByLoginSpecification(String login) {
        this.login = login;
    }

    @Override
    public Predicate getPredicate(Root<User> root, CriteriaBuilder cb) {
        return cb.equal(root.get(User_.LOGIN), login);
    }

    @Override
    public Class<User> getType() {
        return User.class;
    }
}
