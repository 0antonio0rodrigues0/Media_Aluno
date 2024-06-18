/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplonotas;

import java.util.Scanner;



/**
 *
 * @author antro
 */
public class ExemploNotas {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        double notas = 7;
        
        System.out.println("Digite sua nota:");
        
        notas = n.nextInt();
    
        if(notas >= 7 ){
        System.out.println("Aprovado");
        
        }
        
        
        else if(notas <= 5 || notas < 7){
        System.out.println("De recuperação");
        
        }
        
        else{
        System.out.println("Reprovado");
        
        }
        
      
    } 
       
}

      
         
    

