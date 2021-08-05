import org.junit.Test;

public class decryption {
    final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    @Test
    public void checkForAlphabet() {
        final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    }

    @Test
    public void checkForDecryption() {}
        public String checkStringConvertsToCharacter () {
            String cipherText = null;


            cipherText = cipherText.toLowerCase();
            StringBuilder plainText = new StringBuilder();
            for (int i = 0; i < cipherText.length(); i++) {
                int charPosition = ALPHABET.indexOf(cipherText.charAt(i));
                int keyVal = (charPosition - 25) % 26;
                if (keyVal < 0) {
                    keyVal = ALPHABET.length() + keyVal;
                }
                char replaceVal = ALPHABET.charAt(keyVal);
                plainText.append(replaceVal);
            }
            return plainText.toString();
        }

    @Test
    public void checkForEncrypt() {
        String cipherText = null;

    }
}
