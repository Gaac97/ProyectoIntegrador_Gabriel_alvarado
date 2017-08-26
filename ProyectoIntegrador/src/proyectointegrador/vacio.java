/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectointegrador;

/**
 *
 * @author Gabriel Alvarado
 */
public class vacio extends Piezas{

    public vacio() {
    }

    @Override
    public String toString() {
        return " ";
    }


    @Override
    public boolean movimiento(String forma, int x, int y, Piezas[][] m, int a, int b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean comer(int x, int y, Piezas[][] m, int a, int b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

 
}
