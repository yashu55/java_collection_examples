import java.net.Socket;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
 
public class App3HashMap {
 
    // 15%4
    // constains(15) O(n)
    // hashfn(int val){
    //    return val%4;
//

 //   }
    public static void main(String[] args) {
 
        HashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
         
        String rt = map.put(5, "Five");
        map.put(8, "Five");
        map.put(6, "Six");
        map.put(4, "Four");
        map.put(2, "Two");
        // String oldval = map.put(5, "fiveeee");
        // String text = map.get(5);
         
        // System.out.println(text);
        // System.out.println(rt);
        // System.out.println(oldval);

       
        // for(Map.Entry<Integer, String> entry: map.entrySet()) {
        //     int key = entry.getKey();
        //     String value = entry.getValue(); 
        //     System.out.println(key + ": " + value);
        // }
         
    }

    // class Entr<>{
    //     static Integer x = 100;
    //     Integer key;
    //     String value;

    //     static void print(){
    //         System.out.println("Hello");
    //     }
    // }
 
}