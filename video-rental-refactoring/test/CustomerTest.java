
import com.refactoring.Customer;
import com.refactoring.Movie;
import com.refactoring.Rental;
import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerTest {

    Customer customerTest = new Customer("Test");

    Movie movieTestNEW = new Movie("Bridget Jones's Diary", Movie.NEW_RELEASE);

    @Test
    public void statementTest() {
        customerTest.addRental(new Rental(movieTestNEW, 4));
        assertEquals("<H1>Rentals for <EM>Test</EM></H1><P>\n"
                + "Bridget Jones's Diary: 12.0<BR>\n"
                + "<P>You owe <EM>12.0</EM><P>\n"
                + "On this rental you earned <EM>2</EM> frequent renter points<P>", customerTest.htmlStatement());
    }

}
