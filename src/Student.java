import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int age;
    private String email;
    private List<Slot> availabilitySlots;

    public Student(String name, int age, String email, List<Slot> availabilitySlots) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.availabilitySlots = availabilitySlots;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public List<Slot> getAvailabilitySlots() {
        return availabilitySlots;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAvailabilitySlots(List<Slot> availabilitySlots) {
        this.availabilitySlots = availabilitySlots;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Availability Slots:");
        for (Slot slot : availabilitySlots) {
            System.out.println("- " + slot.getNamedStartDay() + " " + slot.getInitialStartHour() + " - " +
                    slot.getNamedEndDay() + " " + slot.getInitialEndHour() + " (Converted Hours: " +
                    slot.getConvertedStartHour() + " - " + slot.getConvertedEndHour() + ")");
        }
    }

}
