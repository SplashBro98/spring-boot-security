package com.epam.bootsecurity.metamodel;

import com.epam.bootsecurity.entity.Feature;
import com.epam.bootsecurity.entity.Hotel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Hotel.class)
public abstract class Hotel_ {

	public static volatile SingularAttribute<Hotel, String> website;
	public static volatile SingularAttribute<Hotel, Feature> feature;
	public static volatile SingularAttribute<Hotel, Double> latitude;
	public static volatile SingularAttribute<Hotel, String> name;
	public static volatile SingularAttribute<Hotel, Long> hotelId;
	public static volatile SingularAttribute<Hotel, Integer> stars;
	public static volatile SingularAttribute<Hotel, Double> longitude;

	public static final String WEBSITE = "website";
	public static final String FEATURE = "feature";
	public static final String LATITUDE = "latitude";
	public static final String NAME = "name";
	public static final String HOTEL_ID = "hotelId";
	public static final String STARS = "stars";
	public static final String LONGITUDE = "longitude";

}

