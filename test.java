package activities;

@Test
void firstNameStartsWithJ() {
        Person person = new Person("John", "Doe");

        // Assertion
        assertTrue(person.getFirstName().startsWith("J")); //Pass
        assertFalse(person.getFirstName().startsWith("J")); // Fail
        }