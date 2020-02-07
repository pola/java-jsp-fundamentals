import java.util.regex.*;
import java.nio.file.Paths;
import java.nio.file.Files;

class Regex
{
    public static void main(String[] args) throws Exception {
        byte[] encoded = Files.readAllBytes(Paths.get("/Users/mpol/neuromancer.txt"));
        String neuromancer = new String(encoded, "UTF-8");

        //Pattern pattern = Pattern.compile("([A-ZÅÄÖ][a-zåäö]{10,})"); 
        Pattern pattern = Pattern.compile("([a-z]*s){4,}"); 
        Matcher matcher = pattern.matcher(neuromancer);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}