/*package com.javaproject.flightbookingapp.domain;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.List;

@Entity(name="flight")

public class FlightBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String passengerFirstName;
    private String passengerLastName;
    private int passengerTelephone;
    private String passengerEmail;
    private String flightType;
    private String airline;
    private int flightPrice;
    private Date bookingDate;

    @CreationTimestamp
    private Date created_date;

    @UpdateTimestamp
    private Date update_date;

    public FlightBooking() {

    }

    public String getPassengerFirstName() {
        return passengerFirstName;
    }
    public void setPassengerFirstName(String passengerFirstName) {
        this.passengerFirstName = passengerFirstName;
    }
    public String getPassengerLastName() {
        return passengerLastName;
    }
    public void setLastName(String passengerLastName) {
        this.passengerLastName = passengerLastName;
    }
    public int getPassengerTelephone() {
        return passengerTelephone;
    }
    public void setPassengerTelephone(int passengerTelephone) {
        this.passengerTelephone = passengerTelephone;
    }
    public String getPassengerEmail() {
        return passengerEmail;
    }

    public void setPassengerEmail(String passengerEmail) {
        this.passengerEmail = passengerEmail;
    }
    public String getFlightType() {
        return flightType;
    }

    public void setFlightType(String flightType) {
        this.flightType = flightType;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public Date setBookingDate() {
        return bookingDate;
    }

    public int getFlightPrice() {
        return flightPrice;
    }

    public void setFlightPrice(int flightPrice) {
        this.flightPrice = flightPrice;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

     public FlightBooking(String passengerFirstName, String passengerLastName, int passengerTelephone, String passengerEmail, String flightType, String airline, Date bookingDate, int flightPrice, Long id, Date created_date, Date update_date) {
        this.passengerFirstName = passengerFirstName;
        this.passengerLastName = passengerLastName;
        this.passengerTelephone = passengerTelephone;
        this.passengerEmail = passengerEmail;
        this.flightType = flightType;
        this.airline = airline;
        this.bookingDate = bookingDate;
        this.flightPrice = flightPrice;
        this.id = id;
        this.created_date = created_date;
        this.update_date = update_date;
    }

}*/
