public class Stereo implements ElectronicDevice {

    private int volume = 0;
    
    public void on() {
        
        System.out.println("Stereo is on");
        
    }

    public void off() {
        
        System.out.println("Stereo is off");
        
    }

    public void volumeUp() {
        
        volume++;
        
        System.out.println("Stereo Volume is at: " + volume);
        
    }

    public void volumenDown() {
        
        volume--;
        
        System.out.println("Stereo Volume is at: " + volume);
        
    }
    
}