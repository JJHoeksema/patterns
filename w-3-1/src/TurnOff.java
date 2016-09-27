public class TurnOff implements Command {

    ElectronicDevice theDevice;
    
    public TurnOff(ElectronicDevice newDevice){
        
        theDevice = newDevice;
        
    }
    
    public void execute() {
        theDevice.off();
        
    }
    public void undo() {

        theDevice.on();
    }
    public String info() {

        return "off";

    }

}