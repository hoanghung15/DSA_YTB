package Recursion;

public class ThapHaNoi {
    public static void hanoi(int n,char start,char auxiliary,char end){
        if(n==1){
            System.out.println("di chuyen  dia 1 tu " + start +"to "+end  );
            return;
        }
        //b1:di chuyen n-1 tu A sang B trung gian C
        hanoi(n-1,start,end,auxiliary);
        //b2: di chuyen 1 Tu A->C
        System.out.println("Di chuyển đĩa " + n + " từ " + start + " → " + end);
        //b3: di chuyen n-1 tu B->C qua A
        hanoi(n-1,auxiliary,start,end);
    }

    public static void main(String[] args) {
        hanoi(3,'A','B','C');

    }
}
