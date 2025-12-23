package CommandPattern.Invokers;

import CommandPattern.Interfaces.ICommand;

public class Invoker {

    ICommand on;
    ICommand off;
    ICommand up;
    ICommand down;

    public Invoker(ICommand on, ICommand off, ICommand up, ICommand down){
        this.on = on;
        this.off = off;
        this.up = up;
        this.down = down;
    }

    public void lightOnCommand(){
        on.execute();
    }

    public void lightOffCommand(){
        off.execute();
    }
}
