import java.util.Observable;
import java.util.Observer;

/**
 * Created by user on 9-10-2016.
 */
public class mainC {


    public static void main(String[] args) {
        textVars text = new textVars();
        text.getStart();

        keyListener listener = new keyListener();

        varStorage vars = new varStorage();
        listener.addObserver(new Observer() {
            public void update(Observable obj, Object arg) {
                if(vars.getCryptvar() ==0){
                    if(arg.toString().equals("crypt")) {
                        text.getCrypt();
                        vars.setCryptvar(1);
                    } else if (arg.toString().equals("decrypt")){
                        text.getDecrypt();
                        vars.setCryptvar(2);
                    } else {
                        text.getError();
                    }
                } else {
                    if (vars.getCryptvar()==1){
                        Crypt crypt = new Crypt();
                        crypt.make(arg.toString());
                        vars.setCryptvar(0);
                        text.getStart();
                    } else if (vars.getCryptvar()==2){
                        deCrypt decrypt = new deCrypt();
                        decrypt.make(arg.toString());
                        vars.setCryptvar(0);
                        text.getStart();
                    }

                }
            }
        });

        new Thread(listener).start();
    }


}
