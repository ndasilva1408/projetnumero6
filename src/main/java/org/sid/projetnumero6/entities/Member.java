package org.sid.projetnumero6.entities;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

@Entity
public class Member implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;


    @ManyToMany(mappedBy = "member", fetch = FetchType.EAGER)
    List<TOPO> topo = new ArrayList<>();


    @ManyToOne
    Roles role;
    @OneToMany(mappedBy = "member", fetch = FetchType.EAGER)
    List<Note> noteList = new ArrayList<>();
    @OneToMany(mappedBy = "owner", fetch = FetchType.EAGER)
    List<Booking> bookingDemandList;
    @OneToMany(mappedBy = "booker", fetch = FetchType.EAGER)
    List<Booking> bookingList;

    String login;
    String password;
    @Column(name = "birth_date")
    String birthDate;
    @Column(name = "first_name")
    String firstName;
    @Column(name = "last_name")
    String lastName;
    String address;
    @Column(name = "license_number")
    String licenseNumber;
    @Column(name = "climbing_lvl")
    public String climbingLvl;


    String email;


    boolean demandeDePret = false;
    boolean active = true;


}
