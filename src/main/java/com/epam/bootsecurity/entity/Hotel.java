package com.epam.bootsecurity.entity;


import lombok.*;

import javax.persistence.*;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "hotels")
public class Hotel implements AgencyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hotel_id")
    private long hotelId;

    @Column(name = "name")
    private String name;

    @Column(name = "stars")
    private int stars;

    @Column(name = "website")
    private String website;

    @Column(name = "latitude")
    private double latitude;

    @Column(name = "longitude")
    private double longitude;

    @Enumerated(EnumType.STRING)
    @Column(name = "feature")
    private Feature feature;

}
