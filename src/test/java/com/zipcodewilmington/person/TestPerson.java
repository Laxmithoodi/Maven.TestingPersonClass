package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {

    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "Leon";
        Integer expectedAge = 5;


        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }




    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given

        String expectedName = "Leon";
       // String expectedGender = "Male";
        Integer expectedAge = 5;

        // When
        Person person = new Person();


        // Then

        String actualName = person.getName();
       // String actualGender = person.getGender();
        Integer actualAge = person.getAge();


        Assert.assertEquals(expectedName, actualName);
      //  Assert.assertEquals(expectedGender, actualGender);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetGender() {
        // Given
        Person person = new Person();
        String expected = "Male";

        // When
        person.setName(expected);

        // Then
        String actual = person.getGender();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAddress() {
        // Given
        Person person = new Person();
        String expected = "Chadds Ford";

        // When
        person.setName(expected);

        // Then
        String actual = person.getAddress();
        Assert.assertEquals(expected, actual);
    }




    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

}
