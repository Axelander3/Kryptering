import javax.swing.*;
import java.awt.*;

/**
 * Created by alexander on 2017-09-06.
 */
public class GUIDesign {
        // c.insets = new Insets(UPPE, VÄNSTER, NERE, HÖGER);

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
        JButton inButton = new JButton("INPUT");
        panel.add(inButton, c);




        //OUTPUT
        c.gridx = 5;
        c.gridy = 0;
        c.insets = new Insets(margin, margin*3, margin, margin*2);
        JButton outButton = new JButton("OUTPUT");
        panel.add(outButton, c);




        //KEY
        c.gridx = 3;
        c.gridy = 2;
        c.insets = new Insets(margin/2, margin, margin, margin);
        JButton keyButton = new JButton("KEY");
        panel.add(keyButton, c);

        //JRADIOBUTTON & LABEL
        c.gridx = 2;
        c.gridy = 3;
        c.insets = new Insets(0, 0, 0, 0);
        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButton btnEncrypt = new JRadioButton();
        JRadioButton btnDecrypt = new JRadioButton();
        buttonGroup.add(btnEncrypt);
        buttonGroup.add(btnDecrypt);

        JLabel textEncrypt = new JLabel("Encrypt");
        JLabel textDecrypt = new JLabel("Decrypt");
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



        //STAR
        c.gridx = 3;
        c.gridy = 5;
        c.insets = new Insets(margin*2, margin, margin, margin);
        JButton startButton = new JButton("START");
        startButton.setPreferredSize(new Dimension(140, 40));
        panel.add(startButton, c, GridBagConstraints.BOTH);

        //PROGRESS BAR
        c.gridx = 3;
        c.gridy = 6;
        c.insets = new Insets(margin*3, margin, margin*3, margin);
        JProgressBar progressBar = new JProgressBar();
        progressBar.setPreferredSize(new Dimension(300, 30));
        progressBar.setBackground(Color.CYAN);
        progressBar.setMaximum(0);
        progressBar.setMaximum(100);
        panel.add(progressBar, c);




        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }
}
