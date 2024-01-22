package com.ninacode.crudmaquetacion.clases;

public class InformacionTienda {
    //Atributos
    private int codigo;
    private String propietario;
    private String rubro;
    
    //Constructor

    public InformacionTienda(int codigo, String propietario, String rubro) {
        this.codigo = codigo;
        this.propietario = propietario;
        this.rubro = rubro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }
    
    //Para mostrar la informacion de las tiendas
    public void mostrar(){
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Propietario: " + this.propietario);
        System.out.println("Rubro: " + this.rubro);
    }
}
