// Behavioral design pattern
// turns a command into an object sends it to someone
// someone executes it

// Target
interface Command{
    void execute();
}

// Receiver
class TV{
    public void turnon(){
        System.out.println("ON");
    }
    public void turnoff(){
        System.out.println("OFF");
    }
}

// Concrete command
class tvOnCommand implements Command{
    private TV tv;

    public tvOnCommand(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute(){
        tv.turnon();
    }
}

class tvOffCommand implements Command{
    private TV tv;

    public tvOffCommand(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute(){
        tv.turnoff();
    }
}

// Invoker
class Remote{
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }
}

public class CommandDemo{
    public static void main(String[] args){
        TV tv = new TV();

        Command tvOn = new tvOnCommand(tv);
        Command tvOff = new tvOffCommand(tv);

        Remote button = new Remote();
        button.setCommand(tvOn);
        button.pressButton();

        button.setCommand(tvOff);
        button.pressButton();
    }
}
