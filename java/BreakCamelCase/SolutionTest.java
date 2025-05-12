import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class SolutionTest {

  /*
   * 1. Arrange
   * 2. Act
   * 3. Assert
   */

  private final String input;
  private final String expected;

  // Constructor to initialize test parameters
  public SolutionTest(String input, String expected) {
    this.input = input;
    this.expected = expected;

  }

  @Parameterized.Parameters
  public static Collection<Object[]> testData() {
    List<Object[]> list = Arrays.asList(new Object[][] {
        { "camelCasing", "camel Casing" },
        { "camELcAsing", "cam ELc Asing" }, // I dont know what we are expecting here
        { "cam!elC!Ase", "cam!el C! Ase" },
        { "parseHTMLDocument", "parse HTML Document" }

    });
    return list;
  }

  @Test
  public void testCamelCase() {
    assertEquals(expected, Solution.camelCase(input));
  }

  /*
   * Either need to group by capital capital letters or by spacing out all capital
   * letters and grouping before a lowercase
   * Cant do both
   * 
   * Are we grouping all caps together? or just spacing by lowercase letters that are followed by all caps?
   */

}
