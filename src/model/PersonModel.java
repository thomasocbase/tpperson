package model;

import person.*;

public class PersonModel {

    public Person setupPersonObject(int age) {
        if (age < 13) {
            return new Child();
        } else if (age < 20) {
            return new Teenager();
        } else if (age < 65) {
            return new Worker();
        } else {
            return new Retiree();
        }
    }
}
