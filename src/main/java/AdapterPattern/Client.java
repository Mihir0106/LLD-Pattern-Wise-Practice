package AdapterPattern;

import AdapterPattern.Interfaces.ITarget;

public class Client {

    ITarget target;

    public Client(ITarget target){
        this.target = target;
    }

    public void TransferData(){
        target.request();
    }
}
