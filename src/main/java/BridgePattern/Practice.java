package BridgePattern;

import BridgePattern.BaseClasses.View;
import BridgePattern.Interfaces.IResources;
import BridgePattern.Resources.ArtistResource;
import BridgePattern.Resources.AuthorResource;
import BridgePattern.Views.LongView;
import BridgePattern.Views.ShortView;

public class Practice {
    public static void main(String[] args) {
        IResources artistResource = new ArtistResource();
        IResources authorResource = new AuthorResource();
        View longView = new LongView(artistResource);
        View shortView = new ShortView(authorResource);
        String longShow = longView.show();
        String shortShow = shortView.show();

        System.out.println("long Show : " + longShow);
        System.out.println("Short Show : " + shortShow);

    }
}
