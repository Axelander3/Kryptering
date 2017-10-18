import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.HashMap;

/**
 * Created by alexander on 2017-09-06.
 */
public class GUIDesign {
        // c.insets = new Insets(UPPE, VÄNSTER, NERE, HÖGER);

    public static void main(String[] args) {
        GUIDesign gui = new GUIDesign();
        Crypt crypt = new Crypt();
        FileEdit edit = new FileEdit();
        MVC mvc = new MVC(gui, crypt, edit);
    }

    public JButton inButton = new JButton("INPUT");
    public String[] allArgs = new String[3];
    public JButton outButton = new JButton("OUTPUT");
    public JButton keyButton = new JButton("KEY");
    public ButtonGroup buttonGroup = new ButtonGroup();
    public JRadioButton btnEncrypt = new JRadioButton();
    public JRadioButton btnDecrypt = new JRadioButton();
    public JLabel textEncrypt = new JLabel("Encrypt");
    public JLabel textDecrypt = new JLabel("Decrypt");
    public JButton startButton = new JButton("START");
    public JProgressBar progressBar = new JProgressBar();
    public boolean enCrypt = true;


    public GUIDesign() {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);



        JPanel panel = new JPanel(new GridBagLayout(), false);

        GridBagConstraints c = new GridBagConstraints();

        int margin  = 10;

        //INPUT
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(margin, margin*2, margin, margin*3);
        panel.add(inButton, c);

        inButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
                int result = fileChooser.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    allArgs[0] = selectedFile.getAbsolutePath();
                    System.out.println("input selected");
                }
            }
        });




        //OUTPUT
        c.gridx = 5;
        c.gridy = 0;
        c.insets = new Insets(margin, margin*3, margin, margin*2);
        panel.add(outButton, c);

        outButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
                int result = fileChooser.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    allArgs[1] = selectedFile.getAbsolutePath();
                    System.out.println("output selected");
                }
            }
        });




        //KEY
        c.gridx = 3;
        c.gridy = 2;
        c.insets = new Insets(margin/2, margin, margin, margin);
        panel.add(keyButton, c);

        keyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
                int result = fileChooser.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    allArgs[2] = selectedFile.getAbsolutePath();
                    System.out.println("key selected");
                }
            }
        });

        //JRADIOBUTTON & LABEL
        c.gridx = 2;
        c.gridy = 3;
        c.insets = new Insets(0, 0, 0, 0);
        buttonGroup.add(btnEncrypt);
        buttonGroup.add(btnDecrypt);
        btnEncrypt.setSelected(true);

        panel.add(btnEncrypt, c);
        c.gridx = 2;
        c.gridy = 4;
        panel.add(textEncrypt, c);
        c.gridx = 4;
        c.gridy = 3;
        panel.add(btnDecrypt, c);
        c.gridx = 4;
        c.gridy = 4;
        panel.add(textDecrypt, c);

        btnEncrypt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enCrypt = true;
            }
        });
        btnDecrypt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enCrypt = false;
            }
        });



        //START
        c.gridx = 3;
        c.gridy = 5;
        c.insets = new Insets(margin*2, margin, margin, margin);
        startButton.setPreferredSize(new Dimension(140, 40));
        panel.add(startButton, c, GridBagConstraints.BOTH);






        //PROGRESS BAR
        c.gridx = 3;
        c.gridy = 6;
        c.insets = new Insets(margin*3, margin, margin*3, margin);
        progressBar.setPreferredSize(new Dimension(300, 30));
        progressBar.setBackground(Color.lightGray);
        progressBar.setMaximum(0);
        progressBar.setMaximum(100);
        panel.add(progressBar, c);



        //panel.setBackground(Color.BLUE);
        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    public void addCalculateListener(ActionListener listenForStartButton) {
        startButton.addActionListener(listenForStartButton);
    }
}
