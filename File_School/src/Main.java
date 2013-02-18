
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Patrick
 */
public class Main {

    public static void main(String args[]) {
        String filePath = "C://Users//Patrick//Desktop//fil";
        
        /**
         * OUTPUT
         */
        try {
            DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(filePath)));
            out.writeInt(22);
            out.writeInt(200);
            out.close();
        } catch (IOException ex) {
            System.out.println("Output");
            ex.printStackTrace();
        }

        /**
         * INPUT
         */
        try {
            DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(filePath)));
            System.out.println("" + in.readInt());
            System.out.println("" + in.readInt());
            in.close();
        } catch(IOException ex) {
            System.out.println("Input");
            ex.printStackTrace();
        }
    }
}
