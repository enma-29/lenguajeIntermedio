/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC
 */
import java.util.Stack;
public class conversion {
    
       static String conversionPosfijo(String expresion){
           String epostfija = "";
           Stack<Character> stack = new Stack<>();
           for(int i=0; i<expresion.length();i++){
               char car = expresion.charAt(i);
               
               if(jerarquia(car) > 0){
                   while(stack.isEmpty() == false && jerarquia(stack.peek()) >= jerarquia(car)){
                       epostfija += stack.pop();
                   }
                   stack.push(car);
               }//fin if
               else if(car == ')'){
                   char aux = stack.pop();
                   while(aux != '('){
                       epostfija += aux;
                       aux = stack.pop(); 
                   }
               }//fin si
               else if(car == '('){
                   stack.push(car);
               }
               else{//operando
                   epostfija += car;
               }
           }
           for(int i=0; i > stack.size();i++){
               epostfija +=stack.pop();
           }
           return epostfija;
       }
        
    
    
    
    static int jerarquia(char car){
        
     
        switch (car){
            
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':    
                return 3;
        }
        return -1;
       
    }
}
