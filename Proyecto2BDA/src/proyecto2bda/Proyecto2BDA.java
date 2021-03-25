/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2bda;

import entidades.Categoria;
import repositorios.Control;

/**
 *
 * @author Usuario
 */
public class Proyecto2BDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String hola="Hola";
////        System.out.println(hola);
        //aaaaaaaaaaaaaaa
        //bbbbbbbbbbbbbbb
        
        Control c = new Control();
        Categoria cat = new Categoria(hola, hola);
        System.out.println(cat.toString());
        c.getCategoriaRepository();
        
        c.getCategoriaRepository().guardar(cat);
//        c.getCategoriaRepository().buscarTodos();
    }
    
}
