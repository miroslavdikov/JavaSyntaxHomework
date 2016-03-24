import java.util.Scanner;

public class HitTheTarget {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int target=input.nextInt();

        for (int i = 1; i <=20; i++) {
            for (int j = 1; j <=20; j++) {
                if(i+j==target){
                    System.out.printf("%1$d + %2$d = %3$d", i, j, target);
                    System.out.println();
                }

            }

        }

        for (int i = 1; i <=20; i++) {
            for (int j = 1; j <=20; j++) {
                if(i-j==target){
                    System.out.printf("%1$d - %2$d = %3$d", i, j, target);
                    System.out.println();
                }

            }

        }
    }
}
