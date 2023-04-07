
    public class wrapper {
        public static void main(String[] args) {
            // create wrapper objects
            Integer intObj = Integer.valueOf(10);
            Double doubleObj = Double.valueOf(3.14);
            Boolean boolObj = Boolean.valueOf(true);
            Character charObj = Character.valueOf('a');
            
            // use wrapper class methods
            Integer intObj2 = Integer.valueOf("100"); 
            System.out.println("Integer value of \"100\": " + intObj2);
            
            Double doubleObj2 = Double.valueOf("3.14159");
            System.out.println("Double value of \"3.14159\": " + doubleObj2);
            
            int intValue2 = Integer.parseInt("200"); 
            System.out.println("Integer value of \"200\": " + intValue2);
            
            String intStr = Integer.toString(500); 
            System.out.println("String value of 500: " + intStr);
            
            int compareResult = Integer.compare(5, 10);
            System.out.println("Comparison result of 5 and 10: " + compareResult);
            
            String binaryStr = Integer.toBinaryString(15);
            System.out.println("Binary representation of 15: " + binaryStr);
            
            double expValue = Math.exp(2.0); 
            System.out.println("Exponential value of 2.0: " + expValue);
            
            double ceilValue = Math.ceil(4.5); 
            System.out.println("Ceiling value of 4.5: " + ceilValue);
            
            double randomValue = Math.random();
            System.out.println("Random value between 0 and 1: " + randomValue);
        }
    }
