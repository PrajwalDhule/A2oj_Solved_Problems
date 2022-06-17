import java.util.*;
import java.io.*;

public class Fence{
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
            int k = in.nextInt();
            int[] arr = new int[n];
            
            for (int i=0; i<n; i++){
                arr[i] = in.nextInt();
            }

            int sum = 0;
            for (int i=0; i<k; i++){
                sum += arr[i];
            }
            int min = sum;
            int ans = 1;

            for (int i=1; i<n-k+1; i++){
                sum += arr[i+k-1] - arr[i-1];

                if(sum < min){
                    min = sum;
                    ans = i+1;
                }
            }
            out.print(ans);
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}