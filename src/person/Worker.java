package person;

public class Worker extends Adult {
    private String job;

    public Worker(String firstname, String lastname, int age, boolean hasLicense, String job) {
        super(firstname, lastname, age, hasLicense);
        this.job = job;
    }

    public Worker() {
        super();
    }

    @Override
    public String move() {
        return "I move quite fast but with caution.";
    }

    public String toString() {
        return super.toString() + " I'm a worker, as a " + job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

}