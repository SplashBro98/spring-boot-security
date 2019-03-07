package com.epam.bootsecurity.metamodel;

import com.epam.bootsecurity.entity.User;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(User.class)
public abstract class User_ {

	public static volatile SingularAttribute<User, String> password;
	public static volatile SingularAttribute<User, String> login;
	public static volatile SingularAttribute<User, Long> userId;

	public static final String PASSWORD = "password";
	public static final String LOGIN = "login";
	public static final String USER_ID = "userId";

}

