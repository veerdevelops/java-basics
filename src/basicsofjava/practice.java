package basicsofjava;
import java.util.Scanner;
public class practice {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("enter elements of an array");
        int []arr = new int[n];
        for( int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i] +"  ");
        }
    }
}
