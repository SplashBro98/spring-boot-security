package com.epam.bootsecurity.metamodel;

import com.epam.bootsecurity.entity.Review;
import com.epam.bootsecurity.entity.Tour;
import com.epam.bootsecurity.entity.User;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Review.class)
public abstract class Review_ {

	public static volatile SingularAttribute<Review, LocalDate> date;
	public static volatile SingularAttribute<Review, String> text;
	public static volatile SingularAttribute<Review, Long> reviewId;
	public static volatile SingularAttribute<Review, User> user;
	public static volatile SingularAttribute<Review, Tour> tour;

	public static final String DATE = "date";
	public static final String TEXT = "text";
	public static final String REVIEW_ID = "reviewId";
	public static final String USER = "user";
	public static final String TOUR = "tour";

}

