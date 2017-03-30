import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by USER on 18.02.2017.
 */
public class CopyFileExample {
    public static void main(String[] args) {
        Path sourse= Paths.get("text/2.txt");
        Path destenation = Paths.get("text2/1.txt");
        try{
            Files.copy(sourse, destenation);
        } catch(IOException e){
            System.out.println("error");

        }
    }
}
