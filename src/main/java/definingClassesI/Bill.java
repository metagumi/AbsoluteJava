package definingClassesI;

public class Bill {
    private static double RATE = 150.00;
    private int hours;
    private int minutes;
    private double fee;

    public int getHours() {
        return hours;
    }

    private void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    private void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public double getFee() {
        return fee;
    }

    public void inputTimeWorked(int hours, int minutes) {
        setHours(hours);
        setMinutes(minutes);
    }

    private double computeFee(int hoursWorked, int minutesWorked) {
        minutesWorked = hoursWorked*60 + minutesWorked;
        int quaterHours = minutesWorked/15;

        return quaterHours*RATE;
    }

    public void updateFee() {
        fee = computeFee(hours, minutes);
    }

    public void outputBill() {
        System.out.println("Time worked: ");
        System.out.println(hours + " hours and " + minutes + " minutes ");
        System.out.println("Rate " + RATE + " per quater hour.");
        System.out.println("Amount due: $" + fee);
    }
}
