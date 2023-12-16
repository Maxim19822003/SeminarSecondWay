import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    private List<Goable> runners = new ArrayList<>();
    private List<Swimable> swimmers = new ArrayList<>();
    private List<Flyable> flyers = new ArrayList<>();
    private List<TalkerAnimal> talkers = new ArrayList<>();
    private List<Doctor> doctors = new ArrayList<>();
    private List<Nurse> nurses = new ArrayList<>();

    public void addRunner(Goable runner) {
        runners.add(runner);
    }

    public void addSwimmer(Swimable swimmer) {
        swimmers.add(swimmer);
    }

    public void addFlyer(Flyable flyer) {
        flyers.add(flyer);
    }

    public void addTalker(TalkerAnimal talker) {
        talkers.add(talker);
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addNurse(Nurse nurse) {
        nurses.add(nurse);
    }

    public void getAllRunners() {
        System.out.println("All runners:");
        for (Goable runner : runners) {
            System.out.println("Running at speed: " + runner.getSpeed());
        }
    }

    public void getAllSwimmers() {
        System.out.println("All swimmers:");
        for (Swimable swimmer : swimmers) {
            System.out.println("Swimming at speed: " + swimmer.getSpeed());
        }
    }

    public void getAllFlyers() {
        System.out.println("All flyers:");
        for (Flyable flyer : flyers) {
            System.out.println("Flying at speed: " + flyer.getSpeed());
        }
    }

    public void getAllTalkers() {
        System.out.println("All talkers:");
        for (TalkerAnimal talker : talkers) {
            talker.talk();
        }
    }

    public void treatPatients() {
        System.out.println("Treating patients:");
        for (Doctor doctor : doctors) {
            doctor.diagnose();
            doctor.prescribeMedicine();
        }
        for (Nurse nurse : nurses) {
            nurse.assist();
            nurse.administerMedicine();
        }
    }
}
