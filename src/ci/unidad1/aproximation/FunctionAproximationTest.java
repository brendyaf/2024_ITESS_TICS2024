/*
 * ITESS-TICS
 * Enero-Junio 2024
 * Cálculo Integral
 * TI202 BAF
 * 12 Febrero 2024
 * Aproximación de areas usando sumas
 * ti23110200@itess.edu.mx
 */
package ci.unidad1.aproximation;


public class FunctionAproximationTest {
    public static void main(String[] args){
        FunctionAproximation fa = new FunctionAproximation(0.0, 4.0, 4);
        
        fa.compute();
        System.out.println("area: "+ fa.getArea());
    }
    
}
