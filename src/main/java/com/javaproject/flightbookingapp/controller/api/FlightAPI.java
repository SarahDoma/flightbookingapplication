/*package com.javaproject.flightbookingapp.controller.api;

import com.javaproject.flightbookingapp.domain.FlightBooking;
import com.javaproject.flightbookingapp.repository.FlightBookingRepository;
import com.javaproject.flightbookingapp.services.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class FlightAPI {

    @Autowired
    FlightBookingRepository flightBookingRepository;

    @Autowired
    FlightBookingService flightBookingService;

    @RequestMapping("/flightBooking")
    @GetMapping("/flightBooking")
    public ResponseEntity<List<FlightBooking>> getAllFlightBooking(){
        return ResponseEntity.ok().body(flightBookingService.getAllFlights());
    }

    @RequestMapping("/flightBooking/id")
    @GetMapping
    public ResponseEntity<FlightBooking> getFlightById(@PathVariable long id) {
        return ResponseEntity.ok().body(flightBookingService.getFlightById(id));
    }

    @PostMapping("/flightBooking")
    @GetMapping
    public ResponseEntity<FlightBooking> createDrink(@RequestBody FlightBooking flightBooking) {
        return ResponseEntity.ok().body(flightBookingService.saveFlight(flightBooking));
    }

    @PutMapping("/flightBooking/{id}")
    public ResponseEntity<FlightBooking> updateFlightBooking(@PathVariable long id, @RequestBody FlightBooking flightBooking) {
        return ResponseEntity.ok().body(flightBookingService.updateFlightById(flightBooking));
    }

    @DeleteMapping("/flightBooking/{id}")
    public HttpStatus deleteFlight(@PathVariable long id) {
        flightBookingService.deleteFlightById(id);
        return HttpStatus.OK;
    }
}
*/