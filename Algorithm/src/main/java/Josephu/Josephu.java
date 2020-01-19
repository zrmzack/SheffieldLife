package Josephu;

/**
 * @author zack
 * @create 2020-01-18-17:47
 */
public class Josephu {
    public static void main(String[] args) {
        CircleSingleLinkedList c = new CircleSingleLinkedList();
        c.addBoy(5);
    }
}

class CircleSingleLinkedList {
    //创建第一个节点
    private Boy first = new Boy(-1);

    //添加孩子节点，成为唤醒列表
    public void addBoy(int nums) {
        if (nums < 2) {
            //至少有两个
            return;
        }
        for (int i = 1; i <= nums; i++) {
            Boy curBoy = null;//辅助节点
            Boy boy = new Boy(i);
            if (i == 1) {
                first = boy;
                first.setNext(first);//构成一个环状
                curBoy = first;
            } else {
                //把节
                curBoy.setNext(boy);
                boy.setNext(first);
                curBoy.setNext(boy);
            }


        }

    }

    public void showBoy() {
        Boy curBoy = first;
        if (first == null) {
            System.out.println("000");
            return;
        }
        while (true) {
            System.out.println(curBoy.getNo());
            if (curBoy.getNext() == first) {
                break;
            }
            curBoy = curBoy.getNext();
        }
    }

    /**
     * @param startNo从哪里开始数
     * @param countNumb数几下
     * @param nums孩子还有多少个
     */
    public void countBoy(int startNo, int countNumb, int nums) {
        if (first == null || startNo < 1 || startNo > nums) {
            System.out.println("错了");
            return;
        }
        Boy helper = first;
        while (true) {
            if (helper.getNext() == first) {
                break;
            }
            helper = helper.getNext();
        }
        for (int j = 0; j < startNo - 1; j++) {
            first = first.getNext();
            helper = helper.getNext();
        }
        while (true) {
            if (helper == first) {
                break;
            }
            for (int j = 0; j < countNumb - 1; j++) {
                first = first.getNext();
                helper = helper.getNext();
            }
            System.out.println("出圈顺序" + first.getNo());
            first = first.getNext();
            helper.setNext(first);
        }
        System.out.printf("留下来的\n", helper.getNo());
    }
}

class Boy {
    private int no;
    private Boy next;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Boy(int no) {
        this.no = no;
    }

    public Boy getNext() {
        return next;
    }

    public void setNext(Boy next) {
        this.next = next;
    }
}