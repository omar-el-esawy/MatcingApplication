import java.util.ArrayList;
import java.util.List;

public class Instructor {
    private String name;
    private String email;
    private List<Slot> availabilitySlots;

    public Instructor(String name, String email) {
        this.name = name;
        this.email = email;
        this.availabilitySlots = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Slot> getAvailabilitySlots() {
        return availabilitySlots;
    }

    public void addAvailabilitySlot(Slot slot) {
        availabilitySlots.add(slot);
    }

    public void removeAvailabilitySlot(Slot slot) {
        availabilitySlots.remove(slot);
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Availability Slots:");
        for (Slot slot : availabilitySlots) {
            System.out.println("- " + slot.getNamedStartDay() + " " + slot.getInitialStartHour() + " - " +
                    slot.getNamedEndDay() + " " + slot.getInitialEndHour());
        }
    }
}
