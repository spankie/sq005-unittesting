package decagon;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

/**
 * Unit test for simple App.
 * 
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldCreateBankCorrectly()
    {
        Bank b = new Bank();
        assertNotNull(b);
        assertNotNull(b.getTransactions());
        assertNotNull(b.getCustomers());
    }

    @Test
    public void shouldAddCustomerCorrectly()
    {
        Bank b = new Bank();
        Customer c = new Customer(1, "Dee");
        b.AddCustomer(c);
        assertNotNull(b.getCustomers());
        assertEquals(1, b.getCustomers().size());
    }

    @Test
    public void shouldNotAddCustomerWithTheSameID()
    {
        Bank b = new Bank();
        Customer c = new Customer(1, "Dee");
        Customer c2 = new Customer(1, "Spankie");
        b.AddCustomer(c);
        b.AddCustomer(c2);
        assertNotNull(b.getCustomers());
        assertEquals(1, b.getCustomers().size());
    }

    @Test
    public void shouldNotAddIncorrectTypeOfTransaction()
    {
        Bank b = new Bank();
        Customer c = new Customer(1, "Spankie");
        b.AddCustomer(c);
        Transaction t = new Transaction(1, c.getId(), "dep", 3000); // should not add this...
        b.AddTransaction(c.getId(), t);
        List<Transaction> ct = b.getCustomerTransactions(c.getId());
        assertNotNull(ct);
        assertEquals(1, ct.size());
    }
}
