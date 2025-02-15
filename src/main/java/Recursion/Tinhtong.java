package Recursion;

public class Tinhtong {
    public static int tinhtong(int n){
        if(n<=0){
            return 0;
        }
        int t= n + tinhtong(n-1);
        return  t;
    }
    public static void main(String[] args) {
        System.out.println(tinhtong(10));
    }
}
