
import java.io.Serializable;


/**
 *
 * @author Patrick
 */
public class Person implements Serializable{
    private String cpr;
    private String navn;
    
    public Person(String cpr, String navn) {
        this.cpr = cpr;
        this.navn = navn;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    @Override
    public String toString() {
        return "Person{" + "cpr=" + cpr + ", navn=" + navn + '}';
    }
    
    
}
