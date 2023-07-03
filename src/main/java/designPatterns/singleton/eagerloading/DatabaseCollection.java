package designPatterns.singleton.eagerloading;

public class DatabaseCollection {

    //Will load at class load time
    private static final DatabaseCollection databaseCollection = new DatabaseCollection ();
    private DatabaseCollection() {}


    public static DatabaseCollection getInstance(){
        return databaseCollection;
    }
}
