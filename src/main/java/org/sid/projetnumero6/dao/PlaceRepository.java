package org.sid.projetnumero6.dao;

import org.sid.projetnumero6.entities.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PlaceRepository extends JpaRepository<Place,Long> {

}
