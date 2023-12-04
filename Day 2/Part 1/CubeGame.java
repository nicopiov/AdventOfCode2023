import java.util.Scanner;

public class CubeGame {
    public static void main(String[] args){
        try(Scanner s = new Scanner(System.in)){
            int sumID = 0;
            while(s.hasNextLine()){
                int red = 0, green = 0, blue = 0, gameId = 0;
                String [] line = s.nextLine().split("(:\s|,\s|;\s)");
                for(String str : line){
                    String [] values = str.split(" ");
                    if(values[0].equals("Game")){
                        gameId = Integer.parseInt(values[1]);
                    }
                    if(values[1].equals("red") && Integer.parseInt(values[0]) >= red){
                        red = Integer.parseInt(values[0]);
                    }else if(values[1].equals("green") && Integer.parseInt(values[0]) >= green){
                        green = Integer.parseInt(values[0]);
                    }else if(values[1].equals("blue") && Integer.parseInt(values[0]) >= blue){
                        blue = Integer.parseInt(values[0]);

                    }
                }
                if(red <= 12 && green <= 13 && blue <= 14){
                    sumID += gameId;
                }
            }
            System.out.println(sumID);
        }
    }
}