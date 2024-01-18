/*package com.javaproject.flightbookingapp.services;

import com.javaproject.flightbookingapp.domain.FlightBooking;
import com.javaproject.flightbookingapp.repository.FlightBookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightBookingServiceImpl implements FlightBookingService {

    @Autowired
    FlightBookingRepository flightBookingRepository;

    @Override
    public FlightBooking saveFlight(FlightBooking flightBooking) {
        return flightBookingRepository.save(flightBooking);
    }

    @Override
    public FlightBooking getFlightById(long id) {
        Optional<FlightBooking> flight = flightBookingRepository.findById(id);
        FlightBooking flightIsAvailable = null;
        if (flight.isPresent()) {
            flightIsAvailable = flight.get();
            return flightIsAvailable;
        } else {
            throw new RuntimeException("This flight is not available");
        }
    }

    @Override
    public List<FlightBooking> getAllFlights() {
        return flightBookingRepository.findAll();
    }

    @Override
    public FlightBooking updateFlightById(FlightBooking flightBooking) {
        Optional<FlightBooking> optionalFlightBooking = flightBookingRepository.findById(flightBooking.getId());
        if (optionalFlightBooking.isPresent()) {
            FlightBooking updateFlightById = optionalFlightBooking.get();
            updateFlightById.setPassengerFirstName(flightBooking.getPassengerFirstName());
            updateFlightById.setLastName(flightBooking.getPassengerLastName());
            updateFlightById.setPassengerTelephone(flightBooking.getPassengerTelephone());
            updateFlightById.setPassengerEmail(flightBooking.getPassengerEmail());
            updateFlightById.setFlightType(flightBooking.getFlightType());
            updateFlightById.setAirline(flightBooking.getAirline());
            flightBookingRepository.save(updateFlightById);

            return updateFlightById;
        } else {
            throw new RuntimeException("This flight is currently not available");
        }
    }

    @Override
    public void deleteFlightById(long id) {
        flightBookingRepository.deleteById(id);
    }
}*/
