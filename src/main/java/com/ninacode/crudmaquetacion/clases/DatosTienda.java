package com.ninacode.crudmaquetacion.clases;


public class DatosTienda {
    //Atributos
    private int codigo;
    private String nombre;
    private String direccion;
    private long ruc;
    private long telefono;
    private int aforo;
    
    //Constructor

    public DatosTienda(int codigo, String nombre, String direccion, long ruc, long telefono, int aforo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ruc = ruc;
        this.telefono = telefono;
        this.aforo = aforo;
    }
    
    //Metodos de Acceso

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getRuc() {
        return ruc;
    }

    public void setRuc(long ruc) {
        this.ruc = ruc;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }
    
    //Metodo para mostrar datos de la tienda
    public void mostrar(){
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Direccion: " + this.direccion);
        System.out.println("Ruc: " + this.ruc);
        System.out.println("Telefono: " + this.telefono);
        System.out.println("Aforo: " + this.aforo);
    }
}
