import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneCheckerWithAreaCode_JM {
    @DisplayName("Valid String with no dashes")
    @Test
    void testCheckValidNumber_ValidStringNoDashes_RetsTrue() {
        //Arrange
        String phone = "2322111234";
        PhoneCheckerWithAreaCode checkPhone = new PhoneCheckerWithAreaCode(phone);
        //Act
        boolean actual = checkPhone.checkValidNumber();
        //Assert
        assertTrue(actual);
    }
    @DisplayName("Valid String with dashes")
    @Test
    void testCheckValidNumber_ValidStringWithDashes_RetsTrue() {
        //Arrange
        String phone = "232-211-1234";
        PhoneCheckerWithAreaCode checkPhone = new PhoneCheckerWithAreaCode(phone);
        //Act
        boolean actual = checkPhone.checkValidNumber();
        //Assert
        assertTrue(actual);
    }
    @DisplayName("String with 13 Digits")
    @Test
    void testCheckValidNumber_13DigitString_RetsFalse() {
        //Arrange
        String phone = "630-556-12345";
        PhoneCheckerWithAreaCode checkPhone = new PhoneCheckerWithAreaCode(phone);
        //Act
        boolean actual = checkPhone.checkValidNumber();
        //Assert
        assertFalse(actual);
    }
    @DisplayName("String with 9 Digits")
    @Test
    void testCheckValidNumber_9DigitString_RetsFalse() {
        //Arrange
        String phone = "630-556-1";
        PhoneCheckerWithAreaCode checkPhone = new PhoneCheckerWithAreaCode(phone);
        //Act
        boolean actual = checkPhone.checkValidNumber();
        //Assert
        assertFalse(actual);
    }
    @DisplayName("String with non-numeric chars")
    @Test
    void testCheckValidNumber_NonNumericChars_RetsFalse() {
        //Arrange
        String phone = "abc-456-1234";
        PhoneCheckerWithAreaCode checkPhone = new PhoneCheckerWithAreaCode(phone);
        //Act
        boolean actual = checkPhone.checkValidNumber();
        //Assert
        assertFalse(actual);
    }
    @DisplayName("String with parentheses area code")
    @Test
    void testCheckValidNumber_ParenthesesAreaCode_RetsFalse() {
        //Arrange
        String phone = "(630)5284234";
        PhoneCheckerWithAreaCode checkPhone = new PhoneCheckerWithAreaCode(phone);
        //Act
        boolean actual = checkPhone.checkValidNumber();
        //Assert
        assertFalse(actual);
    }
    @DisplayName("String with area code not 2-9")
    @Test
    void testCheckValidNumber_AreaCodeLessThan2_RetsFalse() {
        //Arrange
        String phone = "123-528-4234";
        PhoneCheckerWithAreaCode checkPhone = new PhoneCheckerWithAreaCode(phone);
        //Act
        boolean actual = checkPhone.checkValidNumber();
        //Assert
        assertFalse(actual);
    }
    @DisplayName("String with area code 9 in middle")
    @Test
    void testCheckValidNumber_AreaCodeMidDigit9_RetsFalse() {
        //Arrange
        String phone = "393-528-4234";
        PhoneCheckerWithAreaCode checkPhone = new PhoneCheckerWithAreaCode(phone);
        //Act
        boolean actual = checkPhone.checkValidNumber();
        //Assert
        assertFalse(actual);
    }
    @DisplayName("String with invalid exchange code")
    @Test
    void testCheckValidNumber_InvalidExchangeCode_RetsFalse() {
        //Arrange
        String phone = "225-123-4234";
        PhoneCheckerWithAreaCode checkPhone = new PhoneCheckerWithAreaCode(phone);
        //Act
        boolean actual = checkPhone.checkValidNumber();
        //Assert
        assertFalse(actual);
    }
    @DisplayName("String with dashes in wrong place")
    @Test
    void testCheckValidNumber_StringDashesWrongPlace_RetsFalse() {
        //Arrange
        String phone = "232-21-11234";
        PhoneCheckerWithAreaCode checkPhone = new PhoneCheckerWithAreaCode(phone);
        //Act
        boolean actual = checkPhone.checkValidNumber();
        //Assert
        assertFalse(actual);
    }
}