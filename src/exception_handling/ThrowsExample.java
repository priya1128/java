package exception_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExample {
    /*
    Exception

    Checked Exception
    UnChecked Exception
     */
    public void sample() throws FileNotFoundException {
        File file = new File("C:\\Users\\Naveen S\\Documents\\3F33FF_Invalid.png");
        FileInputStream fin = new FileInputStream(file);
    }
}
