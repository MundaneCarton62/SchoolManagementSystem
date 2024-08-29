package com.colegiolegadomexico.SchoolManagementSystem.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "second_last_name")
    private String secondLastName;

    @Column(name = "email_lm")
    private String emailLm;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "grade")
    private String grade;


    // define constructors
    public Students(){

    }

    public Students(String firstName, String middleName, String lastName, String secondLastName, String emailLm, Date dateOfBirth, String grade) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.secondLastName = secondLastName;
        this.emailLm = emailLm;
        this.dateOfBirth = dateOfBirth;
        this.grade = grade;
    }

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getEmailLm() {
        return emailLm;
    }

    public void setEmailLm(String emailLm) {

    }

    // define to String

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", secondLastName='" + secondLastName + '\'' +
                ", emailLm='" + emailLm + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", grade='" + grade + '\'' +
                '}';
    }
}
