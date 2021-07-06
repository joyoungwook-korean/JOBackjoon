package string;

import java.util.Scanner;

public class string_2941 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int count=0;

        for(int i=0; i<s.length();i++){
            char a = s.charAt(i);

            if(a=='c'){
                if(i<s.length()-1){
                    if (s.charAt(i+1)=='=' || s.charAt(i+1)=='-') i++;
                }
            }else if(a=='d'){
                if(i<s.length()-2){
                    if(s.charAt(i+1)=='z'&& s.charAt(i+2)=='='){
                        i=i+2;
                    }
                }
                if(i<s.length()-1){
                    if ( s.charAt(i+1)=='-') i++;
                }
            }else if(a=='l'){
                if(i<s.length()-1){
                    if (s.charAt(i+1)=='j') i++;
                }
            }else if(a=='n'){
                if(i<s.length()-1){
                    if (s.charAt(i+1)=='j') i++;
                }
            }else if(a=='s'){
                if(i<s.length()-1){
                    if (s.charAt(i+1)=='=') i++;
                }
            }else if(a=='z'){
                if(i<s.length()-1){
                    if (s.charAt(i+1)=='=') i++;
                }
            }
            count++;
        }
        System.out.println(count);


    }

}
