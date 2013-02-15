
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;





/**
 *
 * @author Patrick
 */
public class FilIgen {
    
    private FileOutputStream fos;
    private FileInputStream fis;
    
    private DataOutputStream dos;
    private DataInputStream dis;

    public FilIgen(String filePath) {
        try {
            fos = new FileOutputStream(filePath);
            fis = new FileInputStream(filePath);
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } finally {
            dos = new DataOutputStream(fos);
            dis = new DataInputStream(fis);
        }
    }
    
    public void writeLn(String str) {
        try {
            dos.writeBytes(str);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public String readFirstLn() {
        try {
            return dis.readLine();
        } catch (IOException ex) {
            return "";
        }
    }
    
    public void close() {
        try {
            dis.close();
            dos.close();
            
            fis.close();
            fos.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
