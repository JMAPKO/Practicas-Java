
package com.mycompany.login.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
/*import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;*/
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Usuario implements Serializable {
  @Id
  //@GeneratedValue(strategy=GenerationType.SEQUENCE)
   private int id;
  @Basic 
  private String nomUsuario;
  private String pass;
  @ManyToOne
  @JoinColumn(name="fk_rol")
  Rol unRol;

  
  
    public Usuario(int id, String nomUsuario, String pass, Rol unRol) {
        this.id = id;
        this.nomUsuario = nomUsuario;
        this.pass = pass;
        this.unRol = unRol;
    }

    public Rol getUnRol() {
        return unRol;
    }

    public void setUnRol(Rol unRol) {
        this.unRol = unRol;
    }

   

   public Usuario() {
    }
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
}
