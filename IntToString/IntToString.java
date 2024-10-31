package IntToString;

public class IntToString {
    public static void main(String[] args) {
        // Test cases
        System.out.println(Convert(123));    // Output: 321
        System.out.println(Convert(-456));   // Output: -654
        System.out.println(Convert(120));    // Output: 21
    }

    public static int Convert(int num) {
        // Convert the integer to a string
        String converted = Integer.toString(num);
        
        // Initialize an empty StringBuilder for reversing
        StringBuilder reversed = new StringBuilder();
        
        // Check if the number is negative
        if (num < 0) {
            // Start with the minus sign and reverse the rest
            reversed.append("-");
            converted = converted.substring(1); // Remove the negative sign from the string
        }
        
        // Reverse the string representation of the number
        for (int i = converted.length() - 1; i >= 0; i--) {
            reversed.append(converted.charAt(i));
        }
        
        // Convert the reversed string back to an integer
        int reversedInt = Integer.parseInt(reversed.toString());
        
        return reversedInt;
    }
}
