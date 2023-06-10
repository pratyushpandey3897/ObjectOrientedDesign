package designPatterns.singleton.singleThreaded;

public class DatabaseCollection {

    private static DatabaseCollection databaseCollection = null;
    private DatabaseCollection () {}

    //Not going to work in concurrent environment
    public static DatabaseCollection getInstance(){
        if (databaseCollection == null){
            databaseCollection = new DatabaseCollection ();
        }
        return databaseCollection;
    }
}
