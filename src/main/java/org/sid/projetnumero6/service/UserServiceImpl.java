package org.sid.projetnumero6.service;

import org.sid.projetnumero6.dao.MemberRepository;
import org.sid.projetnumero6.dao.PlaceRepository;
import org.sid.projetnumero6.dao.RolesRepository;
import org.sid.projetnumero6.dto.MemberDTO;
import org.sid.projetnumero6.entities.Member;
import org.sid.projetnumero6.entities.Place;
import org.sid.projetnumero6.entities.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    MemberRepository memberRepository;
    @Autowired
    RolesRepository rolesRepository;
    @Autowired
    PlaceRepository placeRepository;

    Roles roles;


    @Override
    public boolean isMemberAlreadyPresent(Member member) {
        boolean isMemberAlreadyPresent = false;
        Member existingMember = memberRepository.findByLogin(member.getLogin());
        //Si le membre est trouve dans la db, c'est qu'il éxiste déjà
        if(existingMember!=null){
            isMemberAlreadyPresent=true;
        }

        return isMemberAlreadyPresent;
    }
    @Override
    public boolean isPlaceAlreadyPresent(Place place) {
        boolean isPlaceAlreadyPresent = false;
        Place existingPlace = placeRepository.findByName(place.getName());
        if (existingPlace!=null){
            isPlaceAlreadyPresent=true;
        }
        return isPlaceAlreadyPresent;
    }

    @Override
    public Member changeRank(String email) {

        Member member = memberRepository.findByEmail(email);

        roles= rolesRepository.findRolesByRangEquals("MEMBRE");
        member.setRole(roles);

        memberRepository.save(member);


        return member;
    }
}
