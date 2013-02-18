
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author Patrick
 */
public class StringExample {

    public static void main(String[] args) throws IOException{
        String filePath = "C://Users//Patrick//Desktop//stringfil.txt";
        
        /**
         * Output
         */
        BufferedWriter out = new BufferedWriter(new FileWriter(filePath));
        out.write("Ged");
        out.newLine();
        out.write("Prut");
        out.close();
        
        /**
         * Input
         */
        BufferedReader in = new BufferedReader(new FileReader(filePath));
        System.out.println(in.readLine());
        System.out.println(in.readLine());
        in.close();
        
    }
}
