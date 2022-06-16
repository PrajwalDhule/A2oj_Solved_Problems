import java.util.*;

public class Domino{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int x, y, i;
        int sum, xSum = 0, ySum = 0;
        boolean isOddSum = false;
        for(i=0; i<n; i++){
            x = sc.nextInt();
            y = sc.nextInt();
            sum = x + y;
            xSum += x;
            ySum += y;
            if(!(sum % 2 == 0)){
                isOddSum = true;
                break;
            }
        }
        for(i=i+1; i<n; i++){
            x = sc.nextInt();
            y = sc.nextInt();
            xSum += x;
            ySum += y;
        }
        if(xSum % 2 == 0 && ySum % 2 ==0){
            System.out.println(0);
        }
        else if(!((xSum + ySum) % 2 ==0)){
            System.out.println(-1);
        }
        else {
            if(isOddSum){
                System.out.println(1);
            }
            else {
                System.out.println(-1);
            }
        }
    }
}