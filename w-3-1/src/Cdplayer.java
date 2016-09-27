public class Cdplayer implements ElectronicDevice {

    private int volume = 0;
    
    public void on() {
        
        System.out.println("Cdplayer is on");
        
    }

    public void off() {
        
        System.out.println("Cdplayer is off");
        
    }

    public void volumeUp() {
        
        volume++;
        
        System.out.println("Cdplayer Volume is at: " + volume);
        
    }

    public void volumenDown() {
        
        volume--;
        
        System.out.println("Cdplayer Volume is at: " + volume);
        
    }
    
}