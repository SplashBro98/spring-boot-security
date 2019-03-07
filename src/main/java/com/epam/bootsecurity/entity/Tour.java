package com.epam.bootsecurity.entity;


import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(exclude = "users")
@Entity
@Table(name = "tours")
public class Tour implements AgencyEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tour_id")
    private long tourId;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "duration")
    private int duration;

    @Column(name = "description")
    private String description;

    @Column(name = "cost")
    private BigDecimal cost;

    @Enumerated(EnumType.STRING)
    @Column(name = "tour_type")
    private TourType tourType;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "country_id")
    private Country country;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_tour",
            joinColumns = @JoinColumn(name = "tour_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private List<User> users;

    public void addUser(User user){
        users.add(user);
    }


    public Tour(LocalDate date, int duration, String description,
                BigDecimal cost, TourType tourType, Hotel hotel, Country country) {
        this.date = date;
        this.duration = duration;
        this.description = description;
        this.cost = cost;
        this.tourType = tourType;
        this.hotel = hotel;
        this.country = country;
    }
}
