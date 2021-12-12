import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTest {

    @Test
    public void login() {
        Example example = new Example("admin", "adminPass");
        assertTrue(example.login("admin", "adminPass"));
        assertFalse(example.login("admin", "admin"));
    }

}