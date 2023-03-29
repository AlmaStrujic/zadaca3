import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

//        // ZADATAK 1 - Array length and elements entry
//        System.out.println("How many elements will your array contain?");
//        int desiredArray = reader.nextInt();
//        int[] arrayLength = new int[desiredArray];
//        System.out.println("Your array will contain " + desiredArray + " elements.");
//
//        for (int i = 0; i < arrayLength.length; i++) {
//            System.out.println("Please enter number");
//            arrayLength[i] = reader.nextInt();
////           }
//
//            for (int i = arrayLength.length - 1; i >= 0; i--) {
//                System.out.println(arrayLength[i]);
//                if (arrayLength[i] % 2 == 0) {
//                    System.out.println("The number " + arrayLength[i] + " is even");
//                } else {
//                    System.out.println("The number " + arrayLength[i] + " is  odd");
//                }
//
//                if (arrayLength[i] > 10) {
//                    System.out.println("The number is greater that 10");
//                }
//            }
//////        }

        // ZADATAK 2 -

//        int [] arrayA = {55, 1, 169, 2354, 1111, 13, 14, 211, 968546482, 10};
//        String[] stringArray = {"1.", "2.", "3.", "4.", "5.", "6.", "7.", "8.", "9.", "10.", "11.", "12.", "13.", "14.", "15.",};
//
//        if (arrayA.length <= 15) {
//            for (int  i = 0; i < arrayA.length; i++) {
//                System.out.println(stringArray[i] + "number is: " + arrayA[i]);
//            }
//        }

        // ZADATAK 3 - Reverse array

//        int[] arrayZadatak2 = {10, 3, 15, 234};
//        int[] newArray = new int[arrayZadatak2.length];
//
//        for (int i = arrayZadatak2.length-1; i >= 0; i--) {
//            newArray[i] = arrayZadatak2[i];
//            System.out.println(newArray[i]);
//        }

        // ZADATAK 4 - Check if palindrome

//        String palindrome = "";
//        String reverse = "";
//
//        for (int i = palindrome.length()-1; i >= 0; i--) {
//            reverse += palindrome.charAt(i);
//            }
//        boolean checkIfPalindrome = true;
//        for (int i = 0; i < palindrome.length(); i++) {
//            if (palindrome.charAt(i) != reverse.charAt(i)) {
//                checkIfPalindrome = false;
//            }
//           if (checkIfPalindrome) {
//               System.out.println("The word is palindrome!");
//           } else {
//               System.out.println("This word is NOT a palindrome!");
//           }
//        }

//        // ZADATAK 5 - RANGE & EVEN NUMBERS
//
//        System.out.println("Hello! Today, I want to ask you to enter a range of numbers.");
//        System.out.println("Please enter lowest number in range: ");
//        int rangeMIN = reader.nextInt();
//
//        System.out.println("Please enter lowest number in range: ");
//        int rangeMAX = reader.nextInt();
//
//        for (int i = rangeMIN; i < rangeMAX; i++) {
//            if (i%2==0) {
//                System.out.println("Even number in range is: " + i);
//            }
//        }

        // ZADATAK 6 - Combine 3 arrays into 1 large array

//        int [] array1 = {1, 2, 3, 4};
//        int [] array2 = {5,6,7};
//        int [] array3 = {8, 9, 10};
//        int [] result = new int [array1.length + array2.length + array3.length];
//
//        for (int i = 0; i < array1.length; i++) {
//            result [i] = array1 [i];
//        }
//        for (int i = 0; i < array2.length; i++) {
//            result [array1.length + i] = array2 [i];
//        }
//        for (int i = 0; i < array3.length; i++) {
//            result [array1.length + array2.length + i] = array3 [i];
//        }
//        System.out.println("Merged array is: ");
//        for (int i= 0; i < result.length; i++) {
//            System.out.print( result[i] + " " );
//        }

//        // ZADATAK 7 - Sum 2 arrays into 1
//
//        int[] arrayX = {10, 4, 2};
//        int[] arrayY = {7, 5, 3, 1, 10};
//        int sumArrayLength = 0;
//
//        if (arrayX.length >= arrayY.length) {
//            sumArrayLength = arrayX.length;
//        } else {
//            sumArrayLength = arrayY.length;
//        }
//
//        int[] result = new int[sumArrayLength];
//
//        for (int i = 0; i < sumArrayLength; i++) {
//            if (i < arrayX.length && i < arrayY.length) {
//                result[i] = arrayX[i] + arrayY[i];
//            } else if (i < arrayX.length) {
//                result[i] = arrayX[i];
//            } else {
//                result[i] = arrayY[i];
//            }
//        }
//        System.out.println("Elements of new summed array are : ");
//        for (int i = 0; i < sumArrayLength; i++) {
//            System.out.print(result[i] + " ");
//        }

        // ZADATAK 8 - Push out strings containing wovels

//        String [] initialString = {"brk", "Macka", "trg", "ANA", "xyz"};
//        String [] newString = new String[initialString.length];
//
//        for (int i = 0; i < initialString.length; i++) {
//            char [] stringToChar = initialString[i].toCharArray();
//            for (int j = 0; j < stringToChar.length; j++) {
//                if (stringToChar[j] != 'a' || stringToChar[j] != 'A' || stringToChar[j] != 'e' || stringToChar[j] != 'E' || stringToChar[j] != 'i' || stringToChar[j] != 'I' || stringToChar[j] != 'o' || stringToChar[j] != 'O' || stringToChar[j] != 'u' || stringToChar[j] != 'U') {
//                    System.out.println(newString[j]);
                }
            }

        }





//        // ZADATAK 9

//        int[] arrayOne = {1, 2, 3};
//        int[] arrayTwo = {1, 2, 3};
//        int sum = 0;
//
//        for (int i = 0; i < arrayOne.length; i++) {
//            for (int j = 0; j < arrayTwo.length; j++) {
//                sum = sum + arrayOne[i] + arrayTwo[j];
//
//                System.out.println("Sum equals " + sum);
//            }
    }
}








