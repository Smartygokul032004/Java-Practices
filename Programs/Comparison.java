import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a = scan.nextInt();
        System.out.println("Enter Second Number:");       
        int b = scan.nextInt();

        System.out.println("A < B is " +(a<b));
        System.out.println("A <= B is " +(a<=b));
        System.out.println("A > B is " +(a>b));
        System.out.println("A  >=  B is " +(a>=b));
        System.out.println("A ==  B  is " +(a==b));
        System.out.println("A !=  B is " +(a!=b));
    }

}