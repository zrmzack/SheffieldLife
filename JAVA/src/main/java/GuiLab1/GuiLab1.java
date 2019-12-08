package GuiLab1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;

/**
 * @author zack
 * @create 2019-12-03-20:42
 */
public class GuiLab1 extends JFrame implements ActionListener {
    public static final int DEFAULT_WIDTH = 300;
    public static final int DEFAULT_HEIGHT = 200;

    private JTextArea text;
    private JTextField jTextField;
    private Set<Object> list = new HashSet<>();
    private Set<Object> listprintinfo = new HashSet<>();

    public GuiLab1() {

        setTitle("This is the name of the test lab ");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        Container contentPane = this.getContentPane();
        contentPane.setLayout(new BorderLayout());
        JPanel jPane_animal = new JPanel(new GridLayout(5, 1));
        JPanel jPane2_testshow = new JPanel();
        jPane2_testshow.setSize(300, 30);
        jPane2_testshow.setLayout(new BorderLayout());
        JPanel jPane_edittext = new JPanel();
        jPane_edittext.setLayout(new BorderLayout());
        jPane_animal.add(makebutton("Cow", this));
        jPane_animal.add(makebutton("GOAT", this));
        jPane_animal.add(makebutton("SHEEP", this));
        jPane_animal.add(makebutton("CHICKEN", this));
        jPane_animal.add(makebutton("EXIT", this));
        text = new JTextArea();
        text.setEditable(false);
        jTextField = new JTextField();
        jTextField.setBackground(Color.GRAY);
        jPane_edittext.add(jTextField);
        jPane2_testshow.add(text);
        contentPane.add(jPane_animal, BorderLayout.EAST);
        contentPane.add(jPane2_testshow, BorderLayout.CENTER);
        contentPane.add(jPane_edittext, BorderLayout.SOUTH);
    }

    private JButton makebutton(String animalname, ActionListener actionListener) {
        JButton button = new JButton(animalname);
        button.addActionListener(actionListener);
        return button;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Object source = event.getSource();
        if (((JButton) source).getText() == "EXIT") {
            System.exit(0);
        } else {
            if (jTextField.getText().length() == 0) {
                System.out.println("请输入东西");
            } else {
                String tempname = jTextField.getText();
                if ((((JButton) source).getText().equals("Cow"))) {
                    Cow cow = new Cow(tempname);
                    listprintinfo.add(tempname + "(" + ((JButton) source).getText() + ")");
                    list.add(cow);
                } else if (((((JButton) source).getText().equals("GOAT")))) {
                    Goat goat = new Goat(tempname);
                    listprintinfo.add(tempname + "(" + ((JButton) source).getText() + ")");
                    list.add(goat);
                } else if (((((JButton) source).getText().equals("SHEEP")))) {

                    Sheep sheep = new Sheep(tempname);
                    listprintinfo.add(tempname + "(" + ((JButton) source).getText() + ")");
                    list.add(sheep);
                } else {
                    Chicken chicken = new Chicken(tempname);
                    listprintinfo.add(tempname + "(" + ((JButton) source).getText() + ")");
                    list.add(chicken);
                }

                 text.setText(printmessage((Set) listprintinfo));

                jTextField.setText("");
            }
        }
    }

    public static void main(String[] args) {
        GuiLab1 guiLab1 = new GuiLab1();
        guiLab1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiLab1.setVisible(true);

    }

    public class Cow {
        String classname;


        public Cow(String classname) {
            this.classname = classname;
        }

        @Override
        public String toString() {
            return classname + "(" + "Cow" + ")";
        }
    }

    public class Goat {
        String classname;

        public Goat(String classname) {
            this.classname = classname;
        }

        @Override
        public String toString() {
            return classname + "(" + "Goat" + ")";
        }


    }

    public class Sheep {
        String classname;

        public Sheep(String classname) {
            this.classname = classname;
        }

        @Override
        public String toString() {
            return classname + "(" + "Sheep" + ")";
        }
    }

    public class Chicken {
        String classname;

        public Chicken(String classname) {
            this.classname = classname;
        }

        @Override
        public String toString() {
            return classname + "(" + "Chicken" + ")";
        }
    }

    public String toString(Set arrayList) {
        String x = "";
        for (Object y : arrayList) {
            x += y + "\n";
        }
        return x;
    }

    public String printmessage(Set hashset) {
        String x = "";
        for (Object o : hashset) {
            x += "                             " + o.toString() + "\n";
        }
        return x;
    }

}
