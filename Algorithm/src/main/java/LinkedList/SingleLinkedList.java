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
        singleLinkedListTest.del(1);
        singleLinkedListTest.list();

        System.out.println("有效节点的个数" + getLength(singleLinkedListTest.getHead()));
    }

    //获取到单链表的节点个数
    public static int getLength(HeroNode head) {
        if (head.next == null) {
            return 0;
        }
        int length = 0;
        HeroNode temp = head.next;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    /*
     * 查找链表的第k个元素
     * 首先获取链表有效节点的个数
     * */
    public static HeroNode finaLastIndexNode(HeroNode head, int index) {
        if (head.next == null) {
            return null;
        }
        int size = getLength(head);
        if (index < 0 || index > size) {
            return null;
        }
        HeroNode temp = head.next;
        for (int i = 0; i < size - index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    /*
     *
     * 链表反转(百度面试题目)
     * */
    public static void reversetList(HeroNode head) {
        if (head.next == null || head.next.next == null) {
            return;
        }
        HeroNode temp = head.next;//定义temp只想正真数据的第一个
        HeroNode next = null;//指向temp节点的后一个
        HeroNode reverseHead = new HeroNode(0, "", "");
        while (temp != null) {
            next = temp.next;//保存当前节点的下一个节点
            temp.next = reverseHead.next;//把temp的下一个jie'd节点指向新的链表的最前端
            temp=next;//temp 往后移动
        }
        head.next=reverseHead.next;
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
    //头节点不存数据(后新建一个temp节点来替代head节点)
    private HeroNode head = new HeroNode(0, "", "");

    public HeroNode getHead() {
        return head;
    }

    public void setHead(HeroNode head) {
        this.head = head;
    }

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

    public void addByOrder(HeroNode heroNode) {
        HeroNode temp = head;
        boolean flag = false;//该节点是否存在
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.no > heroNode.no) {//可以插入


                break;
            } else if (temp.next.no == heroNode.no) {
                flag = true;
                break;
            }

            temp = temp.next;
        }

        if (flag == true) {
            System.out.println("该点已经存在" + heroNode.no);
        } else {
            heroNode.next = temp.next;
            temp.next = heroNode;
        }

    }

    public void update(HeroNode newHeroNode) {
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        HeroNode temp = head.next;
        boolean flag = false;
        while (true) {
            if (temp == null) {
                break;//遍历完所有链表
            }
            if (temp.no == newHeroNode.no) {
                flag = true;
                break;
            }
            temp = temp.next;

        }
        if (flag == true) {
            temp.name = newHeroNode.name;
            temp.nickname = newHeroNode.nickname;
        } else {
            System.out.println("没有找到");
        }

    }

    public void del(int no) {
        HeroNode temp = head;
        boolean flag = false;//是否找到
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.no == no) {
                //找到了这个节点了
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag = true) {
            temp.next = temp.next.next;
        } else {
            System.out.println("没找到");
        }
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