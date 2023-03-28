package Test;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JavaHashMap {
    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("Rachel", "Dancer");
        hashmap.put("Sofia", "Teacher");
        hashmap.put("Brandon", "Assistant");
        hashmap.put("Gill", "Waiter");
        hashmap.put("Tracy", "Pianist");
        hashmap.put("Dan", "Director");
        hashmap.replace("Gill", "Manager");
        hashmap.remove("Sofia");
        Set<HashMap.Entry<String, String>> setHashMap = hashmap.entrySet();
        for (HashMap.Entry<String, String> i : setHashMap) {
            System.out.println(i.getKey() + ": " + i.getValue());
        }
    }
}
