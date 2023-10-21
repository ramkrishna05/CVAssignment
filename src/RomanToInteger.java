import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    public static int romanToInt(String s) {
        // this is my hashmap for all roman keys and its value
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = romanMap.get(s.charAt(i));
          //if current value less than my previous roman value  than i subtract currentvalue in my result
            if (currValue < prevValue) {
                result -= currValue; // Subtraction rule
            } else {
                result += currValue; // Addition rule
            }

            prevValue = currValue;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String  romannumber=sc.next();
        int integerEquivalent = romanToInt(romannumber);
        System.out.println("Integer Equel  of " + romannumber + " is " + integerEquivalent);
    }
}

