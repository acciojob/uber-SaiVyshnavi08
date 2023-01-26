//package com.driver.model;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//
//public class Admin{
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int adminId;
//    private String username;
//    private String password;
//
//    public Admin() {
//    }
//
//    public Admin( String username, String password) {
//
//        this.username = username;
//        this.password = password;
//    }
//
//    public int getAdminId() {
//        return adminId;
//    }
//
//    public void setAdminId(int adminId) {
//        this.adminId = adminId;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//}

package com.driver.model;
import javax.persistence.*;

@Entity
@Table
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int adminId;
    private String username;
    private String password;
    public Admin(int adminId,String userName,String password){
        this.adminId=adminId;
        this.username=userName;
        this.password=password;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String userName) {
        this.username = userName;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }
    public Admin(){}

}