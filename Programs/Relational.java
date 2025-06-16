import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a = scan.nextInt();
        System.out.println("Enter Second Number:");       
        int b = scan.nextInt();

        System.out.println(a+ " < " +b+ " is " +(a<b));
        System.out.println(a+ " <= " +b+ " is " +(a<=b));
        System.out.println(a+ " > " +b+ " is " +(a>b));
        System.out.println(a+ " >= " +b+ " is " +(a>=b));
        System.out.println(a+ " == " +b+ " is " +(a==b));
        System.out.println(a+ " != " +b+ " is " +(a!=b));
    }

}
