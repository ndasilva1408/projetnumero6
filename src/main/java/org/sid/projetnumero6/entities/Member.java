package org.sid.projetnumero6.entities;


import lombok.*;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Future;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Data
@NoArgsConstructor @AllArgsConstructor @ToString
@Getter @Setter

@Entity
public class Member implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )

     Long id;



    @ManyToOne
    @JoinColumn(name = "topo_id")
     TOPO topo;
    @OneToMany
    @JoinColumn(name = "note_id")
    List<Note> noteList;

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
    @Column (name = "climbing_lvl")
     String climbingLvl;
     public Roles role;

     String email;





}
