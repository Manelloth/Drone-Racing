/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package droneracing;

/**
 *
 * @author Abner
 */
public class Drones {
    //posição do drone
    
    private String nome;
    private double dx;
    private double dy;
    private double dz;
    private double velocidade;
    
    //posição da base
    
    private double bx;
    private double by;
    private double bz;
    
    public Double getVelocidade() {
	    return velocidade;
    }

    public void setVelocidade(Double velocidade) {
	    this.velocidade = velocidade;
    }
    
      //achar o tempo que demora pra percorrer.
    public Double getTempo() {
        	           
	    Double distancia = Math.sqrt(
			    Math.pow((bx-dx), 2)+
				Math.pow((by-dy), 2)+
			    Math.pow((bz-dz), 2));
	    return distancia/velocidade;
    }
    
    //Gets e Sets dos Drones
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;

    }
    
    
    public Double getPosicaoX() {
	    return dx;
    }

    public void setPosicaoX(Double dx) {
	    this.dx = dx;            
    }
    
     public Double getPosicaoY() {
	    return dy;
    }

    public void setPosicaoY(Double dy) {
	    this.dy = dy;            
    }
    
     public Double getPosicaoZ() {
	    return dz;
    }

    public void setPosicaoZ(Double dz) {
	    this.dz = dz;            
    }
    
    
    
    //Gets e Sets da Base (Destino)
        
    public Double getDestinoX() {
	    return bx;
    }

    public void setDestinoX(Double bx) {
	    this.bx = bx;            
    }
    
     public Double getDestinoY() {
	    return by;
    }

    public void setDestinoY(Double by) {
	    this.by = by;            
    }
    
     public Double getDestinoZ() {
	    return bz;
    }

    public void setDestinoZ(Double bz) {
	    this.bz = bz;            
    }
}
