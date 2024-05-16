
package com.mycompany.supperclass;


public class Person {
        double average;
        private String name;
        private String lastname;
        private String id;
        private int age;

    public Person(double average,String name, String lastname, String id, int age) {
        this.name = name;
        this.lastname = lastname;
        this.id = id;
        this.age = age;
        this.average=average;
    }

    public Person(double average) {
        this.average = average;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
        
    }    



