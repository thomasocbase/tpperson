package person;

public abstract class Adult extends Person {
    private boolean hasLicense;

    public Adult(String firstname, String lastname, int age, boolean hasLicense) {
        super(firstname, lastname, age);
        this.hasLicense = hasLicense;
    }

    public Adult() {

    }

    public abstract String move();

    public String toString() {
        return super.toString() + (hasLicense ? ", has a driver's license." : ", doesn't have a driver's license.");
    }

    public boolean isHasLicense() {
        return hasLicense;
    }

    public void setHasLicense(boolean hasLicense) {
        this.hasLicense = hasLicense;
    }
}
