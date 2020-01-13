package LinkedList;

/**
 * @author zack
 * @create 2020-01-14-3:00
 */
public class DoubleLinkedList {
    public static void main(String[] args) {

    }

}

class DoubleLinkedListTest {
    private HeroNodeDouble head = new HeroNodeDouble(0, "", "");

    public HeroNodeDouble getHead() {
        return head;
    }

    public void setHead(HeroNodeDouble head) {
        this.head = head;
    }

    //打印循环链表
    public void PrintDoubeLinkList() {
        if (head.next == null) {
            System.out.println("没东西");
            return;
        }
        HeroNodeDouble temp = head.next;
        while (true) {
            if (temp == null) {
                System.out.println("没东西了");
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }

    /*
     *循环双链表增加
     * */
    public void add(HeroNodeDouble heroNodeDouble) {
        HeroNodeDouble temp = null;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        //把新的节点加到temp后面
        temp.next = heroNodeDouble;
        //把新节点的前索引指向temp
        heroNodeDouble.pre = temp;
    }

    public void updateNode(HeroNodeDouble heroNodeDouble) {
        //默认flag无法找到
        boolean flag = false;
        //辅助接点建立
        HeroNodeDouble temp = head.next;
        if (head.next == null) {
            System.out.println("链表是空的呢");
            return;
        }
        while (true) {
            if (temp == null) {
                System.out.println("空的");
                break;
            }
            if (temp.no == heroNodeDouble.no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.name = heroNodeDouble.name;
            temp.nickname = heroNodeDouble.nickname;
        } else {
            System.out.println("再见了您嘞");
        }

    }

    public void delete(int no) {
        if (head.next == null) {
            System.out.println("链表是空的");
            return;
        }
        HeroNodeDouble temp = head.next;
        boolean flag = false;
        while (true) {
            if (temp == null) {
                System.out.println("链表循环结束");
                break;
            }
            if (temp.no == no) {
                //找到了这个节点了
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            //最后一个节点会有问题
            temp.pre.next = temp.next;
            //判断是否是最后一个点哈哈哈
            if (temp.next != null) {
                temp.next.pre = temp.pre;
            }
        } else {
            System.out.println("没东西给你弄");
        }

    }


}

class HeroNodeDouble {
    public int no;
    public String name;
    public String nickname;
    public HeroNodeDouble next;
    public HeroNodeDouble pre;

    public HeroNodeDouble(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname +
                '}';
    }

}
