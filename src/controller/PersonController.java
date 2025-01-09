package controller;

import helpers.DisplayData;
import model.PersonModel;
import person.Minor;
import person.Person;
import service.PersonService;
import view.PersonView;

public class PersonController {
    PersonView personView;
    PersonModel personModel;
    PersonService personService;

    public PersonController() {
        personView = new PersonView();
        personModel = new PersonModel();
        personService = new PersonService();
    }

    public void run() {
        // Ask person's age
        int inputAge = personView.chooseAge();

        // Ask common information
        String inputFirstName = personView.chooseFirstName();
        String inputLastName = personView.chooseLastName();

        // Create person object
        Person person = personModel.setupPersonObject(inputAge);
        person.setFirstName(inputFirstName);
        person.setLastName(inputLastName);
        person.setAge(inputAge);

        // Ask specific information
        personService.collectSpecificInformation(person);

        // Display person information
        personView.displayPerson(person.toString());
        personView.displayPerson(person.move());
    }
}