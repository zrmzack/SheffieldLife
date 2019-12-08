package FinalExam;

import java.util.*;

/**
 * @author zack
 * @create 2019-12-05-21:16
 */
public class StringTest {
    public static void main(String[] args) {
        String x="For oft, when on my couch I lie\n" +
                "In vacant or in pensive mood,\n" +
                "They flash upon that inward eye\n" +
                "Which is the bliss of solitude;\n" +
                "And then my heart with pleasure fills,\n" +
                "And dances with the daffodils.";
        System.out.println(printhashmap(getmap(x)));

    }
    public static String printhashmap(HashMap hashMap) {
        hashMap.remove("");
        String x = "";
        Iterator iter = hashMap.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            x += key + ":" + value + "\n";

        }
        return x;
    }
    public static HashMap<String, Integer> getmap(String x) {
        HashMap<String, Integer> hashMap = new HashMap();
        String[] temps = x.split(" ");
        for (int i = 0; i < temps.length; i++) {
            if (!hashMap.containsKey(temps[i])) {
                hashMap.put(temps[i], 1);
            } else {
                hashMap.put(temps[i], hashMap.get(temps[i]) + 1);
            }
        }
        Comparator<Map.Entry<String, Integer>> comparable = (o1, o2) -> o2.getValue() - o1.getValue();

        List<HashMap.Entry<String, Integer>> list = new LinkedList<>();
        list.addAll(hashMap.entrySet());
        Collections.sort(list, comparable);
        HashMap<String, Integer> hashMap1 = new HashMap();
        for (Iterator it = list.iterator(); it.hasNext(); ) {
            Map.Entry entry = (Map.Entry) it.next();
            hashMap1.put((String) entry.getKey(), (Integer) entry.getValue());
        }

        return hashMap1;
    }
}
