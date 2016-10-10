import javax.xml.bind.DatatypeConverter;

/**
 * Created by user on 9-10-2016.
 */
public class Crypt {
    public void make(String arg){
        String encoded = DatatypeConverter.printBase64Binary(arg.getBytes());
        System.out.println("Crypted value is " + encoded+ "\n");
    }

}
