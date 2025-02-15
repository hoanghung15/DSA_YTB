package Recursion;

public class Fibo {
    public static int fibo(int n){
        if (n<=2){
            return 1;
        }
        int t = fibo(n-1)+ fibo(n-2);
        return  t;
    }
    public static void main(String[] args) {
        System.out.println(fibo(20));
    }
}
