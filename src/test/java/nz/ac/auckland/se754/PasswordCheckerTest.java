package nz.ac.auckland.se754;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;

/**
 *
 * USER STORY:
 *
 * As a user, I am required to enter a strong password when creating my account.
 *
 * ACCEPTANCE CRITERIA
 * - Each acceptance criterion should be independently testable
 * - Each acceptance criterion test should have a clear pass/fail result
 * - Acceptance criteria should be focused on the end result (functionality), not the mechanism through which it is achieved
 *
 *  Requirements of password
 *
 *  Must have at least 8 characters
 *  Cannot contain the name of the user
 *
 * ACs
 * - A user should be able to set a password of at least 8 characters [POSITIVE]
 * - A user should not be able to set a password of less than 8 characters [NEGATIVE]
 * - A user should be able to set a password if it does contains her/his name [POSITIVE]
 * - A user should not be able to set a password if contains her/his name [NEGATIVE]
 */
public class PasswordCheckerTest {

    @Test
    public void when_passwordAtLeast8characters_thenSetSuccessful(){
    User user = Mockito.mock(User.class);
    PasswordChecker checker = new PasswordChecker(user);
    boolean result = checker.checkPasswordAndSet("123456789");
    assertTrue(result);
    Mockito.verify(user, Mockito.times(1)).setPassword("123456789");
}

    @Test
    public void when_passwordlesssThan8characters_thenSetUnSuccessful(){
        User user = Mockito.mock(User.class);
        PasswordChecker checker = new PasswordChecker(user);
        boolean result = checker.checkPasswordAndSet("hello");
        assertFalse(result);
        Mockito.verify(user, Mockito.never()).setPassword(anyString());

    }


}
