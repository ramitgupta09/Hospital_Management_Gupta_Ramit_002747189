/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.classes;

//import static java.lang.constant.ConstantDescs.NULL;
import java.util.Date;
import javax.swing.JOptionPane;
import java.util.regex.Matcher;

/**
 *
 * @author dotaw
 */
public class Person extends Hospital{
    public String username;
    public String password;
    public String role;
    public String mail;
    private String name;
    private String userAddress;
    private int zipCode;
    private int phone;
    private String gender;
    private Date dateOfBirth;
    private String AccountStatus = "Active";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
//    public void setName(String name) {
//        if(name != null && name.matches("^[A-Za-z]\\w{2,29}$")){
//            this.name = name;
//        }else{
//            JOptionPane.showMessageDialog(null,"Enter a valid name");
//        }
//    }

//    public void setName(String name) {
//        if(name != null && name.matches("^[\\p{L} .'-]+$")){
//            this.name = name;
//        }else{
//            JOptionPane.showMessageDialog(null,"Enter a valid name");
//        }
//    }
    
    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    
//    public void setZipCode(int zipCode) {
//        String zip = String.valueOf(zipCode);
//        if(zip == null ){
//            JOptionPane.showMessageDialog(null, "Enter a valid ZipCode");
//        }else{
//            if(zip.matches("^[0-9]{5}(?:-[0-9]{4})?$")){
//                this.zipCode = zipCode;
//            }
//            }
//        }
//    }
    
    public String getAccountStatus() {
        return AccountStatus;
    }

    public void setAccountStatus(String AccountStatus) {
        this.AccountStatus = AccountStatus;
    }
   
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

//    public void setPassword(String password) {
//        if(password != null && password.matches("^(?=.*\\\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$")){
//            this.password = password;
//        }else{
//            JOptionPane.showMessageDialog(null, "Invalid Password");
//        }
//    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
//    public String setMail(){
//        this.mail = mail;
//    }
//    public void setMail(String mail) {
//        if((mail != null) && mail.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$")){
//           this.mail = mail; 
//        }
//        else{
//            JOptionPane.showMessageDialog(null,"Enter a valid email address");
//        }
//    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    
//    public void setPhone(int phone) {
//        String cell = String.valueOf(phone);
//        if((cell != null) && cell.matches("^((\\\\(\\\\d{3}\\\\))|\\\\d{3})[- ]?\\\\d{3}[- ]?\\\\d{4}$")){
//            this.phone = phone;
//        } else {
//            JOptionPane.showMessageDialog(null, "Enter a valid Phone Number");
//        }
//    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
//    public void setGender(String gender) {
//        if(gender != null &&)){
//            
//        }else{
//            
//        }
//    }
}
