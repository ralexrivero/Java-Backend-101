public class IntroArraysMultidimensionales {
    public static void main(String[] args) {
        // declarar e inicializar un array multidimensional
        int[][] matriz = new int[3][3];

        // asignacion de valores
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = i * j;
            }
        }

        // acceder a imprimir los valores
        System.out.println(" El valor de la primera fila y primera columna es: " + matriz[0][0]);
        System.out.println(" otro valor: " + matriz[2][2]);

        // inicializacion simplificada
        int[][] matriz2 = {
                {22, 58, 99},
                {71, 18, 14},
                {19, 14, 15}
        };

        // pueden ser irregulares
        int[][] arregloIrregular = {
                {2, 7},
                {28, 71, 99},
                {56}
        };

        System.out.println(arregloIrregular[1][2]);
    }
}
