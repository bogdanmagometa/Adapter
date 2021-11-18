package db;

public class Authorization extends Авторизація {
    public boolean authorize(DataBase db) {
        db.getUserData();
        return true;
    }
}
