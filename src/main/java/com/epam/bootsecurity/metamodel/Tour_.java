package com.epam.bootsecurity.metamodel;

import com.epam.bootsecurity.entity.Country;
import com.epam.bootsecurity.entity.Hotel;
import com.epam.bootsecurity.entity.Tour;
import com.epam.bootsecurity.entity.TourType;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.time.LocalDate;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Tour.class)
public abstract class Tour_ {

	public static volatile SingularAttribute<Tour, LocalDate> date;
	public static volatile SingularAttribute<Tour, Integer> duration;
	public static volatile SingularAttribute<Tour, Country> country;
	public static volatile SingularAttribute<Tour, BigDecimal> cost;
	public static volatile SingularAttribute<Tour, TourType> tourType;
	public static volatile SingularAttribute<Tour, Long> tourId;
	public static volatile SingularAttribute<Tour, String> description;
	public static volatile SingularAttribute<Tour, Hotel> hotel;

	public static final String DATE = "date";
	public static final String DURATION = "duration";
	public static final String COUNTRY = "country";
	public static final String COST = "cost";
	public static final String TOUR_TYPE = "tourType";
	public static final String TOUR_ID = "tourId";
	public static final String DESCRIPTION = "description";
	public static final String HOTEL = "hotel";

}

