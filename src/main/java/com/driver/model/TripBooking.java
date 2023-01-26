package com.driver.model;

import javax.persistence.*;

@Entity
public class TripBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tripBookingId;
    private String FromLocation;
    private String ToLocation;
    private int DistanceInKm;


@Enumerated(value = EnumType.STRING)
    private TripStatus status;
    private int bill;

  @ManyToOne
    @JoinColumn
    private Driver driver;

   @ManyToOne
    @JoinColumn
    private Customer customer;

    public TripBooking(String fromLocation, String toLocation, int distanceInKm, TripStatus status) {
        this.FromLocation = fromLocation;
        this.ToLocation = toLocation;
        this.DistanceInKm = distanceInKm;
        this.status = status;
    }

    public int getTripBookingId() {
        return tripBookingId;
    }

    public void setTripBookingId(int tripBookingId) {
        this.tripBookingId = tripBookingId;
    }

    public String getFromLocation() {
        return FromLocation;
    }

    public void setFromLocation(String fromLocation) {
        FromLocation = fromLocation;
    }

    public String getToLocation() {
        return ToLocation;
    }

    public void setToLocation(String toLocation) {
        ToLocation = toLocation;
    }

    public int getDistanceInKm() {
        return DistanceInKm;
    }

    public void setDistanceInKm(int distanceInKm) {
        DistanceInKm = distanceInKm;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public TripStatus getStatus() {
        return status;
    }

    public void setStatus(TripStatus status) {
        this.status = status;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public TripBooking() {
    }
}