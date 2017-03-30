import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by USER on 18.02.2017.
 */
public class PathExample  {
    private Path path;
    private Path path1;
    public static void main(String[] args) {
        PathExample path= new PathExample();
        path.createPath();
        path.createPath1();

    }

    public void createPath() {
//создание экземпляра класса  Path - это объект
        path= Paths.get("text1/1.txt");

        try {
//            создаем файл
            Path newDir = Files.createDirectories(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(path.toString());

    }
    public void createPath1(){
//        создание экземпляра класса P
        path1= Paths.get("text2/2.txt");
        try {
            Path newDir1 = Files.createDirectories(path1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(path1.toString());
    }
}
