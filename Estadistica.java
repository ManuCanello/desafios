public class Estadistica {

    public static void main(String[] args) {
        new Estadistica();
    }

    public Estadistica() {
        double[] fa = {1,4,3,2};
        double[] fr = new double[fa.length];
        double[] frPrs = new double[fa.length];

        fr(fa, fr);
        frPorcent(fr, frPrs);
        tabla(fa, fr, frPrs);
        System.out.println("");
        graficar(fa);
    }

    private void tabla(double[] fa, double[] fr, double[] frPrs) {
        System.out.println("FA   FR     FR%");
        for (int i = 0; i < fa.length; i++) {
            System.out.printf("%-4.0f %-6.3f %-6.2f%%\n", fa[i], fr[i], frPrs[i]);
        }
        System.out.printf("%.0f | %.3f | %.2f%%\n", total(fa), total(fr), total(frPrs));
    }

    private double total(double[] array) {
        double total = 0;
        for (double a : array) {
            total += a;
        }
        return Math.round(total);
    }

    private void fr(double[] fa, double[] fr) {
        double total = total(fa);
        for (int i = 0; i < fr.length; i++) {
            fr[i] = fa[i] / total;
        }
    }

    private void frPorcent(double[] fr, double[] frPrs) {
        for (int i = 0; i < fr.length; i++) {
            frPrs[i] = fr[i] * 100;
        }
    }

    private void graficar(double[] fa) {
        int filas = buscarMayor(fa) + 2;
        int columnas = (fa.length * 2) + 2;
        String[][] matriz = new String[filas][columnas];

        llenarMatriz(matriz);
        numerosMatriz(matriz, buscarMayor(fa));
        llenarDatos(matriz, fa);
        dibujar(matriz);
    }

    private void llenarDatos(String[][] matriz, double[] fa) {
        int aux = 2;
        for (double a : fa) {
            int altura = (int) Math.round(a);
            int inicio = matriz.length - 3 - altura + 1;

            for (int i = inicio; i < matriz.length - 2; i++) {
                matriz[i][aux] = "█";
            }
            aux += 2;
        }
    }

    private void dibujar(String[][] matriz) {
        for (String[] fila : matriz) {
            for (String valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    private void numerosMatriz(String[][] matriz, int max) {
        int etiqueta = max;
        for (int i = 0; i < max; i++) {
            matriz[i][0] = String.valueOf(etiqueta--);
        }
        lineasMatriz(matriz);
    }

    private void llenarMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = " ";
            }
        }
    }

    private void lineasMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length - 2; i++) {
                matriz[i][1] = "│";
           
        }

        int aux = 1;
        for (int i = 2; i < matriz[0].length - 1; i++) {
            matriz[matriz.length - 2][i] = "-";
            if (i % 2 == 0) {
                matriz[matriz.length - 1][i] = String.valueOf(aux++);
            }
        }
    }

    private int buscarMayor(double[] fa) {
        double mayor = 0;
        for (double d : fa) {
            if (d > mayor)
                mayor = d;
        }
        return (int) mayor;
    }
}
