import java.util.Locale;
import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);
        Scanner input= new Scanner(System.in);
        short a=input.nextShort();
        float b=input.nextFloat();
        float c=input.nextFloat();

        String hexA = Integer.toHexString(a);
        int binA= Integer.parseInt(Integer.toBinaryString(a));

        System.out.printf("|%1$-10S|%2$010d|%3$10.2f|%4$-10.3f|",hexA,binA, b, c);

    }
}
