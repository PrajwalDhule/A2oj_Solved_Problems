import java.util.*;

public class PlayingCubes{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(Math.max(n, m) - 1 + " " + Math.min(n, m));
    }
}