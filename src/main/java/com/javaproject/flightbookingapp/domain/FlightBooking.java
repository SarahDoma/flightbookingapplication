package com.javaproject.flightbookingapp.domain;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

@Entity(name = "flight")
public class FlightBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String passengerFirstName;
    private String passengerLastName;
    private String passengerTelephone;
    private String passengerEmail;
    private String flightType;
    private String airline;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate bookingDate;

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

    public void setPassengerLastName(String passengerLastName) {
        this.passengerLastName = passengerLastName;
    }

    public String getPassengerTelephone() {
        return passengerTelephone;
    }

    public void setPassengerTelephone(String passengerTelephone) {
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
    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

     public FlightBooking(String passengerFirstName, String passengerLastName, String passengerTelephone, String passengerEmail, String flightType, String airline, LocalDate bookingDate, Long id, Date created_date, Date update_date) {
        this.passengerFirstName = passengerFirstName;
        this.passengerLastName = passengerLastName;
        this.passengerTelephone = passengerTelephone;
        this.passengerEmail = passengerEmail;
        this.flightType = flightType;
        this.airline = airline;
        this.id = id;
        this.bookingDate = bookingDate;
        this.created_date = created_date;
        this.update_date = update_date;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    public Date getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }
}
