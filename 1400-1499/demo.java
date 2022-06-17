import java.util.*;
import java.io.*;

public class demo {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine().trim();
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
            FastReader in = new FastReader();
            FastWriter out = new FastWriter();
                String s = in.nextLine();
                int x, y, m = in.nextInt();
                int[] arr = new int[s.length()];
                int[] ans = new int[m];

                arr[0] = 0;
                int sum = 0;
                for (int i = 1; i < s.length(); i++) {
                    if (s.charAt(i) == s.charAt(i - 1)) {
                        arr[i] = ++sum;
                    } else {
                        arr[i] = sum;
                    }
                }

                for (int i = 0; i < m; i++) {
                    x = in.nextInt();
                    y = in.nextInt();
                    ans[i] = arr[y - 1] - arr[x - 1];
                }

                for (int i : ans) {
                    out.println(i);
                }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}