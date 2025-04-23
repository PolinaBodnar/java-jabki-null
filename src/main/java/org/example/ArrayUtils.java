import java.util.*;

public class ArrayUtils {

    // 1. Печать массива
    public static void printArray(int[] arr) {
        if (arr == null) {
            System.out.println("null");
        } else {
            System.out.println(Arrays.toString(arr));
        }
    }

    // 2. Сумма всех элементов
    public static int sumArray(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Массив не может быть null");
        }
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // 3. Минимальный элемент
    public static int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Массив пуст или null");
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // 4. Месяцы на "М"
    public static List<String> getMonthsStartingWithM() {
        String[] months = {
                "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь",
                "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"
        };
        List<String> result = new ArrayList<>();
        for (String m : months) {
            if (m.startsWith("М")) {
                result.add(m);
            }
        }
        return result;
    }

    // 5. Инвертировать массив
    public static void reverseArray(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    // 6. Есть ли повторы
    public static boolean hasDuplicates(int[] arr) {
        if (arr == null) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // 7. Замена отрицательных на положительные
    public static void absNegatives(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.abs(arr[i]);
        }
    }

    // 8. Массив 3x3 с единицами по диагонали
    public static int[][] createDiagonalMatrix() {
        int[][] matrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            matrix[i][i] = 1;
        }
        return matrix;
    }

    // 9. Сумма всех элементов 2D массива
    public static int sum2DArray(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int val : row) {
                sum += val;
            }
        }
        return sum;
    }

    // 10. Максимум и его координаты
    public static String findAllMaxCoordinates(int[][] matrix) {
        int max = matrix[0][0];
        int row = 0;
        int col = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return "Максимум: " + max + ", координаты: (" + row + ", " + col + ")";
    }

    // 11. Проверка на квадратность
    public static boolean isSquareMatrix(int[][] matrix) {
        if (matrix == null) {
            return false;
        }
        int rows = matrix.length;
        for (int[] row : matrix) {
            if (row.length != rows) {
                return false;
            }
        }
        return true;
    }

    // 12. Сумма по строкам, мин и макс
    public static void analyze2DArray(int[][] matrix) {
        int globalMax = matrix[0][0];
        int globalMin = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int val : matrix[i]) {
                rowSum += val;
                if (val < globalMin) {
                    globalMin = val;
                }
                if (val > globalMax) {
                    globalMax = val;
                }
            }
            System.out.printf("Сумма строки %d: %d%n", i, rowSum);
        }
        System.out.println("Минимум: " + globalMin);
        System.out.println("Максимум: " + globalMax);
    }

    // 13. Четные = 0, нечетные = 1
    public static int[][] fillEvenOddPattern(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ((i + j) % 2 == 0) {
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = 1;
                }
            }
        }
        return matrix;
    }
}
