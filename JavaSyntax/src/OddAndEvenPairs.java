import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class OddAndEvenPairs {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.ROOT);

        Scanner input = new Scanner(System.in);
        String[] lineOfNumbers = input.nextLine().split(" ");

        if (lineOfNumbers.length%2!=0){
            System.out.println("Invalid length");
        }
        else{
            for (int i = 0; i < lineOfNumbers.length; i+=2) {
                if((Integer.parseInt(lineOfNumbers[i])%2)==(Integer.parseInt(lineOfNumbers[i+1])%2)){
                    if(Integer.parseInt(lineOfNumbers[i])%2==0){
                        System.out.println(lineOfNumbers[i]+", "+lineOfNumbers[i+1]+" -> both are even");
                    }
                    else{
                        System.out.println(lineOfNumbers[i]+", "+lineOfNumbers[i+1]+" -> both are odd");
                    }
                }
                else{
                    System.out.println(lineOfNumbers[i]+", "+lineOfNumbers[i+1]+" -> different");
                }

            }
        }


    }
}
