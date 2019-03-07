package com.epam.bootsecurity.metamodel;

import com.epam.bootsecurity.entity.Country;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Country.class)
public abstract class Country_ {

	public static volatile SingularAttribute<Country, String> name;
	public static volatile SingularAttribute<Country, Long> countryId;

	public static final String NAME = "name";
	public static final String COUNTRY_ID = "countryId";

}

