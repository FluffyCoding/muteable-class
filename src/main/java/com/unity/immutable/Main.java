package com.unity.immutable;

import com.unity.immutable.entity.Address;
import com.unity.immutable.entity.Student;

public class Main {
    public static void main(String[] args) {

        var address = new Address("Lahore", "Punjab", "5400");
        var shahzad = new Student(2, "Uzair Faisal", 5, address);

        System.out.println(shahzad);

        Address temper = shahzad.getAddress();
        temper.setCity("Karachi");
        temper.setProvince("Sindh");


        System.out.println(shahzad);
    }
}
