package string;

import java.util.Scanner;

public class string_10809 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] al = new int[26];
        String s = scanner.next();
        char[] real = s.toCharArray();
        for(int i=0; i<al.length; i++){
            al[i]=-1;
        }

        for(int y=0; y< real.length; y++){
            if(al[(int)real[y] -97] ==-1){
                al[(int)real[y] -97] = y;
            }
        }
        for( int i : al){
            System.out.print(i + " ");
        }
    }
}
