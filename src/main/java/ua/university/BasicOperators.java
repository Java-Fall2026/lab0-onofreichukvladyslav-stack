package ua.university;

/**
 * BasicOperators class contains a set of static methods
 * for practicing Java operators, loops, arrays, and branching.
 */
public class BasicOperators {

    /**
     * Returns the sum and average of three integers.
     *
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return double array where [0] is the sum and [1] is the average
     */
    public static double[] sumAndAverage(int a, int b, int c) {
        int sum = a + b + c;
        double[] arr = new double[2];
        arr[0] = sum;
        arr[1] = (double)sum / 3;
        return arr;
    }

    /**
     * Returns the maximum of three integers.
     *
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return the largest of the three values
     */
    public static int maxOfThree(int a, int b, int c) {
        int[] arr = new int[3];
        arr[0] = a; arr[1] = b; arr[2] = c;
        int n = 2;
        int max = 0;
        for (int i = 0; i <= n; ++i){
            if(max < arr[i]) max = arr[i];
        }
        return max;
    }

    /**
     * Returns the corresponding grade letter for a given numeric score.
     * <p>
     * The grading scale is as follows:
     * <ul>
     *     <li>90-100: 'A'</li>
     *     <li>80-89:  'B'</li>
     *     <li>70-79:  'C'</li>
     *     <li>60-69:  'D'</li>
     *     <li>50-59:  'E'</li>
     *     <li>0-49:   'F'</li>
     * </ul>
     *
     * @param score the numeric score, expected to be between 0 and 100 inclusive
     * @return the grade letter corresponding to the given score
     * @throws IllegalArgumentException if {@code score} is less than 0 or greater than 100
     */
    public static char gradeFromScore(int score) {
        char grade = ' ';
        if (score <= 49) grade = 'F';
        else if (score <= 59) grade = 'E';
        else if (score <= 69) grade = 'D';
        else if (score <= 79) grade = 'C';
        else if (score <= 89) grade = 'B';
        else if (score <= 100) grade = 'A';
        return grade;
    }

    /**
     * Returns the English name of the day of the week for a number 1-7,
     * where 1 is Monday and 7 is Sunday.
     * <p>
     * Returned values are exactly:
     * {@code "Monday"}, {@code "Tuesday"}, {@code "Wednesday"},
     * {@code "Thursday"}, {@code "Friday"}, {@code "Saturday"}, {@code "Sunday"}.
     *
     * @param day the day number, from 1 (Monday) to 7 (Sunday)
     * @return the English name of the day
     * @throws IllegalArgumentException if {@code day} is less than 1 or greater than 7
     */
    public static String dayOfWeek(int day) {
        String DayName = " ";
        switch (day){
            case 1: DayName = "Monday"; break;
            case 2: DayName = "Tuesday"; break;
            case 3: DayName = "Wednesday"; break;
            case 4: DayName = "Thursday"; break;
            case 5: DayName = "Friday"; break;
            case 6: DayName = "Saturday"; break;
            case 7: DayName = "Sunday"; break;
        }
        return DayName;
    }

