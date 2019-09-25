package org.sid.projetnumero6.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor @AllArgsConstructor @ToString

@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    private TOPO topo;
    private String login;
    private String password;
    private String birth_date;
    private String first_name;
    private String last_name;
    private String address;
    private int license_number;
    private String climbing_lvl;
     //Transient sert pour ne pas enregistre les valeurs des données
    //private String passwordConfirm;




}
