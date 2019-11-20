package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author zack
 * @create 2019-11-18-4:28
 */
public class Method {
    public static void main(String[] args) {
        Method.entrySetIteratorGetKeyValue();
    }

    public static void keyIteratorTest() {
        Map map = new HashMap();
        map.put("age", "21");
        map.put("name", "zrm");
        map.put("lover", "zrm");
        for (Object x : map.keySet()) {
            String str = (String) map.get(x);//得到每个key多对用value的值
            System.out.println(str);
        }
    }

    public static void entrySetIteratorGetKeyValue() {
        Map map = new HashMap();
        map.put("age", "21");
        map.put("name", "zrm");
        map.put("lover", "zrm");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }
    }



}
