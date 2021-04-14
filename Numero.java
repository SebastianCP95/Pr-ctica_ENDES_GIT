/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareajunit;

/**
 *
 * @author sebastian
 */
public class Numero {


    private int num;

    public Numero() {
    } 
        
    public Numero(int num) {
        this.num = num;
    } 

    public boolean NumeoPrimo(){
        int cont = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {

                cont++;
            }
        }
        return cont == 2; 
    }
    
}
    

