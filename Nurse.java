public class Nurse {
    private String name;

    public Nurse(String name) {
        this.name = name;
    }

    public void assist() {
        System.out.println(name + " is assisting the doctor.");
    }

    public void administerMedicine() {
        System.out.println(name + " is administering medicine.");
    }
}
