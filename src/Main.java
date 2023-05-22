import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Slot> slots = new ArrayList<>();
        slots.add(new Slot("Friday 23 - saturday 1"));
        slots.add(new Slot("Wednesday 14 - Wednesday 17"));

        Student student = new Student("Omar Esawy", 20, "esawy.doe@example.com", slots);

        student.displayInfo();

        Instructor instructor = new Instructor("Ali Mohamed", "Ali.doe@example.com");

        Slot slot1 = new Slot("Friday 23 - saturday 1");
        instructor.addAvailabilitySlot(slot1);

        Slot slot2 = new Slot("Friday 23 - saturday 1");
        instructor.addAvailabilitySlot(slot2);

        instructor.printInfo();;

    }
}