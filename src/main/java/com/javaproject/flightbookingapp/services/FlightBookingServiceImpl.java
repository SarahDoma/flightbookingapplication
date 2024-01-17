package com.javaproject.flightbookingapp.services;

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
    }*/

    /*@Override
    public FlightBooking getHotelById(long Id) {
        return null;
    }

    @Override
    public List<FlightBooking> getAllFlights() {
        return flightBookingRepository.findAll();
    }

    @Override
    public FlightBooking update(FlightBooking flightBooking) {
        return null;
    }

    @Override
    public FlightBooking updateFlightBookingRecord(FlightBooking flightBooking) {
        Optional<FlightBooking> optionalFlightBooking = flightBookingRepository.findById(flightBooking.getId());
        if (optionalFlightBooking.isPresent()) {
            FlightBooking updateFlightBookingRecord = optionalFlightBooking.get();
            updateFlightBookingRecord.setPassengerFirstName(flightBooking.getPassengerFirstName());
            updateFlightBookingRecord.setLastName(flightBooking.getPassengerLastName());
            updateFlightBookingRecord.setPassengerTelephone(flightBooking.getPassengerTelephone());
            updateFlightBookingRecord.setPassengerEmail(flightBooking.getPassengerEmail());
            updateFlightBookingRecord.setFlightType(flightBooking.getFlightType());
            updateFlightBookingRecord.setAirline(flightBooking.getAirline());
            flightBookingRepository.save(updateFlightBookingRecord);

            return updateFlightBookingRecord;
        } else {
            throw new RuntimeException("This flight is currently not available");
        }
    }

    @Override
    public void deleteFlight(long id) {
        flightBookingRepository.deleteById(id);
    }
}
