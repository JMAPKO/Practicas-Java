
package com.mycompany.listas;

public class Alumno {
    
   int id;
   String nombre;
   int edad;
   String maestria;

   public Alumno() {
    }

   
   
   public Alumno(int id, String nombre, int edad, String maestria) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.maestria = maestria;
    }
   
   

   public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMaestria() {
        return maestria;
    }

    public void setMaestria(String maestria) {
        this.maestria = maestria;
    }
    
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
 } 
