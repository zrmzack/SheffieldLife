package FinalExam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author zack
 * @create 2019-12-05-2:15
 */
public class DocumentViewer extends JFrame implements ActionListener {
    public ArrayList arrayListTitle;
    public ArrayList arrayListAlltext;
    public ArrayList arrayListmainText;
    private JButton load;
    private JButton showmaintext;
    private JButton statistics;
    public JTextField input;
    private JTextArea showTitle;


    public DocumentViewer() {
        Getinfo getinfo = new Getinfo();
        setSize(400, 300);
        Container container = this.getContentPane();
        container.setVisible(true);
        container.setLayout(new BorderLayout());


        load = new JButton("load");
        load.addActionListener(this);
        input = new JTextField();
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(1, 2));
        jPanel.add(input);
        jPanel.add(load);
        container.add(jPanel, BorderLayout.NORTH);

        JPanel jPanel2 = new JPanel();
        showTitle = new JTextArea(30, 10);
        jPanel2.add(showTitle);
        jPanel2.setSize(400, 200);
        container.add(jPanel2, BorderLayout.CENTER);

        JPanel jPanel3 = new JPanel();
        showmaintext = new JButton("show");
        showmaintext.addActionListener(this);
        statistics = new JButton("alldoc");
        statistics.addActionListener(this);
        jPanel3.add(showmaintext);
        jPanel3.add(statistics);
        container.add(jPanel3, BorderLayout.SOUTH);

    }

    public static void main(String[] args) {
        DocumentViewer documentViewer = new DocumentViewer();
        documentViewer.setVisible(true);
        documentViewer.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String filename = input.getText();
        Object source = e.getSource();
        if (((JButton) source).getText().equals("load")) {
            Getinfo getinfo = new Getinfo();
            arrayListTitle = getinfo.getAlltexttitle(filename);
            String temp = "";
            for (Object x : arrayListTitle) {
                x += "\n";
                temp += x;
            }
            showTitle.setText(temp);
        } else if (((JButton) source).getText().equals("show")) {
            new ShowMainText();
        } else {
            new showalldoc();
        }
    }


    class ShowMainText extends JFrame {
        private JTextArea showMaintext;
        private JScrollPane jScrollPane;
        private ArrayList arrayListTitle;
        private ArrayList arrayListAlltext;
        private ArrayList arrayListmainText;

        public ShowMainText() {
            showMaintext = new JTextArea();
            showMaintext.setEnabled(false);
            String temp = input.getText();
            Getinfo getinfo = new Getinfo();
            arrayListTitle = getinfo.getAlltexttitle(temp);
            arrayListAlltext = getinfo.getAlldoctext(temp);
            arrayListmainText = getinfo.getmaintext(arrayListTitle, arrayListAlltext);
            setSize(400, 200);
            Container container = this.getContentPane();
            jScrollPane = new JScrollPane();
            String xx = "";
            for (Object x : arrayListmainText) {
                x += "\n";
                xx += x;
            }
            showMaintext.setText(xx);
            jScrollPane.add(showMaintext);
            jScrollPane.setViewportView(showMaintext);
            container.add(jScrollPane, BorderLayout.CENTER);
            this.setVisible(true);
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        }


    }

    class showalldoc extends JFrame {
        private ArrayList arrayListTitle;
        private ArrayList arrayListAlltext;
        private ArrayList arrayListmainText;
        private JTextArea showalldoc;
        private JTextArea tenWords;
        private HashMap hashMap = new HashMap();

        public showalldoc() {
            Container container = this.getContentPane();
            container.setLayout(new BorderLayout());
            showalldoc = new JTextArea();
            tenWords = new JTextArea();
            setSize(400, 200);
            setVisible(true);
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            String temp = input.getText();
            Getinfo getinfo = new Getinfo();
            arrayListTitle = getinfo.getAlltexttitle(temp);
            arrayListAlltext = getinfo.getAlldoctext(temp);
            arrayListmainText = getinfo.getmaintext(arrayListTitle, arrayListAlltext);
            showalldoc.setText(getinfo.getnumbertext(arrayListmainText));
            String x = getinfo.gettextString(arrayListmainText);
            hashMap = getinfo.getmap(x);
            x = getinfo.printhashmap(hashMap);
            System.out.println(x);
            tenWords.setText(x);
            JPanel jPanel = new JPanel();
            JPanel jPanel2 = new JPanel();
            jPanel.add(showalldoc);

            jPanel2.add(tenWords);
            container.add(jPanel,BorderLayout.SOUTH);
            container.add(jPanel2,BorderLayout.CENTER);

        }
    }
}
