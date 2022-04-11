import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class ConfigLoader {
    private static final String filePath = "src/main/java/config.json";
    public static void main(String[] args) throws IOException, ParseException {
        FileReader reader = new FileReader(filePath);
        JSONParser jsonParser = new JSONParser();
        Object obj = jsonParser.parse(reader);
        JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
        String TitCon = (String) jsonObject.get("titansConfig");
        System.out.println(TitCon);


    }
}
