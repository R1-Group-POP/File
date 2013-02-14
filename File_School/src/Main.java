
/**
 *
 * @author Patrick
 */
public class Main {
    
    private FilIgen fi;
    
    public Main() {
        fi = new FilIgen("C://Users//Patrick//Documents//test.txt");
    }
    
    public static void main(String args[]) {
        Main main = new Main();
        main.fi.writeLn("hest");
        System.out.println(main.fi.readFirstLn());
        main.fi.close();
    }
}
