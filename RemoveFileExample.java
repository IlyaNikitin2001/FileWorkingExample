import java.io.File;
import java.io.IOException;

/**
 * Created by USER on 19.02.2017.
 */
public class RemoveFileExample {
    public static void main(String[] args) {
        File file= new File("1.txt");
        File folder= new File("C:\\Users\\USER\\Desktop\\text1");
        File toname= new File(folder,file.getName());
        file.renameTo(toname);
        File file3= new File("3.txt");
        try {
            file3.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
