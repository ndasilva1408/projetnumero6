package org.sid.projetnumero6.service;

import org.sid.projetnumero6.dao.TOPORepository;
import org.sid.projetnumero6.entities.TOPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TopoServiceImpl implements TopoService {


    @Autowired
    TOPORepository topoRepository;


    @Override
    public TOPO topoRQPR (Long idRQPR) {

        TOPO topo2 = new TOPO();

        TOPO existingTopo = topoRepository.findTOPOById(idRQPR);

        existingTopo = topo2;


        return topo2;
    }



}


