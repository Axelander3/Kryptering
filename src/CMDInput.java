/**
 * Created by alexander on 2017-08-30.
 */
public class CMDInput {

    public static void main(String[] args) {


        // CMDInput args1 args2 args3

        if (args.length > 3) {
            System.out.println("Too many arguments");
        } else if (args.length == 3) {
            System.out.println(args[2] + args[1] + args[0]);
        } else if (args.length == 2) {
            try {
                int sum =  Integer.parseInt(args[0])+Integer.parseInt(args[1]);
                System.out.println(args[0] + " + " + args[1] + " = " + sum);
            } catch (NumberFormatException e) {
            }
        } else if (args.length == 1) {
            System.out.println("You say: " + args[0]);

        } else {
           System.out.println("No argmuments specified");
        }

    }

}
