package basicsofjava;
import java.util.Scanner;
public class array {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr= new int[n];
        System.out.println("enter array elements: ");
        for (int i=0; i<n; i++) {//takes array elements from user one by one
            arr[i]=sc.nextInt();
        }
          for(int i=0; i<n; i++){//prints every element of an array
              System.out.print(arr[i]+ "");

          }
          sc.close();
    }

}
