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
public class TOPO implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String name;
    private String date;
    private String region;
    private Long description;
    private Booking booking;
    private Place place;
    private boolean available;
    private User user;


}
