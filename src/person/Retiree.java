package person;

public class Retiree extends Adult {
    private String hobby;

    public Retiree(String name, String surname, int age, boolean hasLicense, String hobby) {
        super(name, surname, age, hasLicense);
        this.hobby = hobby;
    }

    @Override
    public String move() {
        return "I move very slowly.";
    }

    public String toString() {
        return super.toString() + " I'm retired. My hobby is " + hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
