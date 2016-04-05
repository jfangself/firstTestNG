package firstTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FirstNGTest {
  @Test
  public void f1() {
	  System.out.println("f1");
	  Reporter.log("reporter.log");
  }
  @Test
  public void f2() {
	  System.out.println("f2");
  }
  @Test
  public void f3() {
	  System.out.println("f3");
  }
  @Test
  public void f4() {
	  System.out.println("f4");
  }
  @Test
  public void f5() {
	  System.out.println("f5");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("aftermethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test");
  }

}
