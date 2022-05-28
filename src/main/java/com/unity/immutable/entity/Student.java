package com.unity.immutable.entity;

import java.util.Objects;

public final class Student {

    private final long id;
    private final String studentName;
    private final int age;

    private final Address address;


    public Student(long id, String studentName, int age, Address address) {
        this.id = id;
        this.studentName = studentName;
        this.age = age;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return Address.getInstance(address);
    }

//    public Address getAddress() {
//        return new Address(address);
//    }


//    public Address getAddress() {
//        return new Address(address.getCity(), address.getProvince());
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student strudent = (Student) o;
        return id == strudent.id && age == strudent.age && Objects.equals(studentName, strudent.studentName) && Objects.equals(address, strudent.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, studentName, age, address);
    }

    @Override
    public String toString() {
        return "Strudent{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
