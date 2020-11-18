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
public abstract class Encrypter implements IEncrypter{

    protected String encryptionType;
    
    
    @Override
    public String encript(String text) {
        return "Text encrypted by " + this.encryptionType + " method";
    }
    //Em um caso real o método de criptografia seria reescrito para dar o retorno de acordo com o função,
    //Que no caso, com a sobreescrita do método teriamos acesso à função pela Interface, porém utilizando a função
    //da classe filha
    
}
