import java.io.*;

/**
 * Created by alexander on 2017-10-18.
 */
public class FileEdit {

    public String getFileValue(String filePath) {
        String everything = "";
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            everything = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return everything;
    }

    public void writeToFile(String toWrite, String outPath) {
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(outPath), "utf-8"))) {
            writer.write(toWrite);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
