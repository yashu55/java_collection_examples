import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        // if (o1 > o2)
        // return -1;
        // else if (o1 < o2)
        // return 1;
        // else
        // return 0;
        return o2 - o1;
    }

}


public class App4SortedMaps {

    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        // Map<Integer, String> treeMap = new TreeMap<>(new MyComparator());

        // Map<Integer, String> treeMap = new TreeMap<>(new Comparator<Integer>() {
        // @Override
        // public int compare(Integer o1, Integer o2) {
        // return o2 - o1;
        // }
        // });

        Map<Integer, String> treeMap = new TreeMap<>((Integer o1, Integer o2) -> o2 - o1);
        // Map<Employee, String> treeMapStr = new TreeMap<>((String o1, String o2) -> o1.compareTo(o2));

        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(9, "fox");
        map.put(4, "cat");
        map.put(8, "dog");
        map.put(1, "giraffe");
        map.put(0, "swan");
        map.put(15, "bear");
        map.put(6, "snake");

        for (Integer key : map.keySet()) {
            String value = map.get(key);

            System.out.println(key + ": " + value);
        }
    }

}