import java.util.*;
import java.io.*;

public class SerejaAndSuffixes{
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
            int[] arr = new int[n];
            int[] arr2 = new int[m];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            for (int i = 0; i < m; i++) {
                arr2[i] = in.nextInt();
            }

            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(arr[n - 1], n - 1);
            int distinct = 1;
            arr[n - 1] = distinct;
            for (int i = n - 2; i >= 0; i--) {
                if (!map.containsKey(arr[i])) {
                    map.put(arr[i], i);
                    arr[i] = ++distinct;
                } else {
                    arr[i] = distinct;
                }
            }
            for (int i = 0; i < m; i++) {
                out.println(arr[arr2[i] - 1]);
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}