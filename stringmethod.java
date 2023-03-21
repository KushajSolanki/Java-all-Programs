public class stringmethod {
        public static void main(String[] args) {
            String str = "This is a sample string.";

            int len = str.length();
            System.out.println("Length of the string: " + len);
    
            int index = str.indexOf("sample");
            System.out.println("Index of 'sample': " + index);
    
            String substr = str.substring(10, 16);
            System.out.println("Substring from 10 to 16: " + substr);
    
            String newStr = str + " Here's some additional text.";
            System.out.println("Concatenated string: " + newStr);

            boolean equal = str.equals("this is a sample string.");
            System.out.println("Strings equal? " + equal);
    
            String upper = str.toUpperCase();
            System.out.println("Uppercase: " + upper);
    
            String lower = str.toLowerCase();
            System.out.println("Lowercase: " + lower);
        }
    }

