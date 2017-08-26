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
public class Duques extends Piezas {

    @Override
    public String toString() {
        return "☺";
    }

    @Override
    public boolean movimiento(String forma, int x, int y, Piezas[][] m, int a, int b) {
        Duques d = new Duques();

       if (d instanceof Piezas) {
            if (m[a][b] instanceof x) {
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

        int cont = y;
        if (x == a) {
            while (cont < y) {
                if ((m[x][cont] instanceof Duques) && (m[x][cont] instanceof Rebeldes) && (m[x][cont] instanceof Duques)) {
                    cont++;
                    return true;

                }
                break;
            }
            cont = 0;
            cont = x;
            if (y == b) {
                while (cont < x) {
                    if ((m[cont][x] instanceof Duques) && (m[cont][x] instanceof Rebeldes) && (m[cont][x] instanceof Duques)) {
                        cont++;
                        return true;
                    }
                    break;
                }

            }
            if (x == a) {
                while (cont < y) {
                    if ((m[x][cont] instanceof Rey) && (m[x][cont] instanceof Rebeldes) && (m[x][cont] instanceof Duques)) {
                        cont++;
                        return true;

                    }
                    break;
                }
                cont = 0;
                cont = x;
                if (y == b) {
                    while (cont < x) {
                        if ((m[cont][x] instanceof Rey) && (m[cont][x] instanceof Rebeldes) && (m[cont][x] instanceof Duques)) {
                            cont++;
                            return true;
                        }
                        break;
                    }

                }

            }

        }
        return false;
    }
}
