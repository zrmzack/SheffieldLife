package Collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author zack
 * @create 2019-11-18-4:04
 */
public class Method {
    public static void main(String[] args) {
        Method.foreachtest();;
    }

    private static void fortest() {
        List list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        for (int x = 0; x < list.size(); x++) {
            int y = (int) list.get(x);
            System.out.println(y);
        }
    }

    public static void iteratortest() {
        List list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void foreachtest() {
        List<Integer> list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        for (Integer x : list) {
            System.out.println(x);
        }
    }
}
