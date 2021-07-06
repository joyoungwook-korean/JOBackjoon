package method;

public class Method_4673 {
    public static void main(String[] args) {
        boolean arr[] = new boolean[10001];

        for(int i=1; i<10001;i++){
            int n = self(i);
            if(n<10001){
                arr[n] = true;
            }
        }
        for(int i=1; i<arr.length;i++){
            if(!arr[i]) System.out.println(i);
        }


    }

    public static int self(int a){
        int sum = a;
        while (a !=0){
            sum = sum+(a%10);
            a = a/10;
        }
        return sum;
    }
}
