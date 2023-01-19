package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person person) {
        if (person.getPlace() == "Manchester") {
            return true;
        } else {
            return false;
        }
    }

    public boolean canWatchFilm(Person person, int age) {
        if (age >= 18) {
            return true;
        }
        else {
            return false;
        }
    }
}