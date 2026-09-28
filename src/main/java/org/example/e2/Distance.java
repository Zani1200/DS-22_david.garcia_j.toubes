package org.example.e2;

import java.util.ArrayList;
import java.util.Arrays;

public class Distance {
    /**
     * Given the layout of a class with available sites marked with an ’A’ and
     * invalid sites marked with a ’. ’, returns the resulting layout with the
     * sites occupied by the students marked with a ’#’ following two rules :
     * - Students occupy an empty seat if there are no other adjacent students .
     * - A student leaves a seat empty if he/ she has 4 or more adjacent students .
     * @param layout The initial layout .
     * @return The resulting layout .
     * @throws IllegalArgumentException if the initial layout is invalid (is null ,
     * is ragged , includes characters other than ’.’ or ’A ’)).
     */


    public static char [][] seatingPeople ( char [][] layout ) {
        int[] fila = {-1,-1,-1,0,0,1,1,1};
        int[] columna = {-1,0,1,-1,1,-1,0,1};
        int contador = 0;
        boolean hayCambios;

        for (int i = 0; i < layout.length; i++) {
            for (int j = 0; j < layout[i].length; j++) {
                if (layout[i][j] != '.' && layout[i][j] != 'A') {
                    throw new IllegalArgumentException("tiene que ser a '.' o 'A'");
                }
            }
        }
        do {
            char[][] layoutComparar = new char[5][5];
            hayCambios = false;
            for (int i = 0; i < layout.length; i++) {
                for (int j = 0; j < layout[i].length; j++) {
                    if (layout[i][j] == '.') {
                        layoutComparar[i][j] = '.';
                        continue;
                    }
                    for (int k = 0; k < 8; k++) {
                        if (i + columna[k] >= 0 && i + columna[k] <= 4 && j + fila[k] >= 0 && j + fila[k] <= 4) {
                            if (layout[i + columna[k]][j + fila[k]] == '#') {
                                contador++;
                            }
                        }
                    }
                    if (layout[i][j] == '#' && contador >= 4) {
                        layoutComparar[i][j] = 'A';
                        hayCambios = true;
                    } else if (layout[i][j] == 'A' && contador == 0) {
                        layoutComparar[i][j] = '#';
                        hayCambios = true;
                    } else {
                        layoutComparar[i][j] = layout[i][j];
                    }
                    contador = 0;
                }
            }
            layout = layoutComparar;
            System.out.println(Arrays.deepToString(layoutComparar));
        }while (hayCambios);
        return layout;
    }
}
