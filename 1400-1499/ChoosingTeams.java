import java.util.*;

public class ChoosingTeams{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int current;
        int count = 0;
        for(int i=0; i<n; i++){
            current = sc.nextInt();
            if(current + k <= 5){
                count++;
            }
        }
        System.out.println(count/3);
    }
}