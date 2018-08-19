/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.refactoring.Customer;
import com.refactoring.Movie;
import com.refactoring.Rental;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author raysa
 */
public class CustomerTest {

    Customer customerTest = new Customer("Test");

    Movie movieTestNEW = new Movie("Bridget Jones's Diary", Movie.NEW_RELEASE);
    Movie movieTestREGULAR  = new Movie("Bridget Jones's Diary 2", Movie.REGULAR);
    Movie movieTestCHILDRENS  = new Movie("Bridget Jones's Diary 3", Movie.CHILDRENS);

     @Test
     public void statement() {
         customerTest.addRental(new Rental(movieTestNEW, 4));
         assertEquals("Rental Record for Test\n	Bridget Jones's Diary	12.0\nAmount owed is 12.0\nYou earned 2 frequent renter points", customerTest.statement()); 
     }
}
