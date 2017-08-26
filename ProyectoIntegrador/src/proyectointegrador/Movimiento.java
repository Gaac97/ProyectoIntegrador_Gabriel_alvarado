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
public interface Movimiento {
    public boolean movimiento(String forma,int x, int y,Piezas m[][],int a,int b);
    public boolean comer(int x,int y, Piezas m[][],int a, int b);
    
}
