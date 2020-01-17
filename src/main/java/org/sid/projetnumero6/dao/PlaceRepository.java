package org.sid.projetnumero6.dao;

import org.sid.projetnumero6.entities.Place;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

@RepositoryRestResource

public interface PlaceRepository extends JpaRepository<Place,Long> {

    Place deletePlaceById(Long id);
    Place findByName(String name);
    Place findPlaceById(Long id);

    @Transactional
    Page<Place> findPlaceByNameContainsIgnoreCaseOrRegionContainsIgnoreCase( String name,
                                                                            String region,
                                                                            Pageable pageable);
}
