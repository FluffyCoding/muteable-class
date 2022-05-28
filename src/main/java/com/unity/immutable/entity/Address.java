package com.unity.immutable.entity;

public class Address {
    private String city;
    private String province;

    private String zipCode;

    public Address(String city, String province, String zipCode) {
        this.city = city;
        this.province = province;
        this.zipCode = zipCode;
    }

    public Address(Address address) {
        this(address.getCity(), address.getProvince(), address.getZipCode());
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }


    static Address getInstance(Address address) {
        return new Address(address.getCity(), address.getProvince(), address.getZipCode());
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
