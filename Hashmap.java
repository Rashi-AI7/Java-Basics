import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        //insertion
        map.put("India", 120);
        map.put("Sri Lanka", 300);
        map.put("Singapore", 609);
        map.put("Germany", 870);
        System.out.println(map);
        if(map.containsKey("Indonesia")) {
            System.out.println("key is present in the map");
        } else {
            System.out.println("key is not present in the map");
        }
        System.out.println(map.get("India")); //key exists
        System.out.println(map.get("Indonesia")); //key doesn't exist(null)
        
        //Iteration1
        for(Map.Entry<String, Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        //iteration 2
        Set <String> keys = map.keySet();
        for(String key: keys){
            System.out.println(key + " "+ map.get(key));
        }
    }
}
