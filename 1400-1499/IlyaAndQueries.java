import java.util.*;

public class IlyaAndQueries{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        String s = sc.nextLine();
        int x, y, m = sc.nextInt();
        int[] arr = new int[s.length()];
        int[] ans = new int[m];

        arr[0] = 0;
        int sum = 0;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                arr[i] = ++sum;
            }
            else {
                arr[i] = sum;
            }
        }

        for(int i=0; i<m; i++){
            x = sc.nextInt();
            y = sc.nextInt();
            ans[i] = arr[y-1] - arr[x-1];
        }

        for(int i : ans){
            System.out.println(i);
        }
    }
}