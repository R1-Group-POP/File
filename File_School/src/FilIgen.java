
import java.io.BufferedReader;
import java.io.BufferedWriter;
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
    
    private BufferedWriter bw;
    private BufferedReader br;

    public FilIgen(String filePath) {
        fos = new FileOutputStream(filePath);
        fis = new FileInputStream(filePath);
        
        dos = new DataOutputStream(fos);
        dis = new DataInputStream(fis);
        
        bw = new BufferedWriter(dos);
    }
    
    public void writeLn(String str) {
        
    }
    
    public String readFirstLn() {
        
    }
    
    public void close() {
        
    }
}
