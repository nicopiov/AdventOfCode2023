import java.util.Scanner;

public class CubePower {
    public static void main(String[] args){
        try(Scanner s = new Scanner(System.in)){
            int power = 0;
            while(s.hasNextLine()){
                int red = 0, green = 0, blue = 0;
                String [] line = s.nextLine().split("(:\s|,\s|;\s)");
                for(String str : line){
                    String [] values = str.split(" ");
                    if(values[1].equals("red") && Integer.parseInt(values[0]) >= red){
                        red = Integer.parseInt(values[0]);
                    }else if(values[1].equals("green") && Integer.parseInt(values[0]) >= green){
                        green = Integer.parseInt(values[0]);
                    }else if(values[1].equals("blue") && Integer.parseInt(values[0]) >= blue){
                        blue = Integer.parseInt(values[0]);
                    }
                }
                power += (red * green * blue);
            }
            System.out.println(power);
        }
    }
}
