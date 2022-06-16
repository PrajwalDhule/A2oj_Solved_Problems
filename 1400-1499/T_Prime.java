//TLE

import java.util.*;

public class T_Prime{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            long x = sc.nextLong();

            if(x == 1L){
                System.out.println("NO");
            }
            else {
                long root = (long) (Math.sqrt(x));

                boolean isPrime = true;
                if (root * root == x) {
                    for (int j = 2; j <= (int) (Math.sqrt(root)); j++) {
                        if (root % j == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    if (isPrime) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}