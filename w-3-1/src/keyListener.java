import java.util.Observable;
import java.util.Scanner;

/**
 * Created by user on 9-10-2016.
 */
class keyListener extends Observable implements Runnable{
    public void run() {
        while (true) {
            String response = new Scanner(System.in).next();
            setChanged();
            notifyObservers(response);
        }
    }

}
