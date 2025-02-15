package Recursion;

public class SoMu {
    public static int somu(int m,int n){
        if(n==0){
            return 1;
        }
        int t = m*somu(m,n-1);
        return t;
    }
    public static void main(String[] args) {
        System.out.println(somu(2,3));
    }
}
