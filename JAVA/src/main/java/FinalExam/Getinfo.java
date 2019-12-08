package FinalExam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author zack
 * @create 2019-12-05-4:52
 */
public class Getinfo {
    public ArrayList getAlldoctext(String pathname) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            File file = new File(pathname);
            InputStreamReader inputStreamReader = new InputStreamReader((new FileInputStream(file)));
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            String str;

            while ((str = bufferedReader.readLine()) != null) {
                arrayList.add(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return arrayList;
    }

    public ArrayList getAlltexttitle(String pathname) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            File file = new File(pathname);
            InputStreamReader inputStreamReader = new InputStreamReader((new FileInputStream(file)));
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String str;

            while ((str = bufferedReader.readLine()) != null) {
                if (str.contains("Text:")) {
                    break;
                } else {
                    arrayList.add(str);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return arrayList;
    }

    public ArrayList getmaintext(ArrayList arrayListtitle, ArrayList arrayListAlltext) {
        for (int x = 0; x < arrayListtitle.size(); x++) {
            for (int y = 0; y < arrayListtitle.size(); y++) {
                if (arrayListtitle.get(x).equals(arrayListAlltext.get(y))) {
                    arrayListAlltext.remove(y);
                }
            }

        }

        return arrayListAlltext;
    }

    public String getnumbertext(ArrayList arrayList) {
        int temp = 0;
        String x[];
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i).toString());
            x = arrayList.get(i).toString().trim().replace("\\s", "").split(" ");
            temp += x.length;
        }
        String s = "";
        s = s + temp;
        return s;
    }

    public String gettextString(ArrayList arrayList) {
        String x = "";
        String y = "";
        for (int i = 0; i < arrayList.size(); i++) {
            x = arrayList.get(i).toString().trim();
            y += x;
        }
        return y;
    }

    public String printhashmap(HashMap hashMap) {
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

    public HashMap<String, Integer> getmap(String x) {
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