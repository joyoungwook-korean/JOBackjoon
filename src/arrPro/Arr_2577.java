package arrPro;


import java.util.Arrays;
import java.util.Scanner;

public class Arr_2577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tot=1;
        int mok=1;
        int cnt=0;
        int num[]=new int[10];
        for(int i=0; i<3; i++){
            int a = scanner.nextInt();
            tot *= a;
        }
        while (true){
            if(tot/mok==0) {
                mok=mok/10;
                break;
            }else{
                mok= mok*10;
            }
        }
        while (true){
            cnt=tot/mok;
            tot = tot%mok;
            num[cnt] +=1;
            mok=mok/10;
            if(mok==0) break;
        }
        for(int i=0; i< num.length; i++){
            System.out.println(num[i]);
        }
    }
}
