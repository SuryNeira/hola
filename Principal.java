/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author suris
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        Automovil Carro1;
        //constructores 
        Carro1=new Automovil();
        Carro1.setColor('R');
        Carro1.setCombustible("Gas");
        Carro1.setHibrido(false);
        Carro1.setMarca('T');
        Carro1.setNpuertas(5);
        Carro1.setMotor(1.2F);
        
        Automovil Carro2=new Automovil();
        Carro2.setColor('A');
        Carro2.setCombustible("Gasolina");
        Carro2.setHibrido(true);
        Carro2.setMarca('R');
        Carro2.setNpuertas(4);
        Carro2.setMotor(2.2F);
    
        //imprimir
        System.out.println("los carros que se encuentran en el estacionamiento son");
        System.out.println("Carro 1:");
        System.out.println("Color:"+Carro1.getColor());
        System.out.println("Combustible:"+Carro1.getCombustible());
        System.out.println("Hibrido:"+Carro1.getHibrido());
        System.out.println("Marca:"+Carro1.getMarca());
        System.out.println("Npuertas:"+Carro1.getNpuertas());
        System.out.println("Motor:"+Carro1.getMotor()); 
        
        
        System.out.println("Carro 2:");
        System.out.println("Color:"+Carro2.getColor());
        System.out.println("Combustible:"+Carro2.getCombustible());
        System.out.println("Hibrido:"+Carro2.getHibrido());
        System.out.println("Marca:"+Carro2.getMarca());
        System.out.println("Npuertas:"+Carro2.getNpuertas());
        System.out.println("Motor:"+Carro2.getMotor());
        
        
    }
    
}