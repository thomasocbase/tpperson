package model;

import person.*;

public class PersonModel {

    public Person setupPersonObject(int age) {
        if (age < 12) {
            return new Child();
        } else if (age < 18) {
            return new Teenager();
        } else if (age < 62) {
            return new Worker();
        } else {
            return new Retiree();
        }
    }
}
