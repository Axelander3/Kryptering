import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alexander on 2017-10-04.
 */
public class MVC {

        //allArgsSet[0] = input
        //allArgsSet[1] = output
        //allArgsSet[2] = key
        private GUIDesign theView;
        private Crypt theModel;
        private FileEdit theReader;


        public MVC (GUIDesign theView, Crypt theModel, FileEdit theReader) {
            this.theModel = theModel;
            this.theView = theView;
            this.theReader = theReader;

            this.theView.addCalculateListener(new CalculateListener());
        }

    private class CalculateListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            System.out.println("hej");
            String value = theReader.getFileValue("/home/alexander/Desktop/myFile");
            System.out.println(value);
            try {
                String output = "";

                if ((theView.allArgs[0] != null) && (theView.allArgs[1] != null) && (theView.allArgs[2] != null)) {
                    if (theView.enCrypt = true) {
                        System.out.println(theView.allArgs[0]);
                        System.out.println(theReader.getFileValue(theView.allArgs[0]));
                        String input = theReader.getFileValue(theView.allArgs[0]);
                        String outPath = theView.allArgs[1];
                        String key = theReader.getFileValue(theView.allArgs[2]);

                        output = theModel.crypt(input, key);
                        theReader.writeToFile(output, outPath);
                        JOptionPane.showMessageDialog(null, "Encrypting finished!");
                    } else {
                        System.out.println(theView.allArgs[0]);
                        System.out.println(theReader.getFileValue(theView.allArgs[0]));
                        String input = theReader.getFileValue(theView.allArgs[0]);
                        String outPath = theView.allArgs[1];
                        String key = theReader.getFileValue(theView.allArgs[2]);

                        output = theModel.crypt(input, key);
                        theReader.writeToFile(output, outPath);
                        JOptionPane.showMessageDialog(null, "Decrypting finished!");
                    }

                }


            } catch (Exception exc) {
                exc.printStackTrace();
            }
        }
    }


}