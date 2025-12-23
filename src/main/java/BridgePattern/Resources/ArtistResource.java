package BridgePattern.Resources;

import BridgePattern.Interfaces.IResources;

public class ArtistResource implements IResources {
    @Override
    public String snippet() {
        return "ArtistSnippet";
    }

    @Override
    public String title() {
        return "ArtistTitle";
    }

    @Override
    public String image() {
        return "ArtistImage";
    }

    @Override
    public String url() {
        return "ArtistUrl";
    }
}
