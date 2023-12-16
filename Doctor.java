public class Doctor {
    private String name;

    public Doctor(String name) {
        this.name = name;
    }

    public void diagnose() {
        System.out.println(name + " is diagnosing a patient.");
    }

    public void prescribeMedicine() {
        System.out.println(name + " is prescribing medicine.");
    }
}
