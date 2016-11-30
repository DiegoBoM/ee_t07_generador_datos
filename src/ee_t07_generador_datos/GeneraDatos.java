/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee_t07_generador_datos;

/**
 *
 * @author Victor Hugo Bolaños
 */
import java.io.*;
import java.util.*;
import javax.swing.*;
public class GeneraDatos {
   String [] nombres = new String[1000];
   String [] apellidos = new String[1000];
   String [] fecha = new String[1000];
   String [] telefono = new String[1000];
   String [] empresa = new String[1000];
   String [] correo = new String[1000];
   int total;
   int aletorio;
   public GeneraDatos(){
       
   }
   public String[] Gnombre(){
       int conta=0;
       try{
           FileInputStream fstream = new FileInputStream("Nombres.txt");
           DataInputStream entrada = new DataInputStream(fstream);
           BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
           String strLinea;
           while ((strLinea = buffer.readLine()) != null) {
               nombres[conta] = strLinea;
               conta++;
            }
        }catch (Exception e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
        return nombres;
   }
   public String[] Gapellidos(){
       int conta=0;
       try{
           FileInputStream fstream = new FileInputStream("Apellido.txt");
           DataInputStream entrada = new DataInputStream(fstream);
           BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
           String strLinea;
           while ((strLinea = buffer.readLine()) != null) {
               apellidos[conta] = strLinea;
               conta++;
            }
        }catch (Exception e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
        return apellidos;
   }
   public String[] Gfecha(){
       int conta=0;
       try{
           FileInputStream fstream = new FileInputStream("Fecha Nacimiento.txt");
           DataInputStream entrada = new DataInputStream(fstream);
           BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
           String strLinea;
           while ((strLinea = buffer.readLine()) != null) {
               fecha[conta] = strLinea;
               conta++;
            }
        }catch (Exception e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
        return fecha;
   }
   public String[] Gtelefono(){
       int conta=0;
       try{
           FileInputStream fstream = new FileInputStream("Telefono.txt");
           DataInputStream entrada = new DataInputStream(fstream);
           BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
           String strLinea;
           while ((strLinea = buffer.readLine()) != null) {
               telefono[conta] = strLinea;
               conta++;
            }
        }catch (Exception e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
        return telefono;
   }
   public String[] Gcorreo(){
       int conta=0;
       try{
           FileInputStream fstream = new FileInputStream("Correo.txt");
           DataInputStream entrada = new DataInputStream(fstream);
           BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
           String strLinea;
           while ((strLinea = buffer.readLine()) != null) {
               correo[conta] = strLinea;
               conta++;
            }
        }catch (Exception e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
        return correo;
   }
   public String[] Gempresa(){
       int conta=0;
       try{
           FileInputStream fstream = new FileInputStream("Empresa.txt");
           DataInputStream entrada = new DataInputStream(fstream);
           BufferedReader buffer = new BufferedReader(new InputStreamReader(entrada));
           String strLinea;
           while ((strLinea = buffer.readLine()) != null) {
               empresa[conta] = strLinea;
               conta++;
            }
        }catch (Exception e){ //Catch de excepciones
            System.err.println("Ocurrio un error: " + e.getMessage());
        }
        return empresa;
   }
   public void imprimir(){
       Gnombre();
       Gapellidos();
       Gfecha();
       Gtelefono();
       Gcorreo();
       Gempresa();
       for(int i=0;i<5;i++){
           System.out.println(" "+nombres[i]+" "+apellidos[i]+" "+fecha[i]+" "+telefono[i]+" "+correo[i]+" "+empresa[i]+" ");
        }
    }
    public void Garchivo(int total){
       String dato;
       Gnombre();
       Gapellidos();
       Gfecha();
       Gtelefono();
       Gcorreo();
       Gempresa();
       total = total;
       int c=0;
       try{
           File archivo = new File("archivo.txt");
           PrintWriter out = new PrintWriter(new PrintWriter(archivo));
           while(c<total){
               int i = (int)(Math.random()*1000);
               int j = (int)(Math.random()*1000);
               int k = (int)(Math.random()*1000);
               dato= c+","+nombres[i]+","+apellidos[i]+","+fecha[j]+","+telefono[j]+","+correo[k]+","+empresa[k];
               out.println(dato);
               c++;
            }
            out.close();
        }catch (IOException ioe) {
        	System.out.println("surgio un error");
        }
   }
    public static void main (String [] args){
        GeneraDatos g = new GeneraDatos();
        g.Garchivo(100);
    }
   
}
