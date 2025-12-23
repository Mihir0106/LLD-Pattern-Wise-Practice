package BridgePattern.Resources;

import BridgePattern.Interfaces.IResources;

public class AuthorResource implements IResources {
    @Override
    public String snippet() {
        return "AuthorSnippet";
    }

    @Override
    public String title() {
        return "AuthorTitle";
    }

    @Override
    public String image() {
        return "AuthorImage";
    }

    @Override
    public String url() {
        return "AuthorUrl";
    }
}
