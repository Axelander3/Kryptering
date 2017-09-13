import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Author: Alexander
 *
 * Last uppdate: ons 6 september 2017
 *
 */
public class CMDInput {

    public static void main(String[] args) {


        GUIDesign gui = new GUIDesign();



        // CMDInput args1 args2 args3

/*

        List<String> listInput = new ArrayList<>();

        try {
            Scanner sc = new Scanner(new File(args[0]));

            while(sc.hasNextLine()) {
                listInput.add(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        String[] input = new String[listInput.size()];

        input = listInput.toArray(input);


        if (input.length > 3) {
            System.out.println("Too many arguments");
            for (String s : input) {
                System.out.println(s);
            }
        } else if (input.length == 3) {
            System.out.println(input[2] + " " + input[1]  + " " + input[0]);
        } else if (input.length == 2) {
            try {
                int sum =  Integer.parseInt(input[0])+Integer.parseInt(input[1]);
                System.out.println(input[0] + " + " + input[1] + " = " + sum);
            } catch (NumberFormatException e) {
                System.out.println("Both arguments is not numbers.");
            }
        } else if (input.length == 1) {
            System.out.println("You say: " + input[0]);

        } else {
           System.out.println("No argmuments specified");
        }

    */
    }


}
