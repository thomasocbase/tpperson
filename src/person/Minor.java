package person;

public abstract class Minor extends Person {
   private String schoolName;

    public Minor(String name, String surname, int age, String schoolName) {
        super(name, surname, age);
        this.schoolName = schoolName;
    }

    public abstract String move();

    public String toString() {
        return super.toString() + ", I'm a minor";
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
