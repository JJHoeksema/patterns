/**
 * Created by user on 9-10-2016.
 */
public class textVars {
    private String start = "Program to crypt or encrypt a string. First type crypt or decrypt";
    private String error = "No valid input";
    private String crypt = "Type tekst to crypt: ";
    private String decrypt = "Type tekst to decrypt: ";

    public void getStart(){
        System.out.println(start);
    }
    public void getError(){
        System.out.println(error);
    }
    public void getCrypt(){
        System.out.println(crypt);
    }
    public void getDecrypt(){
        System.out.println(decrypt);
    }
}
