import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        
       
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.containsKey("key1");
        map.containsValue("value1");
        System.out.println(map.get("key1")); 
    }
}
