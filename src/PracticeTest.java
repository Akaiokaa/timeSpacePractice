import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient
  @Test
  void testmostCommonTimeEfficient() {
    //Arrange
    int[] nums = {2, 1, 2, 3, 1, 2};
    //Act
    int actual = Practice.mostCommonTimeEfficient(nums);
    //Assert
    assertEquals(2, actual);
  }

  @Test
  void testmostCommonTimeEfficientAllSameNumbers() {
    //Arrange
    int[] nums = {1,1,1,1,1,1,};
    //Act
    int actual = Practice.mostCommonTimeEfficient(nums);
    //Assert
    assertEquals(1, actual);
  }

  @Test
  void testmostCommonTimeEfficientWithNegatives() {
    //Arrange
    int[] nums = {-1, -1, -1, -1, 5, 1,};
    //Act
    int actual = Practice.mostCommonTimeEfficient(nums);
    //Assert
    assertEquals(-1, actual);
  }

  @Test
  void testmostCommonTimeEfficientWithLargeNumbers() {
    //Arrange
    int[] nums = {1, 10, 100, 1000, 1000, 1000};
    //Act
    int actual = Practice.mostCommonTimeEfficient(nums);
    //Assert
    assertEquals(1000, actual);
  }

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls
}
