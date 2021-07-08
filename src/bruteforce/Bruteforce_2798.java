package bruteforce;

import java.util.Scanner;

public class Bruteforce_2798 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max, su;
        su = scanner.nextInt();
        max = scanner.nextInt();
        int vs = 0;
        int save[] = new int[su];
        for (int i = 0; i < save.length; i++) save[i] = scanner.nextInt();
        for (int i = 0; i < save.length - 2; i++) {
            for (int y = i + 1; y < save.length ; y++) {
                for (int k = y+1; k < save.length ; k++) {
                    int aa = save[i]+save[y]+save[k];
                    if (aa>vs && aa<=max) vs=aa;
                    if(vs==max ) {
                        break;
                    }
                }

            }
        }
        System.out.println(vs);

    }
}
