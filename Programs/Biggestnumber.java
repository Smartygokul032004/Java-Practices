import java.util.*;
class Biggestnumber{
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First no :");
        int a = scan.nextInt();
        System.out.println("Enter Second no :");
        int b = scan.nextInt();

        if (a>b){
            System.out.println(a+" Is Greater Than "+b);
        }else{
            System.out.println(b+" Is Greater Than "+a);
        }
    }
}