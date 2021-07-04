package arrPro;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = -1;
        int num[] = new int[9];
        int cnt=0;
        int temp=0;
        while (cnt<num.length){
            num[cnt] = scanner.nextInt();
            if(num[cnt]>max) {
                max = num[cnt];
                temp=cnt;
            }
            cnt++;
        }
        System.out.println(max);
        System.out.println(temp+1);


    }
}
