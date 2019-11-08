package org.sid.projetnumero6.entities;

public enum Roles {ADMIN("Admin"),MEMBRE("Membre"),INVITE("Invite");

     String abreviation ;

     Roles(String abreviation) {
        this.abreviation = abreviation ;
    }

    public String getAbreviation() {
        return  this.abreviation ;
    }  }

