import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ConfigLoader {
    private static final String Path = "C://Users//AmirAli Seyedzadegan//Documents//GitHub//ReinerAndTheJava//src//main//java";

    public static void main(String[] args) {
        File file =new File(Path + "//config.json");
        try {
            String content = new String(Files.readAllBytes(Paths.get(file.toURI())),"UTF-8");
            //JSONObject json = new JSONObject(content);
            //String titanconfing = json.getStrin

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
