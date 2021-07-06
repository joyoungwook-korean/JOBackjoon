package string;

import java.util.Scanner;

public class string_1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String sUpper=s.toUpperCase();
        char sp[] = sUpper.toCharArray();
        int[] stringSave = new int[26];

        for(int i=0;i<sp.length;i++){
            int a=sp[i];
            stringSave[a-65]+=1;
        }
        int a=-1;
        int b=-1;
        int temp=-1;
        for(int i=0; i<stringSave.length; i++){
            if(temp<stringSave[i]) {
                temp=stringSave[i];
                a=i;
            }else if(stringSave[i]==temp){
                b=stringSave[i];
            }else{
                continue;
            }
        }
        if(b==temp){
            System.out.println("?");
        }else{
            System.out.println((char)(a+65));
        }


    }
}
