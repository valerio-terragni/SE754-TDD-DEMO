package nz.ac.auckland.se754;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

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
 * - A user should not be able to set a password of at least 8 characters [NEGATIVE]
 * - A user should be able to set a password if it does contains her/his name [POSITIVE]
 * - A user should not be able to set a password if contains her/his name [NEGATIVE]
 */
public class PasswordVerifierTest {


}
