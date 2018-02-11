package definingClassesI;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DateThirdTryTest {

//    DateThirdTry date1 = new DateThirdTry();
 //   date1.setDate(7, 4, 2017);

    @Test
    public void testMonthExists() {
        DateThirdTry date1 = new DateThirdTry();
        date1.setDate(7, 4, 2017);
        assertEquals("current month = July ", "July", date1.getMonth());
    }

    @Test
    public void testDayExists() {
        DateThirdTry date1 = new DateThirdTry();
        date1.setDate(7, 4, 2017);
        assertEquals("current day = 4", 4, date1.getDay());
    }

    @Test
    public void testYearExists() {
        DateThirdTry date1 = new DateThirdTry();
        date1.setDate(7, 4, 2017);
        assertEquals("current year = 2017 ", 2017, date1.getYear());
    }

}
