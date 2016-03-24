import java.util.Locale;
import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);

        Scanner input= new Scanner(System.in);
        float a=input.nextFloat();
        float b=input.nextFloat();
        float c=input.nextFloat();

        double firstFormula= Math.pow(((Math.pow(a,2)+Math.pow(b,2))/(Math.pow(a,2)-Math.pow(b,2))), ((a+b+c)/Math.sqrt(c)));
        double secondFormula= Math.pow((Math.pow(a,2)+Math.pow(b,2)-Math.pow(c,3)),(a-b));

        double averageABC= (a+b+c)/3;
        double averageFirstFormulaAndSecondFormula= (firstFormula+secondFormula)/2;

        double difference= Math.abs(averageABC-averageFirstFormulaAndSecondFormula);

        System.out.printf("F1 result: %1$.2f; F2 result: %2$.2f; Diff: %3$.02f",
                firstFormula, secondFormula, difference);
    }
}

