package com.epam.bootsecurity.entity;


import lombok.*;

import javax.persistence.*;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "countries")
public class Country implements AgencyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id")
    private long countryId;

    @Column(name = "name")
    private String name;

    public Country(String name) {
        this.name = name;
    }
}
