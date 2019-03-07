package com.epam.bootsecurity.entity;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;


@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User implements AgencyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private long userId;

    @Column(name = "login", length = 50)
    private String login;

    @Column(name = "password", length = 100)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private Role role;

    @Enumerated(EnumType.STRING)
    @Column(name = "state")
    private State state;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_tour",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "tour_id")
    )
    private List<Tour> tours;


    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

}
