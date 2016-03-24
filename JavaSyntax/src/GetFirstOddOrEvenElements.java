import java.util.Scanner;

public class GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] lineOfNumbers = input.nextLine().split(" ");
        String[] command= input.nextLine().split(" ");
        String oddNumber= new String();
        String evenNumber= new String();
        String oddElement= new String();
        String evenElement= new String();


        for (int i = 0; i <lineOfNumbers.length ; i++) {
            if(Integer.parseInt(lineOfNumbers[i])%2==0){
                evenNumber = evenNumber +lineOfNumbers[i]+" ";
            }
            else {
                oddNumber = oddNumber+ lineOfNumbers[i]+" ";
            }
        }


        if((oddNumber.length()/2)> Integer.parseInt(command[1])){
            for (int i = 0; i < Integer.parseInt(command[1]); i++) {
                String[] printOddNumber= oddNumber.split(" ");
                oddElement= oddElement+printOddNumber[i]+" ";

            }
            oddNumber=oddElement;
        }


        if((evenNumber.length()/2)> Integer.parseInt(command[1])){
            for (int i = 0; i < Integer.parseInt(command[1]); i++) {
                String[] printEvenNumber= evenNumber.split(" ");
                evenElement= evenElement+printEvenNumber[i]+" ";

            }
            evenNumber=evenElement;
        }



        switch (command[2]){
            case "odd":
                System.out.printf("%s",oddNumber);break;
            case "even":
                System.out.printf("%s",evenNumber); break;
            default: break;
        }


    }
}
