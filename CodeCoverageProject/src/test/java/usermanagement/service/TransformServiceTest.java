package usermanagement.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import usermanagement.entity.Person;

public class TransformServiceTest {
    @Test
    public void testUserNotFoundConstructor() {
        TransformService testClass = new TransformService();

        Person testPerson = new Person();
        testPerson.setPersonId(987310);
        testPerson.setCompanyName("pcName1");
        testPerson.setfName("pfName1");
        testPerson.setmName("pmName1");
        testPerson.setlName("plName1");

        User testUser = new User();
        testUser.setFirstName("fName1");
        testUser.setLastName("lName1");
        testUser.setCompanyName("cName1");
        testUser.setUserId(98731);

        User personToUser = testClass.toUserDomain(testPerson);
        assertEquals(((Integer) 987310), personToUser.getUserId());
        assertEquals("pcName1", personToUser.getCompanyName());
        assertEquals("pfName1", personToUser.getFirstName());
        assertEquals("plName1", personToUser.getLastName());

        Person userToPerson = testClass.toUserEntity(testUser);
        assertEquals(98731, userToPerson.getPersonId());
        assertEquals("cName1", userToPerson.getCompanyName());
        assertEquals("fName1", userToPerson.getfName());
        assertEquals("lName1", userToPerson.getlName());

    }
}

