import java.util.HashMap;
import java.util.Set;

public class Prog {
    public static void main(String[] args) {

        // Create HashMap of three entries.
        HashMap<String, Integer> h = new HashMap<>();
        h.put("nikhil", 1);
        h.put("anuj", 2);
        h.put("nidhi", 3);

        // Get keys.
        Set<String> keys = h.keySet();

        // Loop over String keys.
        for (String key : keys) {
            System.out.println(key);
        }
    }
}
