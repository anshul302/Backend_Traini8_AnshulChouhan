package com.traini8.backend.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class AddressDTO {


    @NotNull
    private String detailedAddress;

    @NotNull
    private String city;

    @NotNull
    private String state;

    @NotNull
    @Pattern(regexp = "^[0-9]{6}$", message = "Pincode must be a 6-digit number")
    private String pincode;


    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
