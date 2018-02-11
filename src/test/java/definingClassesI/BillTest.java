package definingClassesI;

import org.junit.Test;
import static org.junit.Assert.assertNotEquals;

public class BillTest {
    @Test
    public void hoursWorkedNotNull() {
        Bill yourBillHours = new Bill();
        yourBillHours.inputTimeWorked(40, 30);
        assertNotEquals("Hours worked = ",  0,yourBillHours.getHours());
    }

    @Test
    public void minutesWorkedNotNull() {
       Bill yourBillMinutes = new Bill();
       yourBillMinutes.inputTimeWorked(40, 0);
        assertNotEquals("Minutes worked = ",  30,yourBillMinutes.getMinutes());
    }
}
