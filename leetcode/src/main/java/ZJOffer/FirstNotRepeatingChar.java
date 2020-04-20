package ZJOffer;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @author zack
 * @create 2020-02-02-16:24
 */
public class FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (hashMap.containsKey(str.charAt(i))) {
                Integer tempTimes = hashMap.get(str.charAt(i));
                tempTimes++;
                hashMap.put(str.charAt(i), tempTimes);

            } else {
                hashMap.put(str.charAt(i), 1);
            }
        }
        int valuetemp = 0;
        char tempChar = ' ';
        for (int i = 0; i < str.length(); i++) {
            tempChar = str.charAt(i);
            if (hashMap.get(tempChar) == 1) {
                return i;
            }
        }
        return 0;
    }

}
