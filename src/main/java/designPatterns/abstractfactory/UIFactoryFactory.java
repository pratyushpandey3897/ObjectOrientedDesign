package designPatterns.abstractfactory;

//Practical Factory
public class UIFactoryFactory {
    public static UIFactory getUiFactoryPlatform(SupportedPlatforms supportedPlatforms){
        switch (supportedPlatforms){
            case IOS : return new IOSUIFactory ();
            case ANDROID: return new AndroidUIFactory ();
        }
        return null;
    }
}
