package CommandPattern.Commands;

import CommandPattern.Interfaces.ICommand;
import CommandPattern.Receivers.Light;

public class LightOnCommand implements ICommand {

    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.setLightState(true);
    }

    @Override
    public void unExecute() {
        light.setLightState(false);
    }
}
