package string;

import java.util.Scanner;

public class string_2908 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String s1[] =scanner.next().split("");
        String s2[] = scanner.next().split("");
        int s1_save, s2_save;
        String a="",b="";
        String temp;
        temp = s1[0];
        s1[0] = s1[2];
        s1[2] = temp;
        temp = s2[0];
        s2[0] = s2[2];
        s2[2] = temp;

        for(int i=0; i<3; i++){
            a+=s1[i];
            b+=s2[i];
        }
        s1_save = Integer.parseInt(a);
        s2_save = Integer.parseInt(b);

        if(s1_save > s2_save){
            System.out.println(s1_save);
        }else{
            System.out.println(s2_save);
        }

    }
}
