package view;

import helpers.DisplayData;
import helpers.InputData;

public class PersonView
{
    public int chooseAge()
    {
        DisplayData.displayMessage("Enter the age of the person:");
        return InputData.inputInt(1, 120);
    }

    public String chooseFirstName()
    {
        DisplayData.displayMessage("Enter the first name of the person:");
        return InputData.inputString();
    }

    public String chooseLastName()
    {
        DisplayData.displayMessage("Enter the last name of the person:");
        return InputData.inputString();
    }

    public boolean chooseLicense()
    {
        DisplayData.displayMessage("Does the person have a driver's license? (yes/no)");
        return InputData.inputBoolean();
    }

    public String chooseSchool()
    {
        DisplayData.displayMessage("Enter the name of the school:");
        return InputData.inputString();
    }

    public boolean chooseBike()
    {
        DisplayData.displayMessage("Does the person have a bike? (yes/no)");
        return InputData.inputBoolean();
    }

    public boolean chooseScooter()
    {
        DisplayData.displayMessage("Does the person have a scooter? (yes/no)");
        return InputData.inputBoolean();
    }

    public String chooseHobby()
    {
        DisplayData.displayMessage("Enter the hobby of the person:");
        return InputData.inputString();
    }

    public void displayPerson(String person)
    {
        DisplayData.displayMessage(person);
    }
}
