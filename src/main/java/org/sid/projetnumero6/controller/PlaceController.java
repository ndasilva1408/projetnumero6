package org.sid.projetnumero6.controller;

import org.sid.projetnumero6.dao.PlaceRepository;
import org.sid.projetnumero6.entities.Place;
import org.sid.projetnumero6.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;

@Controller
public class PlaceController {
    @Autowired
    PlaceRepository placeRepository;
    @Autowired
    UserService userService;

    @RequestMapping(value = {"/placeList"}, method = RequestMethod.GET)
    public String viewTOPOlist(ModelMap model,
                               HttpServletRequest request,
                               @RequestParam(name = "page", defaultValue = "0") int p,
                               @RequestParam(name = "size", defaultValue = "8") int s)
            throws ServletException, IOException {

        String nr = request.getParameter("nr");

        if ( nr != null) {

                Page<Place> places = placeRepository.findPlaceByNameContainsIgnoreCaseOrRegionContainsIgnoreCase( nr ,nr , new PageRequest(p, s));
                model.put("placeList", places.getContent());


        } else {

            Page<Place> places = placeRepository.findAll(new PageRequest(p, s));
            model.addAttribute("placeList", places.getContent());

            int[] pages = new int[places.getTotalPages()];
            model.addAttribute("pages", pages);

        }


        return "placeList";

    }


    // Page creation nouvel objet Place
    @RequestMapping(value = "/newPlace", method = RequestMethod.GET)
    public String createPlace() {
        return "createPlace";
    }


    @PostMapping(value = "/saveplace")
    public String saveplace(@Valid Place place, BindingResult bindingResult) {
        place.setTopo(null);

        if (bindingResult.hasErrors())
            return "createPlace";
        if (userService.isPlaceAlreadyPresent(place)) {
            return "createPlace";
        } else {
            placeRepository.save(place);
            return "index";
        }
    }


    //Appel method delete
    @PostMapping(value = "/deletePlace")
    public String deletePlace(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String button = request.getParameter("button");
        Long button2 = Long.parseLong(button);

        placeRepository.deletePlaceById(button2);


        return "index";

    }

    @GetMapping(value = "/detailsPlace")
    public String getPlacebyId(@RequestParam(value = "id", required = false) Long id, Model model) {

        Place place = placeRepository.findPlaceById(id);
        model.addAttribute("place", place);


        return "detailsPlace";
    }


}
