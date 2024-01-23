//package com.javaproject.flightbookingapp.controller;
//
//import com.javaproject.flightbookingapp.domain.FlightBooking;
//import com.javaproject.flightbookingapp.services.FlightBookingService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//@Controller
//public class FlightBookingController {
//    @Autowired
//   FlightBookingService flightBookingService;
//
//    @GetMapping("/")
//    public String homepage(Model model) {
//        return "index";
//    }
//
//    @GetMapping("/displayFlightBookingDetails")
//    public String displayFlightBookingDetails(Model model) {
//        model.addAttribute("flightBooking", flightBookingService.getAllFlights());
//        return "dashboard";
//    }
//    @GetMapping("/showNewFlightForm")
//    public String showNewDrinkForm(Model model) {
//        FlightBooking flightBooking = new FlightBooking();
//        model.addAttribute("flightBooking", flightBooking);
//        return "new_flight";
//    }
//
//    @PostMapping("/saveFlightDetails")
//    public String saveFlightDetails(@ModelAttribute("flightBooking") FlightBooking flightBooking, RedirectAttributes redirectAttributes) {
//        try {
//            flightBookingService.saveFlight(flightBooking);
//            redirectAttributes.addFlashAttribute("message", "Flight booked successfully!");
//            redirectAttributes.addFlashAttribute("color", "success");
//        } catch (Exception e) {
//            // Log the exception
//            e.printStackTrace();
//            redirectAttributes.addFlashAttribute("message", "Error saving flight.");
//            redirectAttributes.addFlashAttribute("color", "danger");
//        }
//        return "dashboard";
//    }
//
//    @GetMapping("/showUpdateFlightForm/{id}")
//    public String updateFlightForm(@PathVariable(value = "id") long id, Model model){
//
//        FlightBooking flightBooking = flightBookingService.getFlightById(id);
//        model.addAttribute("flightBooking", flightBooking);
//        return "update_flight_records";
//    }
//
//    @PostMapping("/updateFlight")
//    public String updateFlight(@ModelAttribute("flightBooking") FlightBooking flightBooking, Model model){
//        try {
//            flightBookingService.saveFlight(flightBooking);
//            model.addAttribute("message", "Flight details updated successfully");
//        } catch (Exception e){
//            model.addAttribute("message", "Error updating flight details: " + e.getMessage());
//            model.addAttribute("color", "danger");
//        }
//        return "redirect:/displayFlightBookingDetails";
//    }
//
//@GetMapping("deleteFlight/{id}")
//public String deleteFlight(@PathVariable long id, RedirectAttributes redirectAttributes) {
//    try {
//        flightBookingService.deleteFlight(id);
//        redirectAttributes.addFlashAttribute("message", "Flight Details deleted successfully");
//        redirectAttributes.addFlashAttribute("color", "success");
//    } catch (Exception e) {
//        redirectAttributes.addFlashAttribute("message", e.getMessage());
//        redirectAttributes.addFlashAttribute("color", "danger");
//    }
//
//    return "redirect:/displayFlightBookingDetails";
//}
//}