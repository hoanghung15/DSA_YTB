package Recursion;


public class Giaithua {
    public static int TinhGiaithua(int n) {
        if(n==0){
            return 1;
        }
        return n*TinhGiaithua(n-1);
    }

    public static void main(String[] args) {
        System.out.println(TinhGiaithua(8));
    }
}
