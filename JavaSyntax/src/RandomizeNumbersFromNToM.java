import java.util.Locale;
import java.util.Scanner;

public class RandomizeNumbersFromNToM {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);

        Scanner input= new Scanner(System.in);
        int numberOne=input.nextInt();
        int numberTwo=input.nextInt();
        int[] numbers= new int[Math.abs(numberOne-numberTwo)+1];

        if(numberOne>numberTwo){
            numberOne=numberOne-numberTwo;
            numberTwo= numberTwo+numberOne;
            numberOne=numberTwo-numberOne;
        }
        for (int i = 0; i <=numberTwo-numberOne; i++) {
            numbers[i]=i+numberOne;
        }

        for (int i = 0; i <=numberTwo-numberOne ; i++) {
            int randomNumber= (int) ((Math.random()*(numberTwo-numberOne))+numberOne)-numberOne;
            int index=numbers[i];
            numbers[i]=numbers[randomNumber];
            numbers[randomNumber]=index;
        }

        for (int i = 0; i <=numberTwo-numberOne; i++) {
            System.out.print(numbers[i]+" ");
        }

    }
}
