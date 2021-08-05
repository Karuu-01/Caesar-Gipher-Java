import java.util.Scanner;

public class app
{
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    private static String encrypt(String plainText)
    {
        plainText = plainText.toLowerCase();
        StringBuilder cipherText = new StringBuilder();
        for (int i = 0; i < plainText.length(); i++)
        {
            int charPosition = ALPHABET.indexOf(plainText.charAt(i));
            int keyVal = (25 + charPosition) % 26;
            char replaceVal = ALPHABET.charAt(keyVal);
            cipherText.append(replaceVal);
        }
        return cipherText.toString();
    }

    private static String decrypt(String cipherText)
    {
        cipherText = cipherText.toLowerCase();
        StringBuilder plainText = new StringBuilder();
        for (int i = 0; i < cipherText.length(); i++)
        {
            int charPosition = ALPHABET.indexOf(cipherText.charAt(i));
            int keyVal = (charPosition - 25) % 26;
            if (keyVal < 0)
            {
                keyVal = ALPHABET.length() + keyVal;
            }
            char replaceVal = ALPHABET.charAt(keyVal);
            plainText.append(replaceVal);
        }
        return plainText.toString();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String for Encryption: ");
        String message = sc.next();
        System.out.println(encrypt(message));
        System.out.println(decrypt(encrypt(message)));
        sc.close();
    }
}