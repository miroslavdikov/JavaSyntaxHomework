import java.util.Locale;
import java.util.Scanner;

public class ConvertFromDecimalSystemToSeven {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Scanner input= new Scanner(System.in);
        int numberDecimal=input.nextInt();
        String numberInSevenBase= new String();
        int index=0;

        if (numberDecimal<7){
            System.out.println(numberDecimal);
        }
        else{
            while(numberDecimal>0) {
                index = numberDecimal % 7;
                numberDecimal = numberDecimal / 7;
                numberInSevenBase = index+numberInSevenBase;
            }
            System.out.println(numberInSevenBase);
        }

    }
}
