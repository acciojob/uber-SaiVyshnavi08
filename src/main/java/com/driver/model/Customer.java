//package com.driver.model;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//
//public class Customer{
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//
//    private int CustomerId;
//    private String mobile;
//    private String password;
//
//    @OneToMany(mappedBy ="customer",cascade = CascadeType.ALL)
//    private List<TripBooking> tripBookingList;
//
//    public List<TripBooking> getTripBookingList() {
//        return tripBookingList;
//    }
//
//    public void setTripBookingList(List<TripBooking> tripBookingList) {
//        this.tripBookingList = tripBookingList;
//    }
//
//    public int getCustomerId() {
//        return CustomerId;
//    }
//
//    public void setCustomerId(int customerId) {
//        CustomerId = customerId;
//    }
//
//    public String getMobile() {
//        return mobile;
//    }
//
//    public void setMobile(String mobile) {
//        this.mobile = mobile;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//
//
//    public Customer(String mobile, String password) {
//        this.mobile = mobile;
//        this.password = password;
//    }
//
//    public Customer() {
//    }
//}

package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    private String mobile;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public Customer(){}
    public Customer(int customerId,String mobile,String password){
        setCustomerId(customerId);
        setPassword(password);
        setMobile(mobile);
    }
    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<TripBooking> tripBookingList = new ArrayList<>();

    public List<TripBooking> getTripBookingList() {
        return tripBookingList;
    }

    public void setTripBookingList(List<TripBooking> tripBookingList) {
        this.tripBookingList = tripBookingList;
    }
}