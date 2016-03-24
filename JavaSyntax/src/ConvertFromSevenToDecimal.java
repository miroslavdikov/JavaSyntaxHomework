import java.util.Locale;
import java.util.Scanner;

public class ConvertFromSevenToDecimal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Scanner input= new Scanner(System.in);
        int numberSevenBase=input.nextInt();
        int element;
        int numberDecimalBase=0;
        int counter=0;

        while(numberSevenBase!=0){
            element=numberSevenBase%10;
            numberDecimalBase=numberDecimalBase+(int)(element*(Math.pow(7,counter)));
            counter++;
            numberSevenBase=numberSevenBase/10;
        }

        System.out.println(numberDecimalBase);

    }
}
