package unitTest;

import Tickets.TicketPrice;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TicketTests {
    @Test
    public void testTicket_infant_freePrice(){
        // Given - Arrange - Preconditions
        TicketPrice passenger = new TicketPrice(1,1000);

        // When - Act - Test
        double result = passenger.calculate();

        // Then - Assert - Validating result
        Assert.assertEquals(result,0.0);
    }

    @Test
    public void testTicket_child_halfPrice(){
        TicketPrice passenger = new TicketPrice(5,1000);
        double result = passenger.calculate();
        Assert.assertEquals(result,500.0);
    }

    @Test
    public void testTicket_adult_fullPrice(){
        TicketPrice passenger = new TicketPrice(25,1000);
        double result = passenger.calculate();
        Assert.assertEquals(result,1000.0);
    }
    @Test
    public void testTicket_senior_80percent(){
        TicketPrice passenger = new TicketPrice(70,1000);
        double result = passenger.calculate();
        Assert.assertEquals(result,800.0);
    }

}
