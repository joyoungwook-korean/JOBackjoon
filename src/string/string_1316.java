package string;


import java.util.Scanner;

public class string_1316 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int cnt=0;
        int temp=a;
        boolean ch = true;
        while (cnt<a){
            String s = scanner.next();
            char[] st = s.toCharArray();
            for(int i=0;i<st.length-1; i++){
                if(ch == false) {
                    ch=true;
                    break;
                }
                for(int k=i+1;k<st.length;k++){
                   
                    if(st[i]==st[k]){
                        if(st[k-1]!=st[i]){
                            temp--;
                            ch= false;
                            break;
                        }else{
                            k++;
                        }
                    }


                }
            }
            cnt++;
        }
        System.out.println(temp);

    }
}
