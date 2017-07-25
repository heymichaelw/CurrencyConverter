package application.tests;


import application.Money;
import org.junit.Test;
import static org.junit.Assert.*;

public class SanityTest {
    @Test
    public void SanityTest(){
        assertEquals(5,6);
    }

    @Test
    public void NewMoneyReturnsCorrectAmount(){
        Money newMoney = new Money(2, "EUR");
        Money otherMoney = new Money(12, "JPY");
        Money testMoney = new Money(10, "BTC");
        assertEquals((2*0.86), newMoney.getAmount(), 0.005);
        assertEquals((1 * newMoney.getAmount()), newMoney.toUSD(), 0.005);
        assertEquals(2, newMoney.toEUR(), 0.0005);
        assertEquals(12, otherMoney.toJPY(), 0.0005);
        assertEquals(10, testMoney.toBTC(), 0.00005);

    }
}
