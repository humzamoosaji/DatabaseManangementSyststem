package za.ac.ukzn.dbinterface.Database;

import za.ac.ukzn.dbinterface.UI.Login;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection db = new DatabaseConnection();
        db.connect();
        Login.displayLoginScreen();
        db.disconnect();
    }
}
