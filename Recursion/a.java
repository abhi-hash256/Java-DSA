# Log of a number at base 2

import java.util.*;
import java.io.*;


public class RecursionCode {

    public static int find_log(int n){
        if(n==0)
            return 0;
        return 1+find_log(n/2);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = find_log(n);
        System.out.println(res);
    }
}
