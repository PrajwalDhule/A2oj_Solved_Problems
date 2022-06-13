import java.util.*;

public class LunchRush{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int f = sc.nextInt();
        int t = sc.nextInt();
        int max;
        if(t > k){
            max = f - t + k;
        }
        else {
            max = f;
        }
        for(int i=1; i<n; i++){
            f = sc.nextInt();
            t = sc.nextInt();
            if(t > k){
                if(f - t + k > max){
                    max = f - t + k;
                }
            }
            else {
                if(f > max){
                    max = f;
                }
            }
        }

        System.out.println(max);
    }
}