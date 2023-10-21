
package com.mycompany.usando_switch;


public class Usando_switch {

        public static void main(String[] args) {

           int numero = 6 ;
           String dia;

           switch (numero) {

               case 1: dia = "lunes";
               break;
               case 2: dia = "martes";
               break;
               case 3: dia = "miercoles";
               break;
               case 4: dia = "jueves";
               break;
               case 5: dia = "viernes";
               break;
               case 6: dia = "sabado";
               break;
               case 7: dia = "domingo";
               break;
               default: dia = "es invalido";
               break;

            }

           System.out.println("hoy es "+ dia);

           if (dia == "sabado" || dia == "domingo") {
           System.out.println("estamos en fin de semana");

           }

            else {
                   if (dia == "viernes") {
                   System.out.println("uff el mejor dia");
                    }
                   else {
                       System.out.println("es dia de semana pa, hay que laburar falta pa el finde jeje");
                   }
                }

            if (dia == "domingo") {
                    System.out.println("uff que bajon mañana hay que arrancar semana viejo");

                 }


            }





        }
