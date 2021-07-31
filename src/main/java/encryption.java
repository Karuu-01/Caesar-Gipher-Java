public class encryption {
    public static String encrypt(String plainText, int shiftKey)
    {
        final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

        plainText = plainText.toLowerCase();
        StringBuilder cipherText = new StringBuilder(" ");
        for (int i = 0; i < plainText.length(); i++)
        {
            int charPosition = ALPHABET.indexOf(plainText.charAt(i));
            int keyVal = (shiftKey + charPosition) % 26;
            char replaceVal = ALPHABET.charAt(keyVal);
            cipherText.append(replaceVal);
        }
        return cipherText.toString();
    }
}
