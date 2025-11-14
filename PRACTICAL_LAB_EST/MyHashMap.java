import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyHashMap {
    public static void main(String[] args){
        HashMap<Integer,String> hmap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        for(int i=1;i<=n;i++){
            hmap.put(i,sc.next());
        }
        System.out.println(hmap);
        for (Integer key : hmap.keySet()) {
            String value = hmap.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
        for (Map.Entry<Integer, String> entry : hmap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }







    }

}
