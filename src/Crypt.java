/**
 * Created by alexander on 2017-10-04.
 */
public class Crypt {

    public static void main(String[] args) {


    }
    public String crypt(String input, String key) {
        String output = "";
        for (int i = 0; i<input.length(); i++) {
            output += (char) (input.charAt(i) ^ key.charAt(i % (key.length()-1)));
        }
        return output;
    }
}
