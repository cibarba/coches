/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cochecillo;

/**
 *
 * @author cibarba
 */
public class Coche {
    private int id;
    private String marca;
    //private String tipo;
    private int velocidad;
    
    public Coche(){}
    
    public Coche(String marca , int velocidad){
        this.marca = marca;
        //this.tipo = tipo;
        this.velocidad = velocidad;
    }
    
    //**************ID Constructor*************
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
    //**************Brand Constructor*************
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getMarca(){
        return marca;
    }
    
    //**************Type Constructor*************
    //public void setTipo(String tipo){
      //  this.tipo = tipo;
    //}
    
   // public String getTipo(){
     //   return tipo;
    //}
    
    //**************Speed Constructor*************
    public void setVelocidad(int velocidad){
        this.velocidad = velocidad;
    }
    public int getVelocidad (){
        return velocidad = velocidad ;
    }
    
    
    public void avanzar(int n_kilometros){
        
    }
    
    
}
