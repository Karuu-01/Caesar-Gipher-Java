public class decryption {
    private static String decrypt(String cipherText, int shiftKey)
    {

        final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

        cipherText = cipherText.toLowerCase();
        StringBuilder plainText = new StringBuilder();
        for (int i = 0; i < cipherText.length(); i++)
        {
            int charPosition = ALPHABET.indexOf(cipherText.charAt(i));
            int keyVal = (charPosition - shiftKey) % 26;
            if (keyVal < 0)
            {
                keyVal = ALPHABET.length() + keyVal;
            }
            char replaceVal = ALPHABET.charAt(keyVal);
            plainText.append(replaceVal);
        }
        return plainText.toString();
    }
    private static boolean convert(String a, int i) {
        return false;
    }
}