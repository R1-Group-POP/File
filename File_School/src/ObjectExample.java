import java.io.*;
/**
 *
 * @author Patrick
 */
public class ObjectExample {

    public static void main(String[] args) throws IOException, ClassNotFoundException{
        String filePath = "C://Users//Patrick//Desktop//objectfil";
        Person p1 = new Person("2104892119", "Patrick Kann");
        Person p2 = new Person("5345345345", "Oliver Korfitsen");
        
        /**
         * Output
         */
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath));
        out.writeObject(p1);
        out.writeObject(p2);
        out.close();
        p1 = null;
        p2 = null;
        
        /**
         * Input
         */
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath));
        p1 = (Person)in.readObject();
        p2 = (Person)in.readObject();
        in.close();
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
