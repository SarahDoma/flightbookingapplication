package com.javaproject.flightbookingapp.controller.api;

import com.javaproject.flightbookingapp.domain.FlightBooking;
import com.javaproject.flightbookingapp.services.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/flight")
public class FlightAPI {

    @Autowired
    FlightBookingService flightBookingService;

    @GetMapping
    public ResponseEntity<List<FlightBooking>> getAllFlights() {
        return ResponseEntity.ok().body(flightBookingService.getAllFlights());
    }

    @GetMapping("/{id}")
    public ResponseEntity<FlightBooking> getFlightById(@PathVariable long id) {
        return ResponseEntity.ok().body(flightBookingService.getFlightById(id));
    }

    @PostMapping
    public ResponseEntity<FlightBooking> saveFlight(@RequestBody FlightBooking flightBooking) {
        return ResponseEntity.ok().body(flightBookingService.saveFlight(flightBooking));
    }

    @PutMapping("/{id}")
    public ResponseEntity<FlightBooking> updateFlightBookingRecord(@PathVariable long id, @RequestBody FlightBooking flightBooking) {
        return ResponseEntity.ok().body(flightBookingService.updateFlightBookingRecord(flightBooking));
    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteFlight(@PathVariable long id) {
        flightBookingService.deleteFlight(id);
        return HttpStatus.OK;
    }
}
