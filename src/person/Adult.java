package person;

public abstract class Adult extends Person {
    private boolean hasLicense;

    public Adult(String name, String surname, int age, boolean hasLicense) {
        super(name, surname, age);
        this.hasLicense = hasLicense;
    }

    public abstract String move();

    public String toString() {
        return super.toString() + (hasLicense ? ", I have a driver's license." : ", I don't have a driver's license.");
    }

    public boolean isHasLicense() {
        return hasLicense;
    }

    public void setHasLicense(boolean hasLicense) {
        this.hasLicense = hasLicense;
    }
}
