
package com.mycompany.login.persistencia;

import com.mycompany.login.logica.Rol;
import com.mycompany.login.logica.Usuario;
import java.util.List;

public class ControladoraPersistencia {
    
   UsuarioJpaController usuarioJpa = new UsuarioJpaController();
   RolJpaController rolJpa = new RolJpaController();
   
   public List<Usuario> traerUsuarios() {
        
       List<Usuario> listaUsuario = usuarioJpa.findUsuarioEntities();
       return listaUsuario;
        
    }

    public List<Rol> traerRoles() {
       return rolJpa.findRolEntities();
    }

    public void crearUsuario(Usuario usr) {
        
       usuarioJpa.create(usr);
        
    }

   
    
 }
