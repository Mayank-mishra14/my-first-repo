import java.util.*;

public class Main {
    public static void main(String args[]) {
        //Input
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a==b) {
            System.out.println("Equal");
        } else {
            if(a>b){
                System.out.println("A is greater");
            } else {
                System.out.println("A is lesser");
            }    
        }

    }
    
}
