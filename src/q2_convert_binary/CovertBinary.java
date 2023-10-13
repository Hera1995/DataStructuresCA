
package q2_convert_binary;

public class CovertBinary {
    public static int covertBinarytoDecimal(String binary){
        //check if it's empty
        if (binary.isEmpty()){
            return 0;
        }else{
            //convert the most right digit to an integer
            int rightNum = Character.getNumericValue(binary.charAt(binary.length() - 1));

            // remove "rightNum" from "binary"
            String restNum = binary.substring(0, binary.length() - 1);

            // convert restNum to decimal and multiple 2, and add rightNum
            int decimal = covertBinarytoDecimal(restNum) * 2 + rightNum;

            
            return decimal;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("The decimal number of 0010 is " + covertBinarytoDecimal("0010"));
        System.out.println("The decimal number of 0100 is " + covertBinarytoDecimal("0100"));
        System.out.println("The decimal number of 0110 is " + covertBinarytoDecimal("0110"));
        System.out.println("The decimal number of 1000 is " + covertBinarytoDecimal("1000"));
    }
}
