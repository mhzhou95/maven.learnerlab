package com.github.curriculeon;

import java.util.ArrayList;
import java.util.List;

public class People {
    private List<Person> personList = new ArrayList<>();

    public void add (Person person) {
        personList.add(person);
    }

    public Person findById(Long id){
        Integer index= null;
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getId() == id ){
                index = i;
            }
        }
        return personList.get(index);
    }

    public Boolean checkContains(Person person){
        return personList.contains(person);
    }

    public void removePerson(Person person){
        personList.remove(person);
    }

    public void removePerson(Long id){
        int idToInt = id.intValue();
        personList.remove(idToInt);
    }

    public void removeAll(){
        personList.removeAll(personList);
    }

    public int listCount(){
        return personList.size();
    }

    public Person[] listToArray(){
        Person[] arrayPerson = new Person[0];
        return personList.toArray(arrayPerson);
    }


}
