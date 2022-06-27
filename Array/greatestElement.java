import java.util.*;
import java.lang.*;

public class greatestEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
      
        int maxEle = arr[0];
      
        for(int i=1; i<n; i++){
            maxEle = Math.max(maxEle, arr[i]);
        }
      
        System.out.println("The maximum element is: " + maxEle);
    }
}

// Time Complexity : Theta(n) As in worst or best case we have to traverse whole array to find greatest element
