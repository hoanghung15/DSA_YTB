package Recursion;

public class UCLN {
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        int t=gcd(b,a%b);
        return  t;
    }

    public static void main(String[] args) {
        System.out.println(gcd(48,18));
    }
}
