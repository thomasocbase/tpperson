package person;

public class Retiree extends Adult {
    private String hobby;

    public Retiree(String firstname, String lastname, int age, boolean hasLicense, String hobby) {
        super(firstname, lastname, age, hasLicense);
        this.hobby = hobby;
    }

    public Retiree() {

    }

    @Override
    public String move() {
        return "He moves very slowly.";
    }

    public String toString() {
        return super.toString() + " He is retired. His hobby is " + hobby + ".";
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}