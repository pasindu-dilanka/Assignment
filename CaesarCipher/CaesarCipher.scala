object CaesarCipher extends App{

	printf("Hello, Caesar Cipher!")
	val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ "
	val inputString = "Hello welcome"

	val EncryptChar = (c:Char, shiftKey:Int, alpha:String) => alpha((alpha.indexOf(c.toUpper)+shiftKey) % alpha.size)
	val DecryptChar = (c:Char, shiftKey:Int, alpha:String) => alpha((alpha.indexOf(c.toUpper)-shiftKey+alpha.size) % alpha.size)
	val cipher = (algo:(Char,Int,String)=>Char,text:String,shiftKey:Int,alpha:String)=>text.map(algo(_,shiftKey,alpha))
	val Encrypt=cipher(EncryptChar,inputString,5,alphabet)
	val Decrypt=cipher(DecryptChar,Encrypt,5,alphabet)
	printf("Encrypt Text:"+inputString+" => "+Encrypt)
	printf("Decrypt Text:"+Encrypt+" => "+Decrypt)
 
}