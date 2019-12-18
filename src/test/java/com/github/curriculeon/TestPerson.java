package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor0(){
        testConstructor(12, "SpeedWind");
    }
    @Test
    public void testConstructor1(){
        testConstructor(99, "MovingShadow");
    }

    @Test
    public void testConstructor2() {
        testConstructor(66, "CrazyStanding");
    }

    @Test
    public void testSetName0(){
        testSetName("Jacky");
    }

    @Test
    public void testSetName1(){
        testSetName("Mike");
    }

    @Test
    public void testSetName2(){
        testSetName("Cain");
    }

    private void testConstructor(long expectedId, String expectedName) {
        Person person = new Person(expectedId, expectedName);

        // when
        long actualId = person.getId();
        String actualName = person.getName();

        //then
        Assert.assertEquals(actualId, expectedId);
        Assert.assertEquals(actualName, expectedName);
    }

    private void testSetName(String expectedName){
        Person person = new Person( 0);
        person.setName(expectedName);

        // when
        String actualName = person.getName();

        //then
        Assert.assertEquals(expectedName, actualName);
    }
}
