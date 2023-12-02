import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalibrationValueRight {
        public static void main(String[] args){

        Map<String,String> numbersMap = Map.of( "one", "1",
                                                "two" , "2",
                                                "three", "3",
                                                "four", "4", 
                                                "five", "5", 
                                                "six" , "6", 
                                                "seven" , "7", 
                                                "eight" , "8", 
                                                "nine", "9"
                                                );

        try(Scanner s = new Scanner(System.in)){
            int calibrationValue = 0;
            while(s.hasNextLine()){
                ArrayList<String> matches = new ArrayList<>();
                int firstDigit, lastDigit;
                String line = s.nextLine();
                Matcher m = Pattern.compile("(one|two|three|four|five|six|seven|eight|nine|[0-9+])").matcher(line);
                if(m.find()){
                    do{
                        if(m.group().matches("[0-9+]")){
                            matches.add(m.group());
                        }else{
                            matches.add(numbersMap.get(m.group()));
                        }
                    }while(m.find(m.start(1) + 1));
                }
                line = String.join("",matches);
                firstDigit = line.charAt(0) - '0';
                lastDigit = line.charAt(line.length() - 1) - '0';
                calibrationValue += (firstDigit * 10) + lastDigit;
            }
            System.out.println(calibrationValue);
        }
    }
}
