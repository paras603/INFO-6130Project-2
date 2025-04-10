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





}
