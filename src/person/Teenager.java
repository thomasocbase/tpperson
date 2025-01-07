package person;

public class Teenager extends Minor {
    private boolean ownsScooter;

    public Teenager(String name, String surname, int age, String schoolName, boolean ownsScooter) {
        super(name, surname, age, schoolName);
        this.ownsScooter = ownsScooter;
    }

    @Override
    public String move() {
        return "I'm going fast!";
    }

    public String toString() {
        return super.toString() + " (teenager)"
                + (ownsScooter ? ", and I own a scooter" : ", and I don't own a scooter");
    }

    public boolean getOwnsScooter() {
        return ownsScooter;
    }

    public void setOwnsScooter(boolean ownsScooter) {
        this.ownsScooter = ownsScooter;
    }
}
