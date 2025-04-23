import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayUtilsTest {

    @Test
    void testSumArray() {
        assertEquals(6, ArrayUtils.sumArray(new int[]{1, 2, 3}));
    }

    @Test
    void testFindMin() {
        assertEquals(-5, ArrayUtils.findMin(new int[]{3, -2, -5, 1}));
    }

    @Test
    void testHasDuplicatesTrue() {
        assertTrue(ArrayUtils.hasDuplicates(new int[]{1, 2, 3, 2}));
    }

    @Test
    void testHasDuplicatesFalse() {
        assertFalse(ArrayUtils.hasDuplicates(new int[]{1, 2, 3}));
    }

    @Test
    void testIsSquareMatrix() {
        assertTrue(ArrayUtils.isSquareMatrix(new int[][]{{1, 0}, {0, 1}}));
        assertFalse(ArrayUtils.isSquareMatrix(new int[][]{{1, 0, 0}, {0, 1}}));
    }

    @Test
    void testAbsNegatives() {
        int[] arr = {-1, 2, -3};
        ArrayUtils.absNegatives(arr);
        assertArrayEquals(new int[]{1, 2, 3}, arr);
    }

    @Test
    void testReverseArray() {
        int[] arr = {1, 2, 3};
        ArrayUtils.reverseArray(arr);
        assertArrayEquals(new int[]{3, 2, 1}, arr);
    }
}

//the end