import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient
  @Test
  void testMostCommonTimeEfficient() {
    //Arrange
    int[] nums = {2, 1, 2, 3, 1, 2};
    //Act
    int actual = Practice.mostCommonTimeEfficient(nums);
    //Assert
    assertEquals(2, actual);
  }

  @Test
  void testMostCommonTimeEfficientAllSameNumbers() {
    //Arrange
    int[] nums = {1,1,1,1,1,1};
    //Act
    int actual = Practice.mostCommonTimeEfficient(nums);
    //Assert
    assertEquals(1, actual);
  }

  @Test
  void testMostCommonTimeEfficientWithNegatives() {
    //Arrange
    int[] nums = {-1, -1, -1, -1, 5, 1};
    //Act
    int actual = Practice.mostCommonTimeEfficient(nums);
    //Assert
    assertEquals(-1, actual);
  }

  @Test
  void testMostCommonTimeEfficientWithLargeNumbers() {
    //Arrange
    int[] nums = {1, 10, 100, 1000, 1000, 1000};
    //Act
    int actual = Practice.mostCommonTimeEfficient(nums);
    //Assert
    assertEquals(1000, actual);
  }
  
  //Practice.mostCommonSpaceEfficient
  @Test
  void testMostCommonSpaceEfficient() {
    //Arrange
    int[] nums = {1,2,3,4,5,5};
    //Act
    int actual = Practice.mostCommonSpaceEfficient(nums);
    //Assert
    assertEquals(5, actual);
  }

  @Test
  void testMostCommonSpaceEfficientAllSameNumbersNegative() {
    //Arrange
    int[] nums = {-1,-1,-1,-1,-1,-1};
    //Act
    int actual = Practice.mostCommonSpaceEfficient(nums);
    //Assert
    assertEquals(-1, actual);
  }

  @Test
  void testMostCommonSpaceEfficientAllSameNumbersPostive() {
    //Arrange
    int[] nums = {5,5,5,5,5};
    //Act
    int actual = Practice.mostCommonSpaceEfficient(nums);
    //Assert
    assertEquals(5, actual);
  }

   @Test
  void testMostCommonSpaceEfficientWithLargeNumbers() {
    //Arrange
    int[] nums = {1, 10, 10, 1000, 1000, 10};
    //Act
    int actual = Practice.mostCommonSpaceEfficient(nums);
    //Assert
    assertEquals(10, actual);
  }

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls
}
