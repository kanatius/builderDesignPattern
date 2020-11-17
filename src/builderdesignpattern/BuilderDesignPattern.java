/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderdesignpattern;

import encryption.EncrypterBuilder;
import encryption.IEncrypter;

/**
 *
 * @author natan
 */
public class BuilderDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String text;
        
        //testo a ser criptografado
        text = "Teste de criptografia";
        
        //instanciamento dos 3 Encrypters
        IEncrypter encAES = new EncrypterBuilder(EncrypterBuilder.AESEncripterType).getInstance();
        IEncrypter encDES = new EncrypterBuilder(EncrypterBuilder.DESEncripterType).getInstance();
        IEncrypter encRC4 = new EncrypterBuilder(EncrypterBuilder.RC4EncrioterType).getInstance();
        
        //Criptografando por cada Metodo
        System.out.println(encAES.encript(text));
        System.out.println(encDES.encript(text));
        System.out.println(encRC4.encript(text));
    }
    
}
