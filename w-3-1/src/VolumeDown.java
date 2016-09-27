public class VolumeDown implements Command {

    ElectronicDevice theDevice;

    public VolumeDown(ElectronicDevice newDevice){
        
        theDevice = newDevice;
        
    }
    
    public void execute() {
        
        theDevice.volumenDown();
        
    }
    public void undo() {

        theDevice.volumeUp();

    }
    public String info() {

        return "down";

    }

}