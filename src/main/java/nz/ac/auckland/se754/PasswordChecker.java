package nz.ac.auckland.se754;

public class PasswordChecker {

    public PasswordChecker(User user) {
    }

    public boolean checkPasswordAndSet(String pwd){
        if(pwd.length() >= 8) {
            return true;
        }
        return false;
    }
}
