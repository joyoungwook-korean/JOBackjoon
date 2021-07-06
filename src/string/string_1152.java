package string;

import java.util.Scanner;

public class string_1152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String save[]=s.split("\\s+");
        int cnt=0;
        for(String a: save){
            if(!a.isEmpty()){
                cnt++;
            }

        }
        System.out.println(cnt);
    }
}
