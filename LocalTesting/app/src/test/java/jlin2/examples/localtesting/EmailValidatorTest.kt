package jlin2.examples.localtesting

import org.junit.Assert.*
import org.junit.Test

class EmailValidatorTest {

    @Test
    fun testValidEmail1() {
        val validEmail1 = "123@abc.com"
        assertTrue(EmailValidator.isValidEmail(validEmail1))
    }

    @Test
    fun testValidEmail2() {
        val validEmail2 = "123@abc.co.ca"
        assertTrue(EmailValidator.isValidEmail(validEmail2))
    }

    @Test
    fun testInvalidEmailWithIncorrectDomain() {
        val invalidEmail = "123@abc"
        assertFalse(EmailValidator.isValidEmail(invalidEmail))
    }

    @Test
    fun testInvalidEmailWithDoubleDots() {
        val invalidEmail = "123@abc..com"
        assertFalse(EmailValidator.isValidEmail(invalidEmail))
    }

    @Test
    fun testInvalidEmailWithOutUsername() {
        val invalidEmail = "@abc.com"
        assertFalse(EmailValidator.isValidEmail(invalidEmail))
    }

    @Test
    fun testInvalidEmailWithoutDomain() {
        val invalidEmail = "testing123"
        assertFalse(EmailValidator.isValidEmail(invalidEmail))
    }

    @Test
    fun testInvalidEmailEmptyString() {
        val emptyEmail = ""
        assertFalse(EmailValidator.isValidEmail(emptyEmail))
    }

}
