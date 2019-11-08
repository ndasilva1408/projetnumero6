package org.sid.projetnumero6.entities;


import lombok.*;

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
     String birth_date;
     String first_name;
     String last_name;
     String address;
     int license_number;
     String climbing_lvl;
     public Roles role;





}
