package BridgePattern.BaseClasses;

import BridgePattern.Interfaces.IResources;

public abstract class View {
    protected IResources resources;

    public View(IResources resources){
        this.resources = resources;
    }

    public abstract String show();
}
