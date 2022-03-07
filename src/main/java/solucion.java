/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Stack;
public class solucion {
    
    public static Double resolucion (String expresion){
        Stack<Double> stack = new Stack<>();
        for (int i = 0;i <expresion.length();i++){
            char car = expresion.charAt(i);
            if(conversion.jerarquia(car) > 0){
                double op1 = stack.pop();
                double op2 = stack.pop();
                double auxiliar = operacion (op1, op2, car);
                stack.push(auxiliar);
            }//end if
            else{
                stack.push((double)(car - '0'));
            }
        }
    }
    public static Double operacion(double op1, double op2, char operador){
        switch(operador){
            case'+':
                return op1 + op2;
            case'-':
                return op2 - op1;
            case'*':
                return op1 *op2;
            case '/':
                return op2 / op1;
        }//fin switch
        return 0.0;
    }
}
