package person;

public class Child extends Minor {
    private boolean ownsBike;

    public Child(String name, String surname, int age, String schoolName, boolean ownsBike) {
        super(name, surname, age, schoolName);
        this.ownsBike = ownsBike;
    }

    @Override
    public String move() {
        return "I'm going slowly!";
    }

    public String toString() {
        return super.toString() + " (child)"
                + (ownsBike ? ", and I own a bike" : ", and I don't own a bike");
    }

    public boolean getOwnsBike() {
        return ownsBike;
    }

    public void setOwnsBike(boolean ownsBike) {
        this.ownsBike = ownsBike;
    }
}
