package IntToString;

public class IntToString {
    public static void main(String[] args) {
        System.out.println(Convert(123));    
        System.out.println(Convert(-456));   
        System.out.println(Convert(120));   
    }

    public static int Convert(int num) {
        String converted = Integer.toString(num);
        
        StringBuilder reversed = new StringBuilder();
        
        if (num < 0) {
            reversed.append("-");
            converted = converted.substring(1);
        }
        
        for (int i = converted.length() - 1; i >= 0; i--) {
            reversed.append(converted.charAt(i));
        }
        
        int reversedInt = Integer.parseInt(reversed.toString());
        
        return reversedInt;
    }
}
