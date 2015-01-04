
alphaL = "abcdefghijklnmopqrstuvqxyz"
alphaU = "ABCDEFGHIJKLMNOPQRSTUVQXYZ"
num    = "0123456789"
keychars = num+alphaL+alphaU

ciphertext = "Bot kmws mikferuigmzf rmfrxrwqe abs perudsf! Nvm kda ut ab8bv_w4ue0_ab8v_DDU"
key = "T0pS3cre7key"
plaintext = ""
for i in range(len(ciphertext)):
  	rotate_amount = keychars.index(key[i%len(key)])
	dec_char = ""
  	if ciphertext[i] in alphaL:
    		dec_char = ord('a') + (ord(ciphertext[i])-ord('a')-rotate_amount)%26
  	elif ciphertext[i] in alphaU:
    		dec_char = ord('A') + (ord(ciphertext[i])-ord('A')-rotate_amount)%26
  	elif ciphertext[i] in num:
    		dec_char = ord('0') + (ord(ciphertext[i])-ord('0')-rotate_amount)%10
  	else:
    		dec_char = ord(ciphertext[i])
	plaintext += chr(dec_char)

print plaintext
