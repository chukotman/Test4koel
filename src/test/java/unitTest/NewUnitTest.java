package unitTest;

import Tickets.TicketPrice;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewUnitTest {
    @Test
    public void newUnit_infant_freePrice(){
        TicketPrice passenger = new TicketPrice(1,1000);
        double result = passenger.calculate();
        Assert.assertEquals(result,0.0);
    }

    @Test
    public void newUnit_child_halfPrice(){
        TicketPrice passenger = new TicketPrice(5,1000);
        double result = passenger.calculate();
        Assert.assertEquals(result,500.0);
    }
}
