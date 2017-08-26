/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectointegrador;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Alvarado
 */
public class ProyectoIntegrador {

    /**
     * @param args the command line arguments
     */
    static int cont = 0;
    static String forma = "☺";
    static String forma2 = "•";

    public static void main(String[] args) {

        ArrayList<Rebeldes> ListPieza2 = new ArrayList();
        ArrayList<Duques> ListPieza1 = new ArrayList();

        int turno;
        int cont = 0;
        boolean turn = false;
        boolean finish = false;
        String player1;
        String player2;

        Piezas matriz[][] = new Piezas[19][19];
        LlenarTablero(matriz);

        player1 = JOptionPane.showInputDialog("Ingrese el nombre del primer jugador");
        player2 = JOptionPane.showInputDialog("Ingrese el nombre del segundo jugador");

        while (finish == false) {
            System.out.println("\n");
            PrintMatriz(matriz, 0, 0);
            if (cont % 2 == 0) {

                JOptionPane.showMessageDialog(null, "Turno de los rebeldes:" + " " + player1);

                Rebeldes r = new Rebeldes();

                int i = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la coordenada x"));
                int i2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la coordenada y"));
                int i3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese donde desea mover la pieza"));
                int i4 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese donde desea mover la pieza"));
                try {
                    validar(matriz, i, i2);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                try {
                    validar(matriz, i3, i4);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                if (r.movimiento(forma, i, i2, matriz, i3, i4) == true) {

                    matriz[i][i2] = new vacio();
                    matriz[i3][i4] = new Rebeldes();

                }
                if (r.comer(i, i2, matriz, i3, i4) == true) {
                    for (int j = 0; j < matriz.length; j++) {
                        for (int k = 0; k < matriz.length; k++) {
                            if (matriz[i][j] instanceof Rebeldes) {

                                if (matriz[i][j] instanceof Rebeldes) {
                                    if (matriz[i + 1][j] instanceof Duques) {
                                        matriz[i][j] = new vacio();
                                    }
                                }
                            }
                        }

                    }

                }

            } else {
                JOptionPane.showMessageDialog(null, "Turno de los duques:" + " " + player2);
                System.out.println("\n");

                int i = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la coordenada x"));
                int i2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la coordenada y"));
                int i3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese donde desea mover la pieza"));
                int i4 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese donde desea mover la pieza"));
                Duques d = new Duques();

                try {
                    validar(matriz, i, i2);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                try {
                    validar(matriz, i3, i4);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                if (d.movimiento(forma, i, i2, matriz, i3, i4) == true) {

                    matriz[i][i2] = new vacio();
                    matriz[i3][i4] = new Duques();

                }

            }

            System.out.println("\n");
            PrintMatriz(matriz, 0, 0);
            cont++;
        }
    }

    public static void LlenarTablero(Piezas matriz[][]) {
        Rebeldes rebeldes = new Rebeldes();
        Duques duques = new Duques();
        Rey rey = new Rey();
        matriz[0][0] = new x();
        matriz[0][1] = new x();
        matriz[1][0] = new x();
        matriz[1][1] = new x();
        matriz[2][0] = new Rebeldes();
        matriz[2][0] = new Rebeldes();
        matriz[0][2] = new Rebeldes();
        matriz[5][0] = new Rebeldes();
        matriz[12][0] = new Rebeldes();
        matriz[17][0] = new x();

        matriz[18][0] = new x();
        matriz[18][1] = new x();
        matriz[17][1] = new x();
        matriz[16][0] = new Rebeldes();
        matriz[18][2] = new Rebeldes();
        matriz[0][5] = new Rebeldes();
        matriz[2][5] = new Rebeldes();
        matriz[0][17] = new x();
        matriz[0][18] = new x();
        matriz[17][0] = new x();
        matriz[1][17] = new x();
        matriz[0][18] = new x();
        matriz[1][18] = new x();
        matriz[5][16] = new Rebeldes();
        matriz[5][18] = new Rebeldes();
        matriz[12][18] = new x();
        matriz[17][18] = new x();
        matriz[18][18] = new x();
        matriz[18][17] = new x();
        matriz[17][17] = new x();

        matriz[18][16] = new Rebeldes();
        matriz[7][3] = new Rebeldes();
        matriz[9][3] = new Rebeldes();
        matriz[11][3] = new Rebeldes();
        matriz[12][4] = new Rebeldes();
        matriz[13][5] = new Rebeldes();
        matriz[14][6] = new Rebeldes();
        matriz[15][7] = new Rebeldes();
        matriz[15][11] = new Rebeldes();
        matriz[14][12] = new Rebeldes();
        matriz[13][13] = new Rebeldes();
        matriz[9][15] = new Rebeldes();
        matriz[7][15] = new Rebeldes();
        matriz[6][14] = new Rebeldes();
        matriz[5][13] = new Rebeldes();
        matriz[4][12] = new Rebeldes();
        matriz[3][11] = new Rebeldes();
        matriz[3][9] = new Rebeldes();
        matriz[3][7] = new Rebeldes();
        matriz[9][3] = new Rebeldes();
        matriz[7][3] = new Rebeldes();
        matriz[6][4] = new Rebeldes();
        matriz[5][5] = new Rebeldes();
        matriz[4][6] = new Rebeldes();
        matriz[3][7] = new Rebeldes();
        matriz[7][3] = new Rebeldes();
        matriz[15][9] = new Rebeldes();
        matriz[7][3] = new Rebeldes();
        matriz[11][15] = new Rebeldes();
        matriz[12][14] = new Rebeldes();
        matriz[0][16] = new Rebeldes();
        matriz[18][16] = new Rebeldes();
        matriz[2][18] = new Rebeldes();
        matriz[5][18] = new Rebeldes();
        matriz[12][18] = new Rebeldes();
        matriz[16][18] = new Rebeldes();
        matriz[2][14] = new Rebeldes();
        matriz[18][5] = new Rebeldes();
        matriz[16][5] = new Rebeldes();
        matriz[18][13] = new Rebeldes();
        matriz[18][5] = new Rebeldes();
        matriz[16][13] = new Rebeldes();
        matriz[18][5] = new Rebeldes();
        matriz[4][8] = new Duques();
        matriz[4][10] = new Duques();

        matriz[6][9] = new Duques();
        matriz[7][8] = new Duques();
        matriz[8][7] = new Duques();
        matriz[9][6] = new Duques();
        matriz[10][7] = new Duques();
        matriz[12][9] = new Duques();
        matriz[11][8] = new Duques();
        matriz[11][10] = new Duques();
        matriz[13][16] = new Rebeldes();

        matriz[10][11] = new Duques();
        matriz[9][10] = new Duques();
        matriz[8][9] = new Duques();
        matriz[9][8] = new Duques();
        matriz[9][9] = new Rey();

        matriz[8][9] = new Duques();
        matriz[10][9] = new Duques();
        matriz[9][12] = new Duques();
        matriz[8][11] = new Duques();
        matriz[7][10] = new Duques();
        matriz[8][4] = new Duques();
        matriz[8][14] = new Duques();
        matriz[10][4] = new Duques();
        matriz[14][8] = new Duques();
        matriz[14][10] = new Duques();
        matriz[10][14] = new Duques();
        int cont = 0;
        int cont2 = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == null) {
                    matriz[i][j] = new vacio();
                }

            }

        }

    }

    public static void PrintMatriz(Piezas x[][], int f, int c) {
        if (f == x.length - 1 && c == x.length - 1) {
            System.out.print(x[f][c] + "");
        } else {
            if (c == x[0].length - 1) {
                System.out.println("[" + x[f][c] + "]" + "\t");
                PrintMatriz(x, f + 1, 0);
            } else {
                System.out.print("[" + x[f][c] + "]" + "\t");

                PrintMatriz(x, f, c + 1);
            }

        }

    }

    public static void validar(Piezas matriz[][], int x, int y) throws MiException {
        int limit = matriz.length - 1;
        int limit2 = matriz[0].length - 1;
        if (x > limit || y > limit2) {
            throw new MiException("Se salio del limite");
        }
    }

    public static boolean ganarD(Piezas m[][]) {
        Rebeldes r = new Rebeldes();
        Rey R = new Rey();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (r instanceof Piezas) {
                    if ((m[0][1] instanceof Rey) || (m[0][17] instanceof Rey) || (m[17][1] instanceof Rey) || m[17][17] instanceof Rey) {
                        return true;
                    }
                    if ((m[0][0] instanceof Rey) || (m[17][17] instanceof Rey) || (m[1][17] instanceof Rey) || m[17][0] instanceof Rey) {
                        return true;
                    } else {
                        return false;
                    }

                }

            }

        }
        return false;
    }

    public static boolean ganarR(Piezas m[][]) {
        Rebeldes r = new Rebeldes();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (r instanceof Piezas) {
                    if (m[i][j] instanceof Rebeldes) {
                        return false;

                    } else {
                        return true;
                    }

                }

            }

        }
        return false;
    }
}
