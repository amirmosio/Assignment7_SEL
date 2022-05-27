package usermanagement.exception;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UserNotFoundExceptionTest {

    @Test
    public void testUserNotFoundConstructor() {
        UserNotFoundException testClass = new UserNotFoundException("Message", 1354684);

        assertEquals("Message", testClass.getMessage());
        assertEquals(((Integer) 1354684), ((Integer) testClass.getUserId()));

    }
}
