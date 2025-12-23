package CommandPattern.Commands;

import CommandPattern.Interfaces.ICommand;
import CommandPattern.Receivers.Light;

public class LightOffCommand implements ICommand {
    Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {

    }

    @Override
    public void unExecute() {

    }
}
