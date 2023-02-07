import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.sparta.BubbleSort;

import java.util.Arrays;

public class UnitTests {

    @Test
    @DisplayName("Sort Array of {9, 2, 4, 5, 8, 3, 1} using bubble sort")
    public void GivenPrimitiveIntArray_SortUsingBubbleTest1(){
        int[] arrayToSort = {9, 2, 4, 5, 8, 3, 1};
        BubbleSort output = new BubbleSort();
        int[] expectedSortedArray = arrayToSort;
        Arrays.sort(expectedSortedArray);
        Assertions.assertEquals(Arrays.toString(expectedSortedArray), Arrays.toString(output.arrToBeSorted(arrayToSort)));
    }

    @Test
    @DisplayName("given a primitive int array of {4, 1213, 7, 5, 90, 3, 1, 20, 76, -2} using bubble sort")
    public void GivenPrimitiveIntArray_SortUsingBubbleTest2(){
        int[] arrayToSort = {4, 1213, 7, 5, 90, 3, 1, 20, 76, -2};
        BubbleSort output = new BubbleSort();
        int[] expectedSortedArray = arrayToSort;
        Arrays.sort(expectedSortedArray);
        Assertions.assertEquals(Arrays.toString(expectedSortedArray), Arrays.toString(output.arrToBeSorted(arrayToSort)));
    }

}
