/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorios;

/**
 *
 * @author crist
 */
public class Control {

    CategoriaRepository cr;

    public CategoriaRepository getCategoriaRepository() {
        if (this.cr != null) {
            return this.cr;
        } else {
            this.cr = new CategoriaRepository();
            return this.cr;
        }
    }
}
