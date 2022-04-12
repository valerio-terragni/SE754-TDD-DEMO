package nz.ac.auckland.se754;

public class PasswordChecker {
    private User user;
    DataBase db;
    public PasswordChecker(User user, DataBase db) {
        this.user = user;
        this.db= db;
    }

    public boolean checkPasswordAndSet(String pwd){
        if(pwd.length() >= 8 && pwd.contains(db.getName(user))) {
            user.setPassword(pwd);
            return true;
        }
        return false;

    }
}
