/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package droneracing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Abner
 */
public class Algoritmo extends Drones {
    
    
    void exec() {
        
        double dx = 0;
        double dy = 0;
        double dz = 0;
        
        double velocidade;
        
        double bx = 0;
        double by = 0;       
        double bz = 0;
        
        Scanner sc = new Scanner(System.in);
        
        //Criando um array de drones
		ArrayList<Drones> drones = new ArrayList<>();
                
	    //Primeiro drone
		Drones drone1 = new Drones();
                
            drone1.setNome("Drone 1");
            
            System.out.println("Digite as coordenadas do Drone 1: ");
            
            System.out.print("X: ");
            dx = sc.nextDouble();
	    drone1.setPosicaoX((double) dx);
            
            System.out.print("Y: ");
            dy = sc.nextDouble();
	    drone1.setPosicaoY((double) dy);
            
            System.out.print("Z: ");
            dz = sc.nextDouble();
	    drone1.setPosicaoZ((double) dz);
            
            System.out.println("Digite a velocidade do Drone em Km/h: ");
            velocidade = sc.nextDouble();
            drone1.setVelocidade((double) velocidade);
            
            
            //Informações da Base do drone 1
            
            System.out.println("Digite as coordenadas da Base (ponto de chegada): ");
            
            System.out.print("X: ");
            bx = sc.nextDouble();
	    drone1.setDestinoX((double) bx);
            
            System.out.print("Y: ");
            by = sc.nextDouble();
	    drone1.setDestinoY((double) by);
            
            System.out.print("Z: ");
            bz = sc.nextDouble();
	    drone1.setDestinoZ((double) bz);
            
	    //Adiciona o drone1 no vetor
	    drones.add(drone1);
            
            
            //Segundo drone
	    Drones drone2 = new Drones();
            
	    drone2.setNome("Drone 2");
            
            System.out.println("Digite as coordenadas do Drone 2: ");
            
            System.out.print("X: ");
            dx = sc.nextDouble();
	    drone2.setPosicaoX((double) dx);
            
            System.out.print("Y: ");
            dy = sc.nextDouble();
	    drone2.setPosicaoY((double) dy);
            
            System.out.print("Z: ");
            dz = sc.nextDouble();
	    drone2.setPosicaoZ((double) dz);
            
            System.out.println("Digite a velocidade do Drone em Km/h: ");
            velocidade = sc.nextDouble();
            drone2.setVelocidade((double) velocidade);
            //Informações da base do drone 2
            
            System.out.println("Digite as coordenadas da Base (ponto de chegada): ");
            
            System.out.print("X: ");
            bx = sc.nextDouble();
            drone2.setDestinoX((double) bx);
            
            System.out.print("Y: ");
            by = sc.nextDouble();
	    drone2.setDestinoY((double) by);
            
            System.out.print("Z: ");
            bz = sc.nextDouble();
	    drone2.setDestinoZ((double) bz);
            
	
	    //Adiciona o drone2 no vetor
		drones.add(drone2);
                
                
            //Irá comparar os valores do resultado de 'getTempo' entre os vetores e dizer qual foi o mais rápido
            
            drones.sort(Comparator.comparing(Drones::getTempo));
	    System.out.println("O drone mais rápido foi o: "+drones.get(0).getNome());     
                
           
    
}
 
    
}
