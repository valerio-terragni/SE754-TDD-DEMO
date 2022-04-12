package nz.ac.auckland.se754;

public class PasswordChecker {
    private User user;
    public PasswordChecker(User user) {
        this.user = user;
    }

    public boolean checkPasswordAndSet(String pwd){
        if(pwd.length() >= 8) {
            user.setPassword(pwd);
            return true;
        }
        return false;

    }
}
