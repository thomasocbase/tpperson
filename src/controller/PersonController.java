package controller;

import view.PersonView;

public class PersonController {
    PersonView personView;

    public PersonController() {
        personView = new PersonView();
    }

    public void run() {
        int inputAge = personView.chooseAge();
        
    }
}