package person;

public class Child extends Minor {
    private boolean ownsBike;

    public Child() {
        super();
    }

    public Child(String firstname, String lastname, int age, String schoolName, boolean ownsBike) {
        super(firstname, lastname, age, schoolName);
        this.ownsBike = ownsBike;
    }

    @Override
    public String move() {
        return "He's going slowly!";
    }

    public String toString() {
        return super.toString() + " (child)"
                + (ownsBike ? ", and owns a bike" : ", and doesn't own a bike");
    }

    public boolean getOwnsBike() {
        return ownsBike;
    }

    public void setOwnsBike(boolean ownsBike) {
        this.ownsBike = ownsBike;
    }
}
