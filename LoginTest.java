import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LoginTest {

    @Test
    void login() {
        Example example = new Example("admin", "adminPass");
        Assertions.assertTrue(example.login("admin", "adminPass"));
        Assertions.assertFalse(example.login("admin", "admin"));
    }

}