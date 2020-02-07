import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CommonTasks {
    // genrate a String with a random value
    public static String randomString(int length) {
        byte[] array = new byte[length];
        new Random().nextBytes(array);
        return new String(array, Charset.forName("UTF-8"));
    }

    // reads a file and gives the content (or null) as a String
    public static String readFile(String filePath) {
        try {
            RandomAccessFile r = new RandomAccessFile(filePath, "r");

            r.seek(0);

            byte[] bytes = new byte[(int) r.length()];
            r.read(bytes);

            r.close();

            return new String(bytes);
        } catch (Exception e) {
            return null; // if we cannot read the file
        }
    }

    // return a list of all files in a folder
    public static List<String> filesInFolder(String folderPath) {
        File folder = new File(folderPath);
        List<String> files = new ArrayList<>();

        for (File file : folder.listFiles()) {
            files.add(file.getAbsolutePath());
        }

        return files;
    }
}