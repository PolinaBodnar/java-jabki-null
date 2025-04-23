public class Main {
    public static void main(String[] args) {
        int[] arr = {3, -2, 7, -5, 3};

        System.out.println("1. Печать массива:");
        ArrayUtils.printArray(arr);

        System.out.println("\n2. Сумма массива: " + ArrayUtils.sumArray(arr));

        System.out.println("\n3. Минимум в массиве: " + ArrayUtils.findMin(arr));

        System.out.println("\n4. Месяцы на М:");
        System.out.println(ArrayUtils.getMonthsStartingWithM());

        System.out.println("\n5. Реверс массива:");
        ArrayUtils.reverseArray(arr);
        ArrayUtils.printArray(arr);

        System.out.println("\n6. Есть ли повторы: " + ArrayUtils.hasDuplicates(arr));

        System.out.println("\n7. Заменяем отрицательные на положительные:");
        ArrayUtils.absNegatives(arr);
        ArrayUtils.printArray(arr);

        System.out.println("\n8. Диагональная матрица 3x3:");
        int[][] diag = ArrayUtils.createDiagonalMatrix();
        printMatrix(diag);

        System.out.println("\n9. Сумма 2D массива: " + ArrayUtils.sum2DArray(diag));

        System.out.println("\n10. Максимум и координаты:");
        int[][] myMatrix = {
                {5, 3, 9},
                {4, 9, 1},
                {9, 2, 0}
        };
        System.out.println(ArrayUtils.findAllMaxCoordinates(myMatrix));

        System.out.println("\n11. Квадратный ли массив: " + ArrayUtils.isSquareMatrix(diag));

        System.out.println("\n12. Анализ 2D массива:");
        ArrayUtils.analyze2DArray(diag);

        System.out.println("\n13. Четные = 0, нечетные = 1 (6x6):");
        int[][] pattern = ArrayUtils.fillEvenOddPattern(6, 6);
        printMatrix(pattern);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

//the end