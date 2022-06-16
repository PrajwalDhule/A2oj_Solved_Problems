import java.util.*;

public class CosmicTables{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[][] arr = new int[n][m];
        int[] rows = new int[n];
        int[] cols = new int[m];

        // taking n x m values as input
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        // initializing two arrays containing row and column indices
        for(int i=0; i<Math.min(n, m); i++){
            rows[i] = cols[i] = i;
        }
        for(int i=Math.min(n, m); i<n; i++){
            rows[i] = i;
        }
        for(int i=Math.min(n, m); i<m; i++){
            cols[i] = i;
        }

        char s;
        int x, y;
        for(int i=0; i<k; i++){
            s = sc.next().charAt(0);
            x = sc.nextInt();
            y = sc.nextInt();
            // swapping row indices
            if(s == 'r'){
                int temp = rows[x-1];
                rows[x-1] = rows[y-1];
                rows[y-1] = temp;
            }
            // swapping column indices
            else if(s == 'c'){
                int temp = cols[x-1];
                cols[x-1] = cols[y-1];
                cols[y-1] = temp;
            }
            // fetching actual required indices and printing the value
            else {
                System.out.println(arr[rows[x-1]][cols[y-1]]);
            }
        }
    }
}