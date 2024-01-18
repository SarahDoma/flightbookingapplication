/*package com.javaproject.flightbookingapp.controller;

import com.javaproject.flightbookingapp.domain.FlightBooking;
import com.javaproject.flightbookingapp.services.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FlightBookingController {
    @Autowired
   FlightBookingService flightBookingService;

    @GetMapping("/FlightHomepage")
    public String homepage(Model model) {
        model.addAttribute("flightBooking", flightBookingService.getAllFlights());
        return "index";
    }

    @GetMapping("/displayFlightBookingDetails")
    public String displayFlightBookingDetails(Model model) {
        FlightBooking flightBooking = new FlightBooking();
        model.addAttribute("flightBooking", flightBooking);
        return "dashboard";
    }
    @GetMapping("/showNewFlightForm")
    public String showNewDrinkForm(Model model) {
        FlightBooking flightBooking = new FlightBooking();
        model.addAttribute("flightBooking", flightBooking);
        return "dashboard";
    }

    @PostMapping("/saveFlightDetails")
    public String saveFlightDetails(@ModelAttribute("flightBooking") FlightBooking flightBooking) {
        flightBookingService.saveFlight(flightBooking);
        return "dashboard";
    }

    @GetMapping("/updateFlightForm/{id}")
    public String updateFlightForm(@PathVariable(value = "id") long id, Model model){

        FlightBooking flightBooking = flightBookingService.getFlightById(id);
        model.addAttribute("flightBooking", flightBooking);
        return "update_flight_records";
    }

    @PostMapping("/updateFlight")
    public String updateFlight(@ModelAttribute("flightBooking") FlightBooking flightBooking, Model model){
        try {
            flightBookingService.saveFlight(flightBooking);
            model.addAttribute("message", "Flight details updated successfully");
        } catch (Exception e){
            model.addAttribute("message", "Error updating flight details: " + e.getMessage());
            model.addAttribute("color", "danger");
        }
        return "dashboard";
    }

    @GetMapping("/deleteFlight/{id}")
    public String deleteFlight(@PathVariable long id){

        this.flightBookingService.deleteFlightById(id);
        return "dashboard";
    }
}*/