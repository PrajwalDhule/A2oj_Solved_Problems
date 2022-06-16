import java.util.*;

public class TwoBagsOfPotatoes{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int y = sc.nextInt();
        int k = sc.nextInt();
        int n = sc.nextInt();
        int start;
        if(y >= k) {
            start = (y / k + 1) * k - y;
        }
        else {
            start = k - y;
        }

        int end = n - y;

        if(start > end){
            System.out.println(-1);
        }
        else {
            for(int i=start; i<=end; i=i+k){
                System.out.print(i + " ");
            }
        }
    }
}