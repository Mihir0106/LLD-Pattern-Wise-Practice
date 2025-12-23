package BridgePattern.Views;

import BridgePattern.BaseClasses.View;
import BridgePattern.Interfaces.IResources;

public class ShortView extends View {

    public ShortView(IResources resources) {
        super(resources);
    }

    @Override
    public String show() {
        String Image = resources.image();
        String url = resources.url();
        return Image + " with " + url;
    }
}