    /**
     * Returns an array counting down from n to 1.
     *
     * @param n the starting value
     * @return an array holding n, n-1, ..., 1; an empty array if {@code n} is 0
     * @throws IllegalArgumentException if {@code n} is negative
     */
    public static int[] countdown(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = n - i;
        }
        return arr;
    }

    /**
     * Returns the factorial of n.
     *
     * @param n the number whose factorial is calculated
     * @return the factorial of {@code n}; 1 when {@code n} is 0
     * @throws IllegalArgumentException if {@code n} is negative
     */
    public static long factorial(int n) {
        int res = 1;
        for (int i = 1; i<=n; res*=i, i++);
        return res;
    }

    /**
     * Returns a reversed copy of the array.
     *
     * @param arr the array to reverse; must not be null
     * @return a new array holding the elements in reverse order;
     *         the argument is left unchanged
     * @throws IllegalArgumentException if {@code arr} is null
     */
    public static int[] reverseArray(int[] arr) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            temp[i] = arr[arr.length - 1 - i];
        }
        return temp;
    }

    /**
     * Returns the sum of all elements in a 2D array (matrix).
     *
     * @param matrix the matrix to sum; must not be null
     * @return the sum of every element; 0 for a matrix with no elements
     * @throws IllegalArgumentException if {@code matrix} is null
     */
    public static int sumMatrix(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                sum += value;
            }
        }
        return sum;
    }

    /**
     * Checks if a string is a palindrome.
     * <p>
     * Comparison is case-sensitive and takes every character into account,
     * including spaces and punctuation.
     *
     * @param s the string to check; must not be null
     * @return {@code true} if {@code s} reads the same forwards and backwards
     * @throws IllegalArgumentException if {@code s} is null
     */
    public static boolean isPalindrome(String s) {
        int first = 0;
        int last = s.length() - 1;

        while (first < last){
            if (s.charAt(first) != s.charAt(last)) return false;
            first++;
            last--;
        }
        return true;
    }

    /**
     * Returns the minimum and maximum of an array.
     *
     * @param arr the array to scan; must not be null or empty
     * @return double-element array where [0] is the minimum and [1] is the maximum
     * @throws IllegalArgumentException if {@code arr} is null or empty
     */
    public static int[] findMinMax(int[] arr) {
        int max = 0;
        int min = 0;
        for (int i = 0; i < arr.length; i++){
            if (max <= arr[i]) max = arr[i];
            if (min > arr[i]) min = arr[i];
        }
        return new int[]{min, max};
    }

    /**
     * Returns an n x n multiplication table.
     * <p>
     * The element at row i and column j holds the product (i + 1) * (j + 1).
     *
     * @param n the size of the table
     * @return a matrix of n rows by n columns
     * @throws IllegalArgumentException if {@code n} is less than 1
     */
    public static int[][] multiplicationTable(int n) {
        int[][] table = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }

    /**
     * Returns all even numbers from 2 up to and including n.
     *
     * @param n the upper bound, inclusive
     * @return an array of even numbers in ascending order;
     *         an empty array if {@code n} is less than 2
     */
    public static int[] evenNumbersUpToN(int n) {
        int[] nums = new int[n / 2];
        for(int i = 0; i < nums.length; i++){
            nums[i] = 2 * (i + 1);
        }
        return nums;
    }

    /**
     * Checks if a number is prime.
     *
     * @param n the number to check
     * @return {@code true} if {@code n} is prime;
     *         {@code false} for any {@code n} less than 2
     */
    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i < n; i++){
            if (n % i == 0) return false;
        }
        return true;
    }

    /**
     * Counts vowels in a string.
     * <p>
     * Only the Latin vowels a, e, i, o, u are counted, in both lower
     * and upper case. The letter y is not counted.
     *
     * @param s the string to scan; must not be null
     * @return the number of vowels found
     * @throws IllegalArgumentException if {@code s} is null
     */
    public static int countVowels(String s) {
        s = s.toLowerCase();
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') count++;
        }
        return count;
    }

    /**
     * Returns the first n Fibonacci numbers, starting with 0 and 1.
     *
     * @param n how many numbers to return
     * @return an array holding 0, 1, 1, 2, 3, ... of length {@code n};
     *         an empty array if {@code n} is 0
     * @throws IllegalArgumentException if {@code n} is negative
     */
    public static int[] fibonacci(int n) {
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < n; i++)
        {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }

    /**
     * Returns the transpose of a 2D array (matrix).
     *
     * @param matrix a rectangular matrix; must not be null
     * @return a new matrix where rows and columns are swapped;
     *         the argument is left unchanged
     * @throws IllegalArgumentException if {@code matrix} is null
     */
    public static int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;


        int[][] transpose = new int[n][m];
        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    /**
     * Returns a sorted copy of the array in ascending order.
     *
     * @param arr the array to sort; must not be null
     * @return a new array holding the elements in ascending order;
     *         the argument is left unchanged
     * @throws IllegalArgumentException if {@code arr} is null
     */
    public static int[] sortArray(int[] arr) {
        int[] temp = arr.clone();
        java.util.Arrays.sort(temp);
        return temp;
    }
}