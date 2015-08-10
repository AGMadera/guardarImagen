/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetito;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author alfonsogalvanmadera
 */
public class PersistenciaGaleria {
    ArrayList<Galeria> galeria =new ArrayList<Galeria>();
    public void guardar(Galeria G)throws Exception{
        
        File f=new File("galeria");
        if(f.exists()){
            galeria=leerTodas();
        }
        FileOutputStream fis =new FileOutputStream(f);
        ObjectOutputStream oos=new ObjectOutputStream(fis);
        galeria.add(G);
        oos.writeObject(galeria);
        System.out.println("Datos de la imagen guardados exitosamente");
    }//termina metodo guardar
    
    public ArrayList<Galeria> leerTodas()throws Exception{
        File f=new File("galeria");
        FileInputStream fis=new FileInputStream(f);
        ObjectInputStream ois=new ObjectInputStream(fis);
        galeria=(ArrayList<Galeria>)ois.readObject();
        return galeria;
       
    }
    
}
