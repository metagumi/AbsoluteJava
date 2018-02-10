package definingClassesI;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DateSecondTryTest {
    DateSecondTry date1;

    @Test
    public void testMonthExists() {
        DateSecondTry date1 = new DateSecondTry("July", 4, 2017);
        assertEquals("current month = July ", 7, date1.getMonth());
    }

    @Test
    public void testDayExists() {
        DateSecondTry date1 = new DateSecondTry("July", 4, 2017);
        assertEquals("current day = 4", 4, date1.getDay());
    }

    @Test
    public void testYearExists() {
        DateSecondTry date1 = new DateSecondTry("July", 4, 2017);
        assertEquals("current year = 2017 ", 2017, date1.getYear());
    }
}
