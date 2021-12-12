import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class XorTest {

    @Test
    void xorAndSetText() {
        Example example = new Example("admin", "adminPass");
        example.xorAndSetText("Not a secret text", "Not a secret text");
        Assertions.assertNull(example.getSecretText());
    }

}