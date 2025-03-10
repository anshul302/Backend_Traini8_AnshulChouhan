package com.traini8.backend.entity;

import jakarta.persistence.*;


import java.util.List;



@Entity
public class TrainingCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 40)
    private String CenterName;

    @Column(nullable = false,unique = true,length=12)
    private String CenterCode;

    @Embedded
    private Address address;

    private Integer StudentCapacity;

    private List<String> CouresesOffer;

    private long CreatedOn;

    @Column
    private String ContactEmail;

    @Column(nullable = false)
    private String ContactPhone;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCenterName() {
        return CenterName;
    }

    public void setCenterName(String centerName) {
        CenterName = centerName;
    }

    public String getCenterCode() {
        return CenterCode;
    }

    public void setCenterCode(String centerCode) {
        CenterCode = centerCode;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Integer getStudentCapacity() {
        return StudentCapacity;
    }

    public void setStudentCapacity(Integer studentCapacity) {
        StudentCapacity = studentCapacity;
    }

    public List<String> getCouresesOffer() {
        return CouresesOffer;
    }

    public void setCouresesOffer(List<String> couresesOffer) {
        CouresesOffer = couresesOffer;
    }

    public long getCreatedOn() {
        return CreatedOn;
    }

    public void setCreatedOn(long createdOn) {
        CreatedOn = createdOn;
    }

    public String getContactEmail() {
        return ContactEmail;
    }

    public void setContactEmail(String contactEmail) {
        ContactEmail = contactEmail;
    }

    public String getContactPhone() {
        return ContactPhone;
    }

    public void setContactPhone(String contactPhone) {
        ContactPhone = contactPhone;
    }
}
