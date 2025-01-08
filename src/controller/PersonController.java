package controller;

import helpers.DisplayData;
import model.PersonModel;
import person.Minor;
import person.Person;
import view.PersonView;

public class PersonController {
    PersonView personView;
    PersonModel personModel;

    public PersonController() {
        personView = new PersonView();
        personModel = new PersonModel();
    }

    public void run() {
        // Ask for the person's age
        int inputAge = personView.chooseAge();

        String inputFirstName = personView.chooseFirstName();
        String inputLastName = personView.chooseLastName();

        Person person = personModel.setupPersonObject(inputAge);
        person.setFirstName(inputFirstName);
        person.setLastName(inputLastName);
        person.setAge(inputAge);

        if (person instanceof person.Minor) {
            String school = personView.chooseSchool();
            ((Minor) person).setSchoolName(school);
        } else if (person instanceof person.Worker) {
            boolean hasLicense = personView.chooseLicense();
            ((person.Worker) person).setHasLicense(hasLicense);
        }

        if (person instanceof person.Child) {
            boolean hasBike = personView.chooseBike();
            ((person.Child) person).setOwnsBike(hasBike);
        }

        if (person instanceof person.Teenager) {
            boolean hasScooter = personView.chooseScooter();
            ((person.Teenager) person).setOwnsScooter(hasScooter);
        }

        if (person instanceof person.Worker) {
            boolean hasLicense = personView.chooseLicense();
            ((person.Worker) person).setHasLicense(hasLicense);
        }

        if (person instanceof person.Retiree) {
            String hobby = personView.chooseHobby();
            ((person.Retiree) person).setHobby(hobby);
        }

        personView.displayPerson(person.toString());

    }
}