package com.ninacode.crudmaquetacion.clases;

public class DatosTrabajadores {
    //Atributos
    private int codigo;
    private int Dni;
    private String nombres;
    private String apellidos;
    private String direccion;
    private long telefono;
    private double sueldo;
    
    //Constructor

    public DatosTrabajadores(int codigo,int Dni, String nombres, String apellidos, String direccion, long telefono, double sueldo) {
        this.codigo = codigo;
        this.Dni = Dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sueldo = sueldo;
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    //Metodo para mostrar datos de la tienda
    public void mostrar(){
        System.out.println("DNI: " + this.Dni);
        System.out.println("Nombres: " + this.nombres);
        System.out.println("Apellidos: " + this.apellidos);
        System.out.println("Direccion: " + this.direccion);
        System.out.println("Telefono: " + this.telefono);
        System.out.println("Sueldo: " + this.sueldo);
    }
}