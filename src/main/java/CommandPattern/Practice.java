package CommandPattern;

import CommandPattern.Commands.LightOffCommand;
import CommandPattern.Commands.LightOnCommand;
import CommandPattern.Invokers.Invoker;
import CommandPattern.Receivers.Light;

public class Practice {
    static void main() {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        Invoker invoker = new Invoker(lightOnCommand,lightOffCommand,lightOnCommand,lightOffCommand);

        invoker.lightOnCommand();
        invoker.lightOffCommand();

    }
}
