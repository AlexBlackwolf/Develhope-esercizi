import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int num = 4;
        String name= "Alex";
        String name2= "MICHAEL";
        System.out.println(lowercase(name));
        System.out.println(uppercase(name2)+(name));
        boolean result = isEven(num);
        System.out.println(result);
        String inverted = invertedHello();
        System.out.println(inverted);
        int[] array = {1, 2, 3, 4, 5};
        int sum = sumArray(array);
        System.out.println(sum);
        String str1 = "listen";
        String str2 = "silent";
        boolean areAnagramsResult = areAnagrams(str1, str2);
        System.out.println(areAnagramsResult);
    }
    public static String lowercase(String setnametolower) {
        return setnametolower.toLowerCase();
    }

    public static String uppercase( String setnametoupper) {
        return  setnametoupper.toUpperCase();

    }

        public static boolean isEven ( int num){
            if (num % 2 == 0) {
                return true;
            } else {
                return false;
            }
        }
        public static String reverseString (String input){
            String output = "";
            for (int i = input.length() - 1; i >= 0; i--) {
                output += input.charAt(i);
            }
            return output;
        }

        public static String invertedHello () {
            String input = "hello";
            String output = reverseString(input);
            return output;
        }
        public static int sumArray ( int[] array){
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return sum;
        }
        public static boolean areAnagrams(String str1, String str2) {
            // Convert both strings to char arrays
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            if (charArray1.length != charArray2.length) {
                return false;
            }

            // Sort both arrays
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // Check if the two arrays are equal
            return Arrays.equals(charArray1, charArray2);
        }
}

//whats num %2 ==0

//num % 2 == 0 is a boolean expression in Java that checks if the remainder of dividing the integer variable num by 2 is equal to zero.
//The % operator in Java returns the remainder of a division operation. So num % 2 will return the remainder when num is divided by 2.
// If this remainder is equal to zero, it means that num is an even number, because it is divisible by 2 with no remainder.
//The expression num % 2 == 0 will evaluate to true if num is even (i.e., its remainder when divided by 2 is 0), a
// nd it will evaluate to false if num is odd (i.e., its remainder when divided by 2 is 1).

//the invertedHello method is defined outside of main, at the same level as the isEven and reverseString methods.
// The reverseString method is also defined, and it is called inside the invertedHello method to reverse the string "hello".
// The reversed string is returned from invertedHello and stored in the inverted variable in main.
// Finally, the inverted variable is printed to the console using System.out.println. This will output "olleh".

//In this code, the sumArray method is defined after the invertedHello method and before the closing } of the Main class.
// The method takes an array of integers as input and returns the sum of all the integers in the array.
// The method uses a for loop to iterate over each element of the array, and adds each element to a running total stored in the sum variable.
// Finally, the sum variable is returned from the method.
//In the main method, an example array {1, 2, 3, 4, 5} is created, and the sumArray method is called with this array as input.
// The resulting sum is stored in the sum variable and printed to the console using System.out.println. This will output 15,
// which is the sum of all the integers in the array.

//The areAnagrams method is declared inside the main method, which is not allowed. Also, the method is not being called anywhere in the code.
//In this updated code, the areAnagrams method takes two strings as input, and returns true if they are anagrams, and false otherwise.
// The method first converts both strings to char arrays, then checks if their lengths are equal.
// If they are, it sorts both arrays and checks if they are equal using Arrays.equals. Finally,
// the areAnagrams method is called in the main method with the strings "listen" and "silent", and the result is printed to the console.

