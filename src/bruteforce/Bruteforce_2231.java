package bruteforce;

import java.util.Scanner;

public class Bruteforce_2231 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int temp_int = 0;
        int cnt = 1;
        int temp_all = 0;
        while (cnt < a) {

            String s = Integer.toString(cnt);
            int[] di = new int[s.length()];
            for (int i = 0; i < di.length; i++) {
                temp_int += s.charAt(i) - '0';
            }
            temp_all = temp_int + cnt;
            if (temp_all == a) {
                break;
            }
            temp_int = 0;
            cnt++;

        }

        if (cnt == a) System.out.println(0);
        else System.out.println(cnt);


    }
}
