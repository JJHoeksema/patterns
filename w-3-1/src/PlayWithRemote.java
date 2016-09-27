import java.util.Stack;

public class PlayWithRemote{
    
    public static void main(String[] args){
        Stack<String> history = new Stack();
        Stack<ElectronicDevice> edev = new Stack();
        // Gets the ElectronicDevice to use
        
        ElectronicDevice TV = TVRemote.getDevice();
        ElectronicDevice CD = CdRemote.getDevice();
        ElectronicDevice ST = StereoRemote.getDevice();
        
        // TurnOn contains the command to turn on the tv
        // When execute() is called on this command object
        // it will execute the method on() in Television
        
        TurnOn onCommand = new TurnOn(TV);
        edev.push(TV);
        history.push(onCommand.info());
        
        // Calling the execute() causes on() to execute in Television
        
        DeviceButton onPressed = new DeviceButton(onCommand);
        
        // When press() is called theCommand.execute(); executes
        
        onPressed.press();

        //Turnoff
        TurnOff offCommand = new TurnOff(TV);
        edev.push(TV);
        history.push(offCommand.info());
        onPressed = new DeviceButton(offCommand);
        onPressed.press();


        //Turnon
        TurnOn cdCommand = new TurnOn(CD);
        edev.push(CD);
        history.push(cdCommand.info());
        onPressed = new DeviceButton(cdCommand);
        onPressed.press();

        VolumeDown cdCommand1 = new VolumeDown(CD);
        edev.push(CD);
        history.push(cdCommand1.info());
        onPressed = new DeviceButton(cdCommand1);
        onPressed.press();


        while(!history.isEmpty()){
            switch(history.pop()){
                case "on" :
                    TurnOn onCommand1 = new TurnOn(edev.pop());
                    DeviceButton onPressed1 = new DeviceButton(onCommand1);
                    onPressed1.pressback();
                    break;
                case "off" :
                    TurnOff onCommand2 = new TurnOff(edev.pop());
                    DeviceButton onPressed2 = new DeviceButton(onCommand2);
                    onPressed2.pressback();
                    break;
                case "up" :
                    VolumeUp onCommand3 = new VolumeUp(edev.pop());
                    DeviceButton onPressed3 = new DeviceButton(onCommand3);
                    onPressed3.pressback();
                    break;
                case "down" :
                    VolumeDown onCommand4 = new VolumeDown(edev.pop());
                    DeviceButton onPressed4 = new DeviceButton(onCommand4);
                    onPressed4.pressback();
                    break;

            }
        }
       
    }
    
}