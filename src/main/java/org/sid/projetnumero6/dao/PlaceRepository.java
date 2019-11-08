package org.sid.projetnumero6.dao;

import org.mapstruct.Mapper;
import org.sid.projetnumero6.dto.PlaceDTO;
import org.sid.projetnumero6.entities.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface PlaceRepository extends JpaRepository<Place,Long> {

    Place deletePlaceById(Long id);

}
