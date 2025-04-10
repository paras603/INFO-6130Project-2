package jlin2.examples.localtesting

import org.junit.Assert.*
import org.junit.Test

class EmailValidatorTest {

    @Test
    fun testValidEmail1() {
        val validEmail1 = "123@abc.com"
        assertTrue(EmailValidator.isValidEmail(validEmail1))
    }




}
