package definingClassesI;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DateFirstTryTest {
    DateFirstTry date1, date2;

    @Test
    public void testMonthExists() {
        DateFirstTry date1 = new DateFirstTry("July",4, 2017);
        assertEquals("current month = July ", "July", date1.getMonth());
    }

    @Test
    public void testDayExists() {
        DateFirstTry date1 = new DateFirstTry("July",4, 2017);
        assertEquals("current day = 4" , 4, date1.getDay());
    }

    @Test
    public void testYearExists() {
        DateFirstTry date1 = new DateFirstTry("July",4, 2017);
        assertEquals("current year = 2017 ", 2017, date1.getYear());
    }

}
