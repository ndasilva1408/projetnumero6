package org.sid.projetnumero6.service;

import org.sid.projetnumero6.dao.MemberRepository;
import org.sid.projetnumero6.dao.RolesRepository;
import org.sid.projetnumero6.dto.MemberDTO;
import org.sid.projetnumero6.entities.Member;
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
    public Member changeRank(String email) {

        Member member = memberRepository.findByEmail(email);

        //List<Roles> rolesList = new ArrayList<Roles>();
        roles= rolesRepository.findRolesByRangEquals("MEMBRE");
        //rolesList.add(roles);
        member.setRole(roles);

        memberRepository.save(member);


        return member;
    }
}
