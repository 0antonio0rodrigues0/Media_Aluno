/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplonotas;



/**
 *
 * @author antro
 */
public class ExemploNotas {
    /*Alunos aprovados:
Aluno 1 aprovado 7.0
Aluno 2 aprovado 7.0
Aluno 3 aprovado 7.0
Aluno 4 aprovado 7.0*/

    public static void main(String[] args) {
        double notas = 7; 
        double notaAluno1 = notas;
        double notaAluno2 = notas;
        double notaAluno3 = notas;
        double notaAluno4 = notas;
        if(notas <= 7 ){
        System.out.println("Alunos aprovados:");
        System.out.println("Aluno 1 aprovado " +notaAluno1);
        System.out.println("Aluno 2 aprovado " +notaAluno2);
        System.out.println("Aluno 3 aprovado " +notaAluno3);
        System.out.println("Aluno 4 aprovado " +notaAluno4);
        
        }
        else if(notas < 5){
        System.out.println("Recuperação");
                
          }
        else{
        System.out.println("Reprovado");
        }
       
    }
}
          
         
    

