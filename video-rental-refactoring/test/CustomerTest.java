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
         assertEquals("Rental Record for Test\n	Bridget Jones's Diary	12.0\nAmount owed is 12.0\nYou earned 2 frequent renter points", customerTest.statement()); 
     }

}
