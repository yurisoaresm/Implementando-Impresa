/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author YuriS
 */
public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        
        empresa.addPessoas();
        empresa.addProdutos();
    
        //empresa.buscarClienteTeste(21001);
        empresa.menu();
    }
}
