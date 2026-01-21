import java.util.HashMap;

public class Main67{
    public static void main(String[]args){

        // Hashmap = A data structure that stores key-value pairs
        //           Keys are unique, but Values can be duplicated
        //           Does not maintain any order, but is memory efficient
        //           Hashmap<Key, Value>

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Ryuki Action Figure", 125);
        map.put("Ryuki belt", 250);
        map.put("Ryuki cards", 55);
        map.put("Ryuki sword", 75);

        //map.remove("Ryuki belt");
        //System.out.println(map.get("Ryuki belt"));
        //System.out.println(map.containsKey("Ryuki belt"));

        if(map.containsKey("Ryuki cards")){
            System.out.println(map.get("Ryuki cards"));
        }
        else {
            System.out.println("Key not found");
        }

        System.out.println(map.containsValue(55));
        System.out.println(map.size());

        for(String key : map.keySet()){
            System.out.println(key + " : RM " + map.get(key));
        }

    }
}