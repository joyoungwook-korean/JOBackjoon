package string;

import java.util.Scanner;

public class string_2675 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String save="";
        int a;
        String b;
        String c[];
        int num = scanner.nextInt();
        int cnt = 0;
        String s[] = new String[num];
        while (cnt < num) {

            a = scanner.nextInt();
            b = scanner.next();
            c = b.split("");
            for (int y = 0; y < c.length; y++) {
                String temp = c[y];
                for (int i = 0; i < a-1; i++) {
                    c[y] += temp;
                }
            }
            for(String f : c){
                save+=""+f;
            }
            s[cnt] = save;
            save ="";
            cnt++;
        }
        for(String aa : s){
            System.out.println(aa);
        }
    }
}
