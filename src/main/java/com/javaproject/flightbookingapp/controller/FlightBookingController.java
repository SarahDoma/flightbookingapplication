package com.javaproject.flightbookingapp.controller;

import com.javaproject.flightbookingapp.domain.FlightBooking;
import com.javaproject.flightbookingapp.services.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class FlightBookingController {
    @Autowired
    FlightBookingService flightBookingService;

    @GetMapping("/FlightBookingHomepage")
    public String homePage(Model model) {
        try {
            List<FlightBooking> flightBookings = flightBookingService.getAllFlights();
            model.addAttribute("flight bookings", flightBookings);
        } catch (Exception e) {
            // Log the exception
            e.printStackTrace();
            // Handle the exception if needed
        }
        return "dashboard";
    }

    @GetMapping("/ShowFlightBookingForm")
    public String showHotelForm(Model model){
        model.addAttribute("hotel",new FlightBooking());
        return "New_Flight";

    }

    @PostMapping("/saveFlightBooking")
    public String saveFlightBooking(@ModelAttribute("hotel") FlightBooking flightBooking, RedirectAttributes redirectAttributes) {
        try {
            flightBookingService.saveFlight(flightBooking);
            redirectAttributes.addFlashAttribute("message", "Flight Successfully Booked");
            redirectAttributes.addFlashAttribute("color", "success");
        } catch (Exception e) {
            // Log the exception
            e.printStackTrace();
            redirectAttributes.addFlashAttribute("message", "Error saving flight");
            redirectAttributes.addFlashAttribute("color", "danger");
        }
        return "redirect:/FlightBookingHomePage";
    }

    @GetMapping("/updateFlightBookingData/{id}")
    public String showEditForm(@PathVariable("id") Integer Id, Model model, RedirectAttributes redirectAttributes) {
        try {
            FlightBooking flightBooking = flightBookingService.getFlightById(Id);
            model.addAttribute("flight", flightBooking);
            model.addAttribute("pageTitle", "Edit Flight Id:" + Id);
            return "updateFlightBookingRecord";

        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("message", e.getMessage());
            redirectAttributes.addFlashAttribute("color", "danger");

            return "redirect:/FlightHomepage";
        }
    }
    @PostMapping("/updateFlightBookingRecord")
    public String updateFlightBookingRecord(@ModelAttribute("hotel") FlightBooking flightBooking, RedirectAttributes redirectAttributes){
        try {
            flightBookingService.saveFlight(new FlightBooking());
            redirectAttributes.addFlashAttribute("message", "Flight Record updated successfully");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("message", "Error updating hotel: " + e.getMessage());
        }
        return "redirect:/FlightHomepage";
    }
    @GetMapping("deleteFlight/{id}")
    public String deleteHotel(@PathVariable long id, RedirectAttributes redirectAttributes) {
        try {
            flightBookingService.deleteFlight(id);
            redirectAttributes.addFlashAttribute("message", "Flight Record Deleted successfully");
            redirectAttributes.addFlashAttribute("color", "success");
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("message", e.getMessage());
            redirectAttributes.addFlashAttribute("color", "danger");
        }

        return "redirect:/HotelHomepage";
    }
}

