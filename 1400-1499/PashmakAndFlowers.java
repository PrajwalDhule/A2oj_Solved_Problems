import java.util.*;

public class PashmakAndFlowers{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int max, min, x;
        long minCount = 1L, maxCount = 1L;

        max = min = sc.nextInt();
        for(int i=1; i<n; i++){
            x = sc.nextInt();
            if(x > max){
                max = x;
                maxCount = 1L;
            }
            else if(x == max){
                maxCount++;
            }
            if(x < min){
                min = x;
                minCount = 1L;
            }
            else if(x == min){
                minCount++;
            }
        }
        if(min == max){
            System.out.println(0 + " " + (minCount * (minCount-1))/2L);
        }
        else {
            System.out.println(max - min + " " + maxCount * minCount);
        }
    }
}