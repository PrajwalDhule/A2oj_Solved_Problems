import java.util.*;

public class BigSegment{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE ,max = 0;
        int index = -1;
        for(int i=0; i<n; i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            if(l < min){
                min = l;
                index = -1;
            }
            if(r > max){
                max = r;
                index = -1;
            }
            if(l == min && r == max){
                index = i+1;
            }
        }
        System.out.println(index);
    }
}