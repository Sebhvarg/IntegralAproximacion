/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.espol.cv.grupo7.integralaproximacion;

/**
 *
 * @author sebas
 */
public class Calculo {
    
   static double SumaDeRienman(int a, int nIntervalos){
       double delta = calcularDelta(a, nIntervalos);
       
        double[] x = linspace(-a + delta / 2, a - delta / 2, nIntervalos);
        double[] y = linspace(-a + delta / 2, a - delta / 2, nIntervalos);
        double[] z = linspace(-a + delta / 2, a - delta / 2, nIntervalos);
       
        double IntegralApprox = 0.0;
        
        for(double xi: x){
            for (double yi: y){
                for (double zi: z){
                    
                    double r = 1/ Math.pow(xi*xi + yi*yi + zi * zi + 1, 2);
                    
                   IntegralApprox += r;
                
                }
            }
        }
       return IntegralApprox *= Math.pow(delta, 3);
       
       
       
       
   
   }  
   
   static double calcularDelta (int a, int nIntervalos){
       double delta = 2 * a;
       delta = delta / nIntervalos;
       return delta;
   
   }
   public static double[] linspace(double start, double end, int num) {
        double[] result = new double[num];
        double step = (end - start) / (num - 1);
        for (int i = 0; i < num; i++) {
            result[i] = start + i * step;
        }
        return result;
    }
    
    
}
