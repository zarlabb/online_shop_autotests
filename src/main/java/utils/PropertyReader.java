package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

    public static Properties readProperties () {
        Properties p = new Properties();

        try (InputStream input = new FileInputStream("C:\\Users\\Bohdan_Zherebukh\\IdeaProjects\\NewArt\\src\\test\\resources\\url.properties"))
        {
            //load a properties file
           p.load(input);
        }  catch (IOException e) {
            e.printStackTrace();
        }
        return p;
}
}

