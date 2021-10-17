import java.util.*;
// Class for doing encryption and decryption using the Caesar Cipher. 
public class Modi_CaesarCipher { 
protected char[ ] encoder = new char[26]; // Encryption array 
protected char[ ] decoder = new char[26]; // Decryption array 
// Constructor that initializes the encryption and decryption arrays 
 public Modi_CaesarCipher(int rotation) { 
 for (int k=0; k < 26; k++) { 
 encoder[k] = (char) ('A' + (k + rotation) % 26); 
 decoder[k] = (char) ('A' + (k - rotation + 26) % 26); 
 } 
 } 
 //Returns String representing encrypted message. ∗/ 
 public String encrypt(String message) { 
 return transform(message, encoder); // use encoder array 
 } 
 //Returns decrypted message given encrypted secret.
  public String decrypt(String secret) { 
  return transform(secret, decoder); // use decoder array 
  } 
  // Returns transformation of original String using given code. 
   private String transform(String original, char[ ] code) { 
    char[ ] msg = original.toCharArray(); 
	 for (int k=0; k < msg.length; k++) 
	  if (Character.isUpperCase(msg[k])) { // we have a letter to change 
	   int j = msg[k] - 'A'; // will be value from 0 to 25 
	    msg[k] = code[j]; // replace the character 
		 } 
		  return new String(msg);
		   } 
		   //Simple main method for testing the Caesar cipher  
		    public static void main(String[ ] args) { 
			 Modi_CaesarCipher cipher = new Modi_CaesarCipher(10);
			  System.out.println("Encryption code = " + new String(cipher.encoder)); 
			   System.out.println("Decryption code = " + new String(cipher.decoder)); 
			    Scanner nicx=new Scanner(System.in);
				System.out.print("Enter your secret code: ");
				   String NCL=nicx.nextLine();
				   String message=NCL.toUpperCase();
				 String coded = cipher.decrypt(message); 
				  System.out.println("Encrypted Message: " + coded); 
				  
				   
					 }
			  }