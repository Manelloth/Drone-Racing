/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package droneracing;

import java.util.Scanner;

/**
 *
 * @author Abner
 */
public class Principal {

   
    public static void main(String[] args) {
        
        //declaração de variaveis e métodos
        int menu = 0;
        int opcao = 0;
        Scanner sc = new Scanner(System.in);
        Regras regras = new Regras();
        Creditos creditos = new Creditos ();
        Algoritmo algoritmo = new Algoritmo();
        
        //Menu Principal
        do {
        System.out.println("**** SUPER DRONE RACING 8000 ****");
        System.out.println("[1] - Como funciona?");  //Explicação de como funciona o programa
        System.out.println("[2] - Participar ");     //Inicia a participação no projeto
        System.out.println("[3] - Créditos");        //Informações sobre o Dev
        System.out.println("[4] - Sair");            //Guess What.
        System.out.println("*********************************");
        opcao = sc.nextInt();
        
        switch (opcao) {
            
            case 1:
             
             regras.readme();
               break;
               
             //espaçamento  
               
            case 2:
              algoritmo.exec();
               break;
             //espaçamento   
               
            case 3:
              creditos.readme();
              break;
             //espaçamento  
                           
            case 4:
                System.out.println("Obrigado por utilizar o Super Drone Racing 8000");
                System.out.println("Finalizando aplicação...");
                menu = 1;
               break;
             //espaçamento
               
            default: //se um número diferente de 1 - 4 for escolhido:
            System.out.println("Opcão inválida. Por favor, digite um valor de 1 - 4");                         
            
        }
        
        
        }while(menu == 0);
        
    }
    
}
