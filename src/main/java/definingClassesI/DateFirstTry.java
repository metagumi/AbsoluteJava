package definingClassesI;

public class DateFirstTry {
    private String month;
    private int day;
    private int year;

    DateFirstTry(String month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void wtiteOutput(){
        System.out.println(month + " " + day + ", " + year);    }

    public String getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }
}
