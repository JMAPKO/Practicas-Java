
package com.mycompany.login.logica;

import com.mycompany.login.persistencia.ControladoraPersistencia;
import java.util.List;

public class ControladoraLogica {
    
   ControladoraPersistencia controlPersis; //= new ControladoraPersistencia();

   public ControladoraLogica() {
       
       controlPersis = new ControladoraPersistencia();
    }
       
   
   public Usuario validarUsuario(String nomUsuario,String pass) {
       
       Usuario userAdmin =null; 
       List <Usuario> listaUsuario = controlPersis.traerUsuarios();
       
       for(Usuario usu:listaUsuario) {
           if(usu.getNomUsuario().equals(nomUsuario)) {
               if(usu.getPass().equals(pass)) {
                   userAdmin= usu;
                   return userAdmin;
                  
                }
               else{
                   userAdmin= null;
                   return userAdmin;
                   
                }
               
            }
           else {
               userAdmin= null;
               
               
            }
        }
        
       return userAdmin;
    }

    public List<Usuario> traerUsuarios() {
        return controlPersis.traerUsuarios();
    }

    public List<Rol> traerRoles() {
        return controlPersis.traerRoles();
    }

    public void crearUsuario(String usuario, String pass, String rolRecibido) {
        Usuario usr = new Usuario();
        usr.setNomUsuario(usuario);
        usr.setPass(pass);
        
        Rol rolEncontrado = new Rol();
        rolEncontrado = this.traerRol(rolRecibido);
       
        if(rolEncontrado != null){
        //Traigo el ROL del usuario
        usr.setUnRol(rolEncontrado);
        }
        
       
       int id = this.traerUltimaId();
       usr.setId(id+1);
       
       
       controlPersis.crearUsuario(usr); 
        
    }

    private Rol traerRol(String rolRecibido) {
         List<Rol> listaRoles = controlPersis.traerRoles();
         
         for(Rol rol:listaRoles){
             if(rol.getNombreRol().equals(rolRecibido)) {
                 return rol;
             }
             
             
         }
    
        return null;
    }

    private int traerUltimaId() {
        
       List <Usuario> listaUsuarios = this.traerUsuarios();
       Usuario usu = listaUsuarios.get(listaUsuarios.size()-1);
       return usu.getId();
    }


   
  
 

    
  }
