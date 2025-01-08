package person;

public abstract class Minor extends Person {
   private String schoolName;

    public Minor(String firstname, String lastname, int age, String schoolName) {
        super(firstname, lastname, age);
        this.schoolName = schoolName;
    }

    public Minor() {
        super();
    }

    public abstract String move();

    public String toString() {
        return super.toString() + " is a minor";
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
