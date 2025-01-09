package service;

import person.Minor;
import person.Person;
import view.PersonView;

public class PersonService {
    PersonView personView;

    public PersonService() {
        personView = new PersonView();
    }

    public void collectSpecificInformation(Person person) {
        if (person instanceof person.Minor) {
            String school = personView.chooseSchool();
            ((Minor) person).setSchoolName(school);
        } else if (person instanceof person.Adult) {
            boolean hasLicense = personView.chooseLicense();
            ((person.Adult) person).setHasLicense(hasLicense);
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
            String job = personView.chooseJob();
            ((person.Worker) person).setJob(job);
        }

        if (person instanceof person.Retiree) {
            String hobby = personView.chooseHobby();
            ((person.Retiree) person).setHobby(hobby);
        }
    }
}
