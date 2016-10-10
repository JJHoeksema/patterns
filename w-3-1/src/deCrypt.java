

import javax.xml.bind.DatatypeConverter;


/**
 * Created by user on 9-10-2016.
 */
public class deCrypt {
    public void make(String arg){
        String decoded = new String(DatatypeConverter.parseBase64Binary(arg));
        System.out.println("Decrypted value is " + decoded + "\n");

    }
}
