package person;

public class Teenager extends Minor {
    private boolean ownsScooter;

    public Teenager(String firstname, String lastname, int age, String schoolName, boolean ownsScooter) {
        super(firstname, lastname, age, schoolName);
        this.ownsScooter = ownsScooter;
    }

    public Teenager() {

    }

    @Override
    public String move() {
        return "He's going fast!";
    }

    public String toString() {
        return super.toString() + " (teenager)"
                + (ownsScooter ? ", and owns a scooter." : ", and doesn't own a scooter.");
    }

    public boolean getOwnsScooter() {
        return ownsScooter;
    }

    public void setOwnsScooter(boolean ownsScooter) {
        this.ownsScooter = ownsScooter;
    }
}
