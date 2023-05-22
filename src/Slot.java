public class Slot {
    private String slot;
    private String namedStartDay;
    private String namedEndDay;
    private int startDay;
    private int endDay;
    private int initialStartHour;
    private int initialEndHour;
    private int convertedStartHour;
    private int convertedEndHour;

    public Slot(String slot) {
        this.slot = slot;
        parseSlot();
        convertToHourSystem();
    }

    private void parseSlot() {
        String[] splitSlot = slot.split("-");
        String start = splitSlot[0].trim();
        String end = splitSlot[1].trim();

        String[] startParts = start.split(" ");
        namedStartDay = startParts[0].trim();
        startDay = getDayNumber(namedStartDay);
        initialStartHour = Integer.parseInt(startParts[1]);
        String[] endParts = end.split(" ");
        namedEndDay = endParts[0].trim();
        endDay = getDayNumber(namedEndDay);
        initialEndHour = Integer.parseInt(endParts[1]);
    }

    private void convertToHourSystem() {
        convertedStartHour = (startDay - 1) * 24 + initialStartHour;
        convertedEndHour = (endDay - 1) * 24 + initialEndHour;
    }

    private int getDayNumber(String day) {
        switch (day.toLowerCase()) {
            case "friday":
                return 1;
            case "saturday":
                return 2;
            case "sunday":
                return 3;
            case "monday":
                return 4;
            case "tuesday":
                return 5;
            case "wednesday":
                return 6;
            case "thursday":
                return 7;
            default:
                throw new IllegalArgumentException("Invalid day: " + day);
        }
    }

    // Getter methods
    public String getNamedStartDay() {
        return namedStartDay;
    }
    public String getNamedEndDay() {
        return namedEndDay;
    }

    public int getInitialStartHour() {
        return initialStartHour;
    }

    public int getInitialEndHour() {
        return initialEndHour;
    }

    public int getConvertedStartHour() {
        return convertedStartHour;
    }

    public int getConvertedEndHour() {
        return convertedEndHour;
    }
}
