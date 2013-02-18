
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Patrick
 */
public class Main {
    
    private FilIgen fi;
    
    public Main() {
        fi = new FilIgen("C://Users//Patrick//Documents//test.dat");
    }
    
   // public static void main(String args[]) {
//        try {
//            DataOutputStream dout = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("C://Users//Patrick//Documents//test.dat")));
//            dout.write(10);
//            dout.write(12);
//            dout.close();
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        }
//        
//    }
}
