import java.util.*;

class Addition3 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st No:");
        int a = scan.nextInt();
        System.out.print("Enter 2nd No:");
        int b = scan.nextInt();
        System.out.print("Enter 3rd No:");
        int c = scan.nextInt();
        System.out.println("The First Number:"+a);
        System.out.println("The Second Number:"+b);
        System.out.println("The Third Number:"+c);
        System.out.println("Total:" + (a + b + c));

    }
}
