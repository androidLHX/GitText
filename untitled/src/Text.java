import java.io.File;

/**
 * Created by hui on 2016/8/6.
 */
public class Text {
    public static void main(String[] args) {
        File file=new File("./");
        String[] files=file.list();
        for (String fil:files
             ) {
            System.out.println(fil);
        }
    }
}
