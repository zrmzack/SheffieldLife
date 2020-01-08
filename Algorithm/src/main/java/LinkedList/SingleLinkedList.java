package LinkedList;

/**
 * @author zack
 * @create 2020-01-09-1:53
 */
public class SingleLinkedList {
    public static void main(String[] args) {
        HeroNode heroNode1 = new HeroNode(1, "松江", "及时雨");
        HeroNode heroNode2 = new HeroNode(2, "松江", "玉麒麟");
        HeroNode heroNode3 = new HeroNode(3, "吴用", "智多星");
        HeroNode heroNode4 = new HeroNode(4, "林冲", "豹子头");
        SingleLinkedListTest singleLinkedListTest = new SingleLinkedListTest();
        singleLinkedListTest.add(heroNode1);
        singleLinkedListTest.add(heroNode2);
        singleLinkedListTest.add(heroNode3);
        singleLinkedListTest.add(heroNode4);
        singleLinkedListTest.list();
    }
}

class HeroNode {
    public int no;
    public String name;
    public String nickname;
    public HeroNode next;

    public HeroNode(int no, String name, String nickname) {
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

class SingleLinkedListTest {
    //头节点不存数据
    private HeroNode head = new HeroNode(0, "", "");

    public void add(HeroNode heroNode) {
        //生成一个辅助节点
        HeroNode temp = head;
        while (true) {
            //链表最后得值
            if (temp.next == null) {
                break;
            }
            //如果不是最后，temp往后移动
            temp = temp.next;
        }
        //将最后的节点next指向了新的节点
        temp.next = heroNode;
    }

    public void list() {
        //链表空
        if (head.next == null) {
            return;
        }
        //头节点不动，新建辅助变量
        HeroNode temp = head.next;
        while (true) {
            //链表到最后了
            if (temp == null) {
                break;
            }
            System.out.println(temp);
            //temp往后移动
            temp = temp.next;


        }
    }
}