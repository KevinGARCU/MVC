/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author Estudiantes
 */
public class Modelo {
    
    public int factorial(int n){
        int fact = 1;
        for(int i=1; i<n; i++){
            fact *= i;
        }
        return fact;
    }
    
}
