package designPatterns.singleton.doublecheckloading;

public class DatabaseCollection {

    //Will load at class load time
    private static DatabaseCollection databaseCollection = null;
    private DatabaseCollection() {}


    public static DatabaseCollection getInstance(){

        if (databaseCollection == null) {
            synchronized(DatabaseCollection.class) {
                if (databaseCollection == null)
                    databaseCollection = new DatabaseCollection ();

            }
        }
        return databaseCollection;
    }
}
