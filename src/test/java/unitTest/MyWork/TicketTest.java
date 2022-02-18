package unitTest.MyWork;

import hwork.tickets.TicketPrice;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TicketTest {
    @Test
    public void testTicket_infant_freePrice(){
        //Given - Arrange - Preconditines
        TicketPrice passenger = new TicketPrice(1, 1000);

        //When - Act - Test
        double result = passenger.calculate();

        //Then - Assert - Validaing result
        Assert.assertEquals(result, 0.0);
    }
    @Test
    public void testTicket_child_halfPrice() {
        TicketPrice passenger = new TicketPrice(5, 1000);
        double result = passenger.calculate();
        Assert.assertEquals(result, 500.0);
    }
    @Test
    public void testTicket_senior_seniorPrice() {
        TicketPrice passenger = new TicketPrice(66, 1000);
        double result = passenger.calculate();
        Assert.assertEquals(result, 800.0);
    }

    @Test
    public void testTicket_adult_seniorPrice() {
        TicketPrice passenger = new TicketPrice(40, 1000);
        double result = passenger.calculate();
        Assert.assertEquals(result, 1000.0);
    }
}
