/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio11;

/**
 *
 * @author Emmanuel lopez 9/julio/2022
 */
public class SpiderMilesMorales_02 extends SpiderMan_01{
    
    //atributo
    private String tio;
    
    
    public SpiderMilesMorales_02(String nombre, String universo, String enemigo,String tio) {
        super(nombre, universo, enemigo);
        this.tio=tio;
    }

    public String getTio() {
        return tio;
    }
    

    @Override
    public String mostrarDatos(){
          return       "\nNombre: "+nombre
                       +"\nUniverso: "+universo
                       +"\nEnemigo: "+enemigo
                       +"\nTio:"+tio;
        
    }
    
    
}
