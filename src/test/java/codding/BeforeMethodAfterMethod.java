package codding;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeMethodAfterMethod {
	 @BeforeMethod
	 public void beforeMethod() {
	   System.out.println("I will execute before every Method");
	 }
	 
	 @Test
	 public void testCase1() {
	   System.out.println("Test Case 1"); 
	 }
	 
	 @Test
	 public void testCase2() {
	   System.out.println("Test Case 2"); 
	 }

	 @AfterMethod
	 public void afterMethod() {
	   System.out.println("I will execute after every Method");
	 }
	 
	 @BeforeClass
	 public void beforeClass() {
		 System.out.println("I will execute before the Class");
	 }
	 
	 @AfterClass
	 public void afterClass() {
	   System.out.println("I will execute after the Class");
	 }
	 
	 @BeforeTest
	 public void beforeTest() {
	   System.out.println("I will execute before the Test");
	 }
	 
	 @AfterTest
	 public void afterTest() {
	   System.out.println("I will execute after the Test");
	 }
	 @BeforeSuite
	 public void beforeSuite() {
		 System.out.println("I will execute before the Test Suite");
	 }
	 
	 @AfterSuite
	 public void afterSuite() {
	   System.out.println("I will execute after the Test Suite");
	 }
/*@BeforeSuite
	 @BeforeTest
	 @BeforeClass
	 @BeforeMethod
	 @Test
	 @AfterMethod
	 @AfterClass
	 @AfterTest
	 @AfterSuite
	 */
}
