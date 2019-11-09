package org.sid.projetnumero6.controller;

import org.sid.projetnumero6.dao.PlaceRepository;
import org.sid.projetnumero6.entities.Place;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;

@Controller
public class PlaceController {
@Autowired
    PlaceRepository placeRepository;

    @RequestMapping(value={"/placeList"},method = RequestMethod.GET)
    public String viewPlaceList(ModelMap model) {

        model.put("placeList",placeRepository.findAll());
        return "placeList";

    }



    // Page creation nouvel objet Place
    @RequestMapping(value="/newPlace",method = RequestMethod.GET)
    public String createPlace (){
        return "createPlace";
    }


    @PostMapping(value="/saveplace")
    public String saveplace(@Valid Place place, BindingResult bindingResult){

        place.setTopo(null);
        place.setNote(null);
        if (bindingResult.hasErrors())
            return "createPlace";
        else
            placeRepository.save(place);
        return "index";
    }





    //Appel method delete
    @PostMapping(value = "/deletePlace")
    public String deletePlace(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String button=request.getParameter("button");
        Long button2= Long.parseLong(button);

        placeRepository.deletePlaceById(button2);


        return "index";

    }


}
