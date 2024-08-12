object Q1
{
    // Encryption function
    def encrypt(text: String, shift: Int): String = 
    {
        text.map { char =>
            if (char.isLetter) 
            {
                val base = if (char.isUpper) 'A' else 'a'
                ((char - base + shift) % 26 + base).toChar
            } 
            else 
            {
                char
            }
        }
    }

    // Decryption function
    def decrypt(text: String, shift: Int): String = 
    {
        encrypt(text, 26 - shift)
    }


    def process(text: String, shift: Int, cipherFunc: (String, Int) => String): String = 
    {
        cipherFunc(text, shift)
    }

    def main(args: Array[String]): Unit =
    {
        val text = "Hello, World!"
        val shift = 3

        // Encrypt the text
        val encryptedText = process(text, shift, encrypt)
        println(s"Encrypted: $encryptedText")

        // Decrypt the text
        val decryptedText = process(encryptedText, shift, decrypt)
        println(s"Decrypted: $decryptedText")
    }
}