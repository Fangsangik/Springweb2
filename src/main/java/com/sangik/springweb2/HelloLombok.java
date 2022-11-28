package com.sangik.springweb2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HelloLombok {
    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("Sangik");

        String name = helloLombok.getName();
        System.out.println("helloLombok =" + helloLombok);
    }
}
