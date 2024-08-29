package com.colegiolegadomexico.SchoolManagementSystem.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name ="staff")
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "position")
    private String position;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "second_last_name")
    private String secondLastName;

    @Column(name = "hire_date")
    private Date hireDate;

    @Column(name = "email_lm")
    private String emailLm;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    // define constructors
    public Staff(){

    }

    public Staff(String position, String firstName, String middleName, String lastName,
                 String secondLastName, Date hireDate, String emailLm, Date dateOfBirth) {
        this.position = position;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.secondLastName = secondLastName;
        this.hireDate = hireDate;
        this.emailLm = emailLm;
        this.dateOfBirth = dateOfBirth;
    }


    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSecondLastName() {
        return secondLastName;
    }

    public void setSecondLastName(String secondLastName) {
        this.secondLastName = secondLastName;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getEmailLm() {
        return emailLm;
    }

    public void setEmailLm(String emailLm) {
        this.emailLm = emailLm;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    //define toString

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", position='" + position + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", secondLastName='" + secondLastName + '\'' +
                ", hireDate=" + hireDate +
                ", emailLm='" + emailLm + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
