import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int coordAx= input.nextInt();
        int coordAy=input.nextInt();

        int coordBx=input.nextInt();
        int coordBy=input.nextInt();

        int coordCx=input.nextInt();
        int coordCy= input.nextInt();

        int area= Math.abs(((coordAx * (coordBy - coordCy)) + (coordBx * (coordCy - coordAy)) + (coordCx * (coordAy - coordBy))) / 2);

        System.out.println(area);


    }
}

