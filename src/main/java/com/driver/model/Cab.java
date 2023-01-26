//package com.driver.model;
//
//import javax.persistence.*;
//
//
//@Entity
//public class Cab {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    private int perKmRate;
//    private Boolean available;
//
//    @OneToOne
//    @JoinColumn
//    private Driver driver;
//
//    public Cab( int perKmRate, Boolean available) {
//
//        this.perKmRate = perKmRate;
//        this.available = available;
//    }
//
//    public Cab() {
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public int getPerKmRate() {
//        return perKmRate;
//    }
//
//    public void setPerKmRate(int perKmRate) {
//        this.perKmRate = perKmRate;
//    }
//
//    public Boolean getAvailable() {
//        return available;
//    }
//
//    public void setAvailable(Boolean available) {
//        this.available = available;
//    }
//
//    public Driver getDriver() {
//        return driver;
//    }
//
//    public void setDriver(Driver driver) {
//        this.driver = driver;
//    }
//
//
//}

package com.driver.model;
import javax.persistence.*;


@Entity
@Table
public class Cab {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int perKmRate;
    private boolean available;

    public int getId() {
        return id;
    }

    public int getPerKmRate() {
        return perKmRate;
    }
    public boolean getAvailable(){
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setPerKmRate(int perKmRate) {
        this.perKmRate = perKmRate;
    }

    public void setId(int id) {
        this.id = id;
    }
    public Cab(){}
    public Cab(int id,int perKmRate,boolean available){
        setId(id);
        setAvailable(available);
        setPerKmRate(perKmRate);
    }
    @OneToOne
    @JoinColumn
    private Driver driver;

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

}
