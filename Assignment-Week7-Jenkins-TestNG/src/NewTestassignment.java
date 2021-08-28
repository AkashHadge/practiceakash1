import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTestassignment {
  @Test
  public void f() {
	  System.out.println("Hello TestNG1");

  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Hello TestNG2");

  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Hello TestNG3");

  }

}
