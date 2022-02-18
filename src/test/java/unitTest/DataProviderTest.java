package unitTest;

import Tickets.TicketPrice;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
    @DataProvider(name = "tickets")
    public Object[][] getData(){
        return new Object[][]{
                {1,1000,0.0},
                {5,1000,500.0},
                {25,1000,1000.0},
                {70,1000,800.0},
                {2,1000,0.0},
                {3,1000,500.0},
                {12,500,250.0},
                {13,600,600.0},
                {65,1000,1000.0},
                {66,1000,800.0}
        };
    }


    @Test(dataProvider = "tickets")
    public void testTicket_passenger_depends(int age, int basePrice, double expectedPrice){
        TicketPrice passenger = new TicketPrice(age,basePrice);
        double result = passenger.calculate();
        Assert.assertEquals(result,expectedPrice);
    }


}
