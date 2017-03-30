import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by USER on 19.02.2017.
 */
public class Path1Example {
    private Path path;
    private Path path1;
    public static void main(String[] args) {
        Path1Example path= new Path1Example();
        path.createPath();
        path.createPath1();
        path.createFile();
    }
    public void createPath() {

        path= Paths.get("C:\\Users\\USER\\Desktop\\text1\\1.txt");
        try {
            Path Dir = Files.createDirectories(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(path.toString());

    }
    public void createPath1(){
        path1= Paths.get("C:\\Users\\USER\\Desktop\\text2/2.txt");
        try {
            Path newDir1 = Files.createDirectories(path1);

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(path1.toString());
    }
    public void createFile(){
        File file = new File("1.txt");
        File folder= new File("C:\\Users\\USER\\Desktop\\text1\\");
       File file1= new File(folder,file.getName());
        file.renameTo(folder);


        System.out.println(file.getAbsoluteFile());
    }

}
