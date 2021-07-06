package string;

import java.util.Scanner;

public class string_11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String[] strings = new String[a];
        String in = scanner.next();
        strings = in.split("");
        int tot=0;

        for(String s : strings){
            tot+=Integer.parseInt(s);
        }
        System.out.println(tot);

    }
}
