package GuiLab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zack
 * @create 2019-12-04-7:29
 */
public class GuiLab2 extends JFrame implements ActionListener {
    private JTextField jTextField1;
    private JLabel name;
    private JLabel Score;
    private JTextField jTextField2;
    private List<Object> list = new ArrayList<>();
    private JButton jButton;
    private JLabel showInfo;
    private JButton exit;
    private List<Integer> listScore = new ArrayList<>();

    public GuiLab2() {

        setSize(600, 300);
        Container contentPane = this.getContentPane();
       contentPane.setLayout(new BorderLayout());
        JPanel jFrameInput = new JPanel();
        jTextField1 = new JTextField(15);


        jTextField2 = new JTextField(10);
        jButton = new JButton(" Enter Score ");
        jButton.addActionListener(this);
        name = new JLabel("Name： ");
        Score = new JLabel("Score： ");
        jFrameInput.add(name);
        jFrameInput.add(jTextField1);
        jFrameInput.add(Score);
        jFrameInput.add(jTextField2);
        jFrameInput.add(jButton);
        contentPane.add(jFrameInput, BorderLayout.NORTH);

        JPanel jFrameshow = new JPanel();

        showInfo = new JLabel("Top Scorer is :");
        showInfo.setFont(new Font("黑体",Font.BOLD,30));
        jFrameshow.add(showInfo);
        contentPane.add(jFrameshow, BorderLayout.CENTER);

        exit = new JButton("Quit");
        exit.addActionListener(this);
        JPanel jPanelQuit = new JPanel();
        jPanelQuit.add(exit);
        contentPane.add(jPanelQuit, BorderLayout.SOUTH);

    }

    public static void main(String[] args) {
        GuiLab2 guiLab2 = new GuiLab2();
        guiLab2.setVisible(true);
        guiLab2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (((JButton) source).getText().equals("Quit")) {
            System.out.println(printmessate((ArrayList) list));
            System.exit(0);
        } else {
            String tempname = jTextField1.getText();
            int score;
            score = Integer.parseInt(jTextField2.getText());
            if (score > 100 || score < 0) {
                System.out.println("sorry");
            } else {
                people people = new people(tempname, score);
                if (getmax((ArrayList) listScore, score)) {
                    showInfo.setText("Top Scorer is :" + people.name + ":" + people.score);
                }
                list.add(people);
                listScore.add(people.score);
                jTextField1.setText("");
                jTextField2.setText("");
            }


        }
    }

    public class people {
        String name;
        int score;

        public people(String name, int score) {
            this.name = name;
            this.score = score;
        }

        @Override
        public String toString() {
            return name + ":" + score + "\n";
        }

    }

    public boolean getmax(ArrayList arrayList, int x) {
        int temp = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if ((int) arrayList.get(i) > temp) {
                temp = (int) arrayList.get(i);
            }
        }
        return x > temp;
    }

    public String printmessate(ArrayList arrayList) {
        String temp = "";
        for (Object x : arrayList) {
            temp += x.toString();
        }
        return temp;
    }
}
