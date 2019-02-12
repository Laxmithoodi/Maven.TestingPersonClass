package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private String gender;

//Default constructor

    public Person() {
        name = "Leon";
        //age = Integer.MAX_VALUE;
        age = 5;
    }


    public Person(int age) {
         this.age = age;
    }

    public Person(String name) {
        this.name = name;
        this.gender = name;

    }


    public Person(String name, int age) {
        this.name = name;
      //  this.gender = gender;
        this.age = age;
    }

    public void setName(String name) {

        this.name = name;
        this.gender = name;
    }


    public void setAge(int age) {
        this.age = age;

    }

    //  Accessor methods

    public String getName() {

        return name;
    }

    public String getGender() {

        return gender;
    }


    public Integer getAge() {

        return age;
    }
}
