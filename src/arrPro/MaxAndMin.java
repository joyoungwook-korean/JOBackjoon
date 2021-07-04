package arrPro;


import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int y[] =new int[n];
        int cnt=0;
        int max = -1000001;
        int min = 1000000;

        while (cnt<y.length){
            y[cnt] = scanner.nextInt();
            cnt++;
        }
        for(int i=0; i<y.length; i++){
            if(min> y[i]) min=y[i];
            if(max<y[i]) max=y[i];
        }

        System.out.print(min+ " " +max);
    }
}
