import java.util.*;

public class Largestnumber {
    public static void main(String[] args) {
      Random random = new Random();
        int a = random.nextInt();
        int b = random.nextInt();
        int c = random.nextInt();

        if (a>=b && a>=c){
            System.out.println("The Greatest no is "+a);
        }else if (b>=a && b>=c){
            System.out.println("The Greatest no is "+b); 
        }else{
            System.out.println("The Greatest no is "+c); 
        }
    }

}
