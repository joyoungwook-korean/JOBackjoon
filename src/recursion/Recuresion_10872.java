package recursion;

import java.util.Scanner;

public class Recuresion_10872 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        System.out.println(Fac(a));
    }
    public static int Fac(int num){
        if(num==0) return 1;
        else return num*Fac(num-1);
    }
}
