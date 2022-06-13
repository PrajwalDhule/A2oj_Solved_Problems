import java.util.*;

public class AmusingJoke{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        String guest = sc.nextLine();
        String host = sc.nextLine();
        String pile = sc.nextLine();
        if(pile.length() != guest.length() + host.length()){
            System.out.println("NO");
        }
        else{
            HashMap<Character, Integer> map = new HashMap<>();
            int i;
            for(i=0; i<guest.length(); i++){
                if(map.get(guest.charAt(i)) != null){
                    map.put(guest.charAt(i), map.get(guest.charAt(i)) + 1);
                }
                else {
                    map.put(guest.charAt(i), 1);
                }
            }
            for(i=0; i<host.length(); i++){
                if(map.get(host.charAt(i)) != null){
                    map.put(host.charAt(i), map.get(host.charAt(i)) + 1);
                }
                else {
                    map.put(host.charAt(i), 1);
                }
            }
            for(i=0; i<pile.length(); i++){
                if(map.get(pile.charAt(i)) == null){
                    System.out.println("NO");
                    break;
                }
                else {
                    if(map.get(pile.charAt(i)) == 1){
                        map.remove(pile.charAt(i));
                    }
                    else {
                        map.put(pile.charAt(i), map.get(pile.charAt(i))-1);
                    }
                }
            }
            if(i == pile.length()){
                System.out.println("YES");
            }
        }
    }
}