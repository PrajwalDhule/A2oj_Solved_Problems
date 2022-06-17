import java.util.*;
import java.io.*;

public class CosmicTables{
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }
    public static void main(String[] args) {
        try {
            FastReader in=new FastReader();
            FastWriter out = new FastWriter();
            int n = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt();
            int[][] arr = new int[n][m];
            int[] rows = new int[n];
            int[] cols = new int[m];

            // taking n x m values as input
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = in.nextInt();
                }
            }
            // initializing two arrays containing row and column indices
            for (int i = 0; i < Math.min(n, m); i++) {
                rows[i] = cols[i] = i;
            }
            for (int i = Math.min(n, m); i < n; i++) {
                rows[i] = i;
            }
            for (int i = Math.min(n, m); i < m; i++) {
                cols[i] = i;
            }

            char s;
            int x, y;
            for (int i = 0; i < k; i++) {
                s = in.next().charAt(0);
                x = in.nextInt();
                y = in.nextInt();
                // swapping row indices
                if (s == 'r') {
                    int temp = rows[x - 1];
                    rows[x - 1] = rows[y - 1];
                    rows[y - 1] = temp;
                }
                // swapping column indices
                else if (s == 'c') {
                    int temp = cols[x - 1];
                    cols[x - 1] = cols[y - 1];
                    cols[y - 1] = temp;
                }
                // fetching actual required indices and printing the value
                else {
                    out.println(arr[rows[x - 1]][cols[y - 1]]);
                }
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}