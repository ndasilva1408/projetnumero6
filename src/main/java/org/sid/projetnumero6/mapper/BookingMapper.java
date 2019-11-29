package org.sid.projetnumero6.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.sid.projetnumero6.dto.BookingDTO;
import org.sid.projetnumero6.entities.Booking;
import org.sid.projetnumero6.entities.Member;

@Mapper
public interface BookingMapper  {

    @Mapping(target = "member", source = "owner")






    BookingDTO toBooking(Booking entity);

    @Mapping(target = "owner", source = "member")



    Booking toDTO(BookingDTO dto);






}
