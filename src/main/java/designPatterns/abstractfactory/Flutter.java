package designPatterns.abstractfactory;

public class Flutter {
    public void setTheme () {
        System.out.println ("set theme");
    }

    public void setRefresh () {
        System.out.println ("set refresh rate");
    }

    public UIFactory createUIFactory (SupportedPlatforms platform) {
        return UIFactoryFactory.getUiFactoryPlatform (platform);
    }

}
