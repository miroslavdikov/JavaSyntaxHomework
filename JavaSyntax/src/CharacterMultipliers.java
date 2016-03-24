import java.util.Scanner;

public class CharacterMultipliers {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String firstString=input.next();
        String secondString=input.next();
        String[] fiString=firstString.split("");
        String[] secString=secondString.split("");

        int sum=0;
        if (fiString.length==secString.length) {
            for (int i = 0; i < fiString.length; i++) {
                int multiplier= (int)(firstString.charAt(i))*(int)(secondString.charAt(i));
                sum= multiplier+sum;
            }
        }
        else{
            if(fiString.length>secString.length){
                for (int i = 0; i < secString.length; i++) {
                    int multiplier= (int)(firstString.charAt(i))*(int)(secondString.charAt(i));
                    sum= multiplier+sum;
                }
                for (int j = secString.length; j <fiString.length ; j++) {
                    sum=sum+(int)(firstString.charAt(j));
                }
            }
            else{
                for (int i = 0; i < fiString.length; i++) {
                    int multiplier= (int)(firstString.charAt(i))*(int)(secondString.charAt(i));
                    sum= multiplier+sum;
                }
                for (int j = fiString.length; j <secString.length ; j++) {
                    sum=sum+(int)(secondString.charAt(j));
                }
            }

        }

        System.out.println(sum);

    }


}
