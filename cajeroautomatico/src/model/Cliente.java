package model;

public class Cliente {
     private String numeroDeCedula;
     private String contrasenia;
    
     private String nombreCompleto;
     private float saldo;
     private String tipoCuenta; //caja de ahorro o cuenta corriente

    public String getNumeroDeCedula() {
        return numeroDeCedula;
    }
    
    public void setNumeroDeCedula(String numeroDeCedula) {
        this.numeroDeCedula = numeroDeCedula;
    }
  
    public String getContrasenia() {
        return contrasenia;
    }
   
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }
   
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
   
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    
    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
             
 }


