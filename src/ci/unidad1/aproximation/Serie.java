/*
 * ITESS-TICS
 * Enero-Junio 2024
 * Cálculo Integral
 * TI202 BAF
 * 16/ Febrero/2024
 * Calculo de series
 * ti23110200@itess.edu.mx
 */

package ci.unidad1.aproximation;

public class Serie {
    private int iIni;
    private int iEnd;
    private int n;
    private int i[];
    private int f[];
    private int suma;

    public Serie(int iIni, int iEnd) {
        this.iIni = iIni;
        this.iEnd = iEnd;
        
        n = iEnd - iIni + 1; 
        i = new int [n];
        f = new int [n];
    }
    public void compute() {
        int index = 0;
        for (int i = iIni; i <= iEnd; i++){
            this.i[index] = i;
            f[index] = 2*i*i - 2*i;
            index++;
        }
    }
    public void print() {
        System.out.println(" i  |   f");
        for (int index = 0; index < n; index++)
            System.out.println(index + "    | " + i[index] + "  | "+ f[index]);
    }
}
