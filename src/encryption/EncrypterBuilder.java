/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryption;

/**
 *
 * @author natan
 */
public class EncrypterBuilder {
    
    //tipos de Encrypters
    public static int AESEncripterType = 1;
    public static int DESEncripterType = 2;
    public static int RC4EncrioterType = 3;
    
    private Encrypter enc; 

    public EncrypterBuilder(int encrypterType) {
        //instancia o Encrypter de acordo o tipo passado por argumento
        
        if(encrypterType == EncrypterBuilder.AESEncripterType){
            //se o tipo passado por argumento for igual ao do modelo AES, instancia a classe AESEncrypter
            this.enc = new AESEncrypter();
        }else if(encrypterType == EncrypterBuilder.DESEncripterType){
            //instancia o DESEncrypter se o codigo for do DESEncrypter
            this.enc = new DESEncrypter();
        }else if(encrypterType == EncrypterBuilder.RC4EncrioterType){
            //mesmo para RC4Encrypter
            this.enc = new RC4Encrypter();
        }
    }
    
    //retorna a instancia do Encrypter criado
    public Encrypter getInstance(){
        return this.enc;
    }
}
