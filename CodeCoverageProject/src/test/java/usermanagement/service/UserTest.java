package usermanagement.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void testUser() {
        User testUser1 = new User();
        testUser1.setUserId(874613);
        testUser1.setFirstName("FName1");
        testUser1.setLastName("LName1");
        testUser1.setCompanyName("CName1");

        User testUser2 = new User();
        testUser2.setUserId(874613);
        testUser2.setFirstName("FName1");
        testUser2.setLastName("LName1");
        testUser2.setCompanyName("CName1");


        User testUser3 = new User();

        assertTrue(testUser1.equals(testUser1));
        assertFalse(testUser1.equals(null));
        assertFalse(testUser1.equals(((Integer) 54564)));
        assertFalse(testUser3.equals(testUser1));

        assertTrue(testUser1.equals(testUser2));
        testUser2.setUserId(654882);
        assertFalse(testUser1.equals(testUser2));
        testUser2.setUserId(874613);
        testUser2.setFirstName("FName2");
        assertTrue(testUser1.equals(testUser2));
        testUser2.setFirstName("FName1");
        testUser2.setLastName("LName2");
        assertTrue(testUser1.equals(testUser2));
        testUser2.setLastName("LName1");
        testUser2.setCompanyName("CName2");
        assertTrue(testUser1.equals(testUser2));
        testUser2.setCompanyName("CName1");
        assertTrue(testUser1.equals(testUser2));

        final int prime = 31;
        int testUser1HashCode = 1;
        testUser1HashCode = prime * testUser1HashCode + ((testUser1.getUserId() == null) ? 0 : testUser1.getUserId().hashCode());

        assertEquals(testUser1.hashCode(), testUser1HashCode);
    }
}
