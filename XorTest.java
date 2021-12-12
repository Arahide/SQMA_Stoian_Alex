import org.junit.Test;
import static org.junit.Assert.*;

public class XorTest {

    @Test
    public void xorAndSetText() {
        Example example = new Example("admin", "adminPass");
        example.xorAndSetText("secret", "secret");
        assertEquals(new String(new char[] {0, 0, 0, 0, 0, 0}), example.getSecretText());
    }

}