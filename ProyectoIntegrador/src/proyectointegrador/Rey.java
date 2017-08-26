/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectointegrador;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Alvarado
 */
public class Rey extends Piezas {

    @Override
    public String toString() {
        return "R";
    }

    @Override
    public boolean movimiento(String forma, int x, int y, Piezas[][] m, int a, int b) {
        Rey r = new Rey();
          if (x==9&&y==9)
        {
            
            JOptionPane.showConfirmDialog(null, "No puede ir al reino");
            return false;
        }
     
            if ((m[9][9]instanceof Rey)&&(m[9][8]instanceof Duques)&&(m[9][10]instanceof Duques)&&(m[8][9]instanceof Duques)&&(m[10][9]instanceof Duques) ) {
                return true;
            }
     

        
        if (r instanceof Piezas) {
            if (m[a][b].equals(new x())) {
                return false;
            }
            if (a < 0 || a > m.length || b < 0 || b > m.length) {
                return false;
            }
            if (x != a && y != b) {
                return false;
            } else {
                if (x != a && y == b) {
                    if (x > a) {
                        for (int i = a + 1; i <= x; i++) {
                            if (m[a][i] instanceof Rebeldes || m[a][i] instanceof Duques || m[a][i] instanceof Rey) {
                                return false;
                            }
                        }
                        return true;
                    }

                } else if (y > b) {
                    {

                        for (int i = y; i <= b; i++) {
                            if (m[i][b] instanceof Rebeldes || m[i][b] instanceof Rey || m[i][b] instanceof Duques) {
                                return false;
                            }
                        }
                        return true;
                    }

                }
            }
            if (x == a || y == b) {

                return true;
            } else {
                JOptionPane.showMessageDialog(null, "El movimiento no se puede hacer");
                return false;
            }
        } else {
            return false;
        }

    }
     
    

    @Override
    public boolean comer(int x, int y, Piezas[][] m, int a, int b) {
    int cont=y;
        if (x==a)
        {
            while(cont<y)
            {
                if(m[x][cont].equals(new Rey())|| m[x][cont].equals(new Rebeldes())|| m[x][cont].equals(new Duques())){
                       cont++;
                       
                return true;
                
            }
               break;        
            }
        }
    
        return false;

    }
    }


