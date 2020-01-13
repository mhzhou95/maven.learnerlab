package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestPeople {

    @Test
    public void testAdd0(){
        testAdd( 2L, "SpeedWind");
    }

    @Test
    public void testAdd1(){
        testAdd(8L, "MovingShadow");
    }

    private void testAdd(Long expectedId, String expectedName){
        Person person = new Person(expectedId, expectedName);
        People people = new People();

        // when
        people.add(person);
        Person ifExist = people.findById(expectedId);
        //then
        Assert.assertEquals(ifExist, person);
    }

    @Test
    public void testRemove0(){
        testRemove((long) 23, "Fixation");
    }

    @Test
    public void testRemove1(){
        testRemove((long) 428, "AllInOne");
    }

    private void testRemove(long expectedId, String expectedName) {
        Person person = new Person(expectedId, expectedName);
        People people = new People();

        //when
        people.add(person);
        people.removePerson(person);
        //then
        Assert.assertFalse(people.checkContains(person));
    }

    @Test
    public void findById0(){
        findById( 82L);
    }

    @Test
    public void findById1(){
        findById(234324L);
    }

    private void findById(long expectedId) {
        Person person = new Person(expectedId);
        People people = new People();

        // when
        people.add(person);
        //then
        Assert.assertEquals(people.findById(expectedId), person);
    }
}