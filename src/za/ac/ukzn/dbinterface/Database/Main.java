package za.ac.ukzn.dbinterface.Database;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection db = new DatabaseConnection();
        db.connect();
        db.disconnect();
    }
}
