package basicsofjava.loops;
import java.util.Scanner;
public class if_else{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("you are an adult.  ");
        }else{
            System.out.println("You are not an adult: ");
        }
         sc.close();

    }

}