package definingClassesI;

public class DateSecondTry {
    private String month;
    private int day;
    private int year;

    DateSecondTry(String month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void wtiteOutput(){
        System.out.println(month + " " + day + ", " + year);    }

    public int getMonth() {
        if (month.equalsIgnoreCase("January"))
            return 1;
        else if (month.equalsIgnoreCase("February"))
            return 2;
        else if (month.equalsIgnoreCase("March"))
            return 3;
        else if (month.equalsIgnoreCase("April"))
            return 4;
        else if (month.equalsIgnoreCase("May"))
            return 5;
        else if (month.equalsIgnoreCase("June"))
            return 6;
        else if (month.equalsIgnoreCase("July"))
            return 7;
        else if (month.equalsIgnoreCase("August"))
            return 8;
        else if (month.equalsIgnoreCase("September"))
            return 9;
        else if (month.equalsIgnoreCase("October"))
            return 10;
        else if (month.equalsIgnoreCase("November"))
            return 11;
        else if (month.equalsIgnoreCase("December"))
            return 12;
        else {
            System.out.println("Fatal Error");
            System.exit(0);
            return 0;
        }
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

}
