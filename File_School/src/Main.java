
/**
 *
 * @author Patrick
 */
public class Main {
    
    private FilIgen fi;
    
    public Main() {
        fi = new FilIgen("C://Users//Patrick//Desktop//test.txt");
    }
    
    public static void main(String args[]) {
        Main main = new Main();
        main.fi.writeLn("Hesteged");
        System.out.println(main.fi.readFirstLn());
        main.fi.close();
    }
}
