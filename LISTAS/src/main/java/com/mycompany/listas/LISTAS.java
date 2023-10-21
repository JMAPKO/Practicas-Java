

package com.mycompany.listas;

import java.util.ArrayList;
import java.util.List;


public class LISTAS extends Alumno {

   public static void main(String[] args) {
      
        
       List<Alumno> escuela = new ArrayList<Alumno> ();
       Alumno Alu1 = new Alumno(1,"franco mamani",26,"marcial");
       Alumno Alu2 = new Alumno(1,"florencia chavez",25,"marcial");
       Alumno Alu3 = new Alumno(1,"carlos abregu",25,"marcial");
       Alumno Alu4 = new Alumno(1,"mirolo micaela",19,"marcial");
       Alumno Alu5 = new Alumno(1,"stisman jose david",15,"marcial");
       
       escuela.add(Alu1);
       escuela.add(Alu2);
       escuela.add(Alu3);
       escuela.add(Alu4);
       escuela.add(Alu5);
       
       System.out.println("\n------lista-con-for-Normal-------------\n");
       for(int i = 0; i <escuela.size(); i++) {
           System.out.println(escuela.get(i).getNombre()+" - "+escuela.get(i).getEdad());
        }
       
       System.out.println("\n--------------lista con forech--------------------\n");
       
       for (Alumno alu:escuela){
           System.out.println(alu.getNombre()+" -  "+alu.getMaestria());
       }
        
      
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
    }
}
