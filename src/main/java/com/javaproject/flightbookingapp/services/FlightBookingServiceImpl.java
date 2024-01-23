//package com.javaproject.flightbookingapp.services;
//
//import com.javaproject.flightbookingapp.domain.FlightBooking;
//import com.javaproject.flightbookingapp.repository.FlightBookingRepository;
//import jakarta.persistence.EntityNotFoundException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.NoSuchElementException;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class FlightBookingServiceImpl implements FlightBookingService {
//
//    @Autowired
//    FlightBookingRepository flightBookingRepository;
//
//    @Override
//    public FlightBooking saveFlight(FlightBooking flightBooking) {
//        return flightBookingRepository.save(flightBooking);
//    }
//
//    @Override
//    public FlightBooking getFlightById(long id) {
//        Optional<FlightBooking> flight = flightBookingRepository.findById(id);
//        return flight.orElseThrow(() -> new NoSuchElementException("Flight not found with id: " + id));
//    }
//
//    @Override
//    public List<FlightBooking> getAllFlights() {
//        return flightBookingRepository.findAll();
//    }
//
//    @Override
//    public FlightBooking updateFlightById(FlightBooking flightBooking) {
//        Optional<FlightBooking> optionalFlightBooking = flightBookingRepository.findById(flightBooking.getId());
//        return optionalFlightBooking.map(updateFlightById -> {
//            updateFlightById.setPassengerFirstName(flightBooking.getPassengerFirstName());
//            updateFlightById.setPassengerLastName(flightBooking.getPassengerLastName());
//            updateFlightById.setPassengerTelephone(flightBooking.getPassengerTelephone());
//            updateFlightById.setPassengerEmail(flightBooking.getPassengerEmail());
//            updateFlightById.setFlightType(flightBooking.getFlightType());
//            updateFlightById.setAirline(flightBooking.getAirline());
//            updateFlightById.setAirline(String.valueOf(flightBooking.getBookingDate()));
//            return flightBookingRepository.save(updateFlightById);
//        }).orElseThrow(() -> new EntityNotFoundException("Flight not found with id: " + flightBooking.getId()));
//    }
//
//    @Override
//    public void deleteFlight(long id) {
//        flightBookingRepository.deleteById(id);
//    }
//}
