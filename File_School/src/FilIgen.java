
import java.io.*;

/**
 *
 * @author Patrick
 */
public class FilIgen {
    
    private DataOutputStream dos;
    private DataInputStream dis;
    test

    public FilIgen(String fileName) {
        
        try {
            dos = new DataOutputStream(new FileOutputStream(fileName));
            dis = new DataInputStream(new FileInputStream(fileName));
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
    }
    
    public void writeLn(String str) {
        try {
            dos.writeBytes(str);
        } catch (IOException ex) {
            System.out.println("Could not write");
        }
    }
    
    public String readFirstLn() {
        return "";
    }
    
    public String readLn(int line) {
        return "";
    }
    
    public void close() {
        try {
            dos.close();
            dis.close();
        } catch (IOException ex) {
            System.out.println("Could not close");
        }
    }
}
