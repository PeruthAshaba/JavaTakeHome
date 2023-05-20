public class JavaPractice {
   // 1.Write a Java program to swap 2 numbers.
//    public static void main(String[] args){
//        int number1 = 19;
//        int number2 = 21;
//
//        System.out.println("Before swapping:");
//        System.out.println("Number 1: " + number1);
//        System.out.println("Number 2: " + number2);
//        // Swapping logic using a temporary variable
//        int temp = number1;
//        number1 = number2;
//        number2 = temp;
//
//        System.out.println("After swapping:");
//        System.out.println("Number 1: " + number1);
//        System.out.println("Number 2: " + number2);
//    }

    //2.Write a Java program to find the largest of 3 numbers.
//    public static void main(String[] args){
//        int number1 = 20;
//        int number2 = 30;
//        int number3 = 15;
//
//        int largestNumber = number1;
//
//        //The program uses an if statement to compare each number with the current largestNumber.
//        // If a number is greater than the current largestNumber, it becomes the new largestNumber.
//
//        if (number2 > largestNumber){
//            largestNumber = number2;
//        }
//        if (number3 > largestNumber){
//            largestNumber = number3;
//        }
//
//        System.out.println("The largest of 3 numbers is: " + largestNumber);
//
//    }
    //3. Write a Java program to find the factorial of a number.
//    public static void main(String[] args){
//        int number = 8;
//        long factorial = 1;
////The program calculates the factorial of the number using a for loop
//        for (int i = 1; i <= number; i++){
//            factorial *=i;
//        }
//
//        System.out.println("The factorial of " + number + " is: " + factorial);
//
//
//    }

    //4. Write a java program to count the number of digits in a number.
//    public static void main(String[] args){
//        int number = 1234567890;
//        int count = 0;
//
//        // Handling the case for 0 separately
//        if (number == 0) {
//            count = 1;
//        } else {
//            while (number != 0) {
//                number /= 10;
//                count++;
//            }
//        }
//
//        System.out.println("The number of digits is: " + count);
//    }
    //5. Write a java program to count the number of even and odd digits in a number.
//    public static void main(String[] args) {
//        int number = 12345;
//        int evenCount = 0;
//        int oddCount = 0;
//
//        while (number != 0) {
//            int digit = number % 10;
//            if (digit % 2 == 0) {
//                evenCount++;
//            } else {
//                oddCount++;
//            }
//            number /= 10;//The number is then divided by 10 to remove the last digit
//        }
//
//        System.out.println("Number of even digits: " + evenCount);
//        System.out.println("Number of odd digits: " + oddCount);
//    }
    //6.Write a java program to find the sum of elements in an array.
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("The sum of array elements is: " + sum);
    }
}


