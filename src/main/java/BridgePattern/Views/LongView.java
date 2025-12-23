package BridgePattern.Views;

import BridgePattern.BaseClasses.View;
import BridgePattern.Interfaces.IResources;

public class LongView extends View {

    public LongView(IResources resources) {
        super(resources);
    }

    @Override
    public String show() {
        String snippet = resources.snippet();
        String title = resources.title();
        return snippet +" of "+ title;
    }
}
