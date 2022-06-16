import java.util.*;

public class SerejaAndSuffixes{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[m];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<m; i++){
            arr2[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(arr[n-1], n-1);
        int distinct = 1;
        arr[n-1] = distinct;
        for(int i=n-2; i>=0; i--){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], i);
                arr[i] = ++distinct;
            }
            else {
                arr[i] = distinct;
            }
        }
        for(int i=0; i<m; i++){
            System.out.println(arr[arr2[i]-1]);
        }
    }
}