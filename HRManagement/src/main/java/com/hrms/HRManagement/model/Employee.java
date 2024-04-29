package com.hrms.HRManagement.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "employee_name", nullable = false)
    private String name;

    @Column(name = "employee_email")
    private String email;

    @Column(name = "employee_contact_number")
    private String contactNumber;

    @Column(name = "employee_education")
    private String educationalQualifications;

    @Column(name = "employee_emergency_number")
    private String emergencyNumber;

    @Column(name = "created_date", nullable = true, updatable = false)
    private Date createdDate;

    public Employee() {
    }

    public Employee(String name, String email, String contactNumber, String educationalQualifications,
            String emergencyNumber, Date createdDate) {
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
        this.educationalQualifications = educationalQualifications;
        this.emergencyNumber = emergencyNumber;
        this.createdDate = createdDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEducationalQualifications() {
        return educationalQualifications;
    }

    public void setEducationalQualifications(String educationalQualifications) {
        this.educationalQualifications = educationalQualifications;
    }

    public String getEmergencyNumber() {
        return emergencyNumber;
    }

    public void setEmergencyNumber(String emergencyNumber) {
        this.emergencyNumber = emergencyNumber;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

}
