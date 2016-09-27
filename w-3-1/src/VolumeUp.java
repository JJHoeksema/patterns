public class VolumeUp implements Command {

    ElectronicDevice theDevice;

    public VolumeUp(ElectronicDevice newDevice){
        
        theDevice = newDevice;
        
    }
    
    public void execute() {
        
        theDevice.volumeUp();
        
    }
    public void undo() {

        theDevice.volumenDown();

    }
    public String info() {

        return "up";

    }

}