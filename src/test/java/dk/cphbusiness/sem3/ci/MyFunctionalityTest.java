package dk.cphbusiness.sem3.ci;

import dk.cphbusiness.sem3.ci.MyFunctionality;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author jens
 */
public class MyFunctionalityTest {

  @Test
  public void testFunctionality() {
    assertEquals(11, MyFunctionality.giveMeTen());
  }

}
