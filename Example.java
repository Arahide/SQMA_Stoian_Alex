public class Example {

    private final String user;
    private final String pass;
    private String secretText;

    public Example(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }

    public String getSecretText() {
        return secretText;
    }

    public void setSecretText(String secretText) {
        this.secretText = secretText;
    }

    public boolean login(String user, String pass){
        return user.equals(this.user) && pass.equals(this.pass);
    }

    public void xorAndSetText(String plaintext, String key){
        StringBuilder secretText = new StringBuilder();
        for(int i = 0; i < plaintext.length(); i++)
            secretText.append((char)(plaintext.charAt(i) ^ key.charAt(i % key.length())));
        setSecretText(secretText.toString());
    }
}
