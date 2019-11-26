package org.sid.projetnumero6.dao;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.sid.projetnumero6.dto.BookingDTO;
import org.sid.projetnumero6.entities.Booking;
import org.sid.projetnumero6.entities.Member;
import org.sid.projetnumero6.entities.TOPO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BookingRepository extends JpaRepository<Booking,Long> {

    Booking findBookingsByOwner(Member member);
    Booking findBookingsByTopo(TOPO topo);

}
