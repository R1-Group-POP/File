
import java.io.*;

/**
 *
 * @author Patrick
 */
public class IntegerExample {

    public static void main(String args[]) throws IOException {
        String filePath = "C://Users//Patrick//Desktop//intfil";
        
        /**
         * OUTPUT
         */
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(filePath)));
        int i = 1;
        while(i <= 10) {
            out.writeInt(i++);
        }
        out.close();

        /**
         * INPUT
         */
        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(filePath)));
        while(in.available() != 0) {
            System.out.println("" + in.readInt());
        }
        in.close();
    }
}
