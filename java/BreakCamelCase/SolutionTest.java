import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest { 

      /*
       * 1. Arrange
       * 2. Act
       * 3. Assert
      */
      
    @Test
    public void givenTwoWordsSeperate(){
       String expected = "camel Casing";

       String actual = Solution.camelCase("camelCasing");

       assertEquals(expected, actual);
    }

    @Test
    public void givenMixOfUpperAndLowerConsecutiveLetters(){
      String expected = "cam E Lc Asing";

      String actual = Solution.camelCase("camELcAsing");

      assertEquals(expected, actual);
    }

    @Test
    public void givenNonAlphanumericCharacters(){
      String expected = "cam!el C! Ase";

      String actual = Solution.camelCase("cam!elC!Ase");

      assertEquals(expected, actual);
    }
}
