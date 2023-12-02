import java.util.Scanner;

public class CalibrationValue {
    public static void main(String[] args){
        try(Scanner s = new Scanner(System.in)){
            int calibrationValue = 0;
            while(s.hasNextLine()){
                int firstDigit, lastDigit;
                String line = s.nextLine();
                line = String.join("",line.split("[a-z]+"));
                firstDigit = line.charAt(0) - '0';
                lastDigit = line.charAt(line.length() - 1) - '0';
                calibrationValue += (firstDigit * 10) + lastDigit;
            }
            System.out.println(calibrationValue);
        }
    }
}