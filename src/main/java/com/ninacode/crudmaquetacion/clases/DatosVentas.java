package com.ninacode.crudmaquetacion.clases;

public class DatosVentas {
    private int codigo;
    private long ruc;
    private String nombre;
    private int cantidad;
    private double precio;

    public DatosVentas(int codigo, long ruc, String nombre, int cantidad, double precio) {
        this.codigo = codigo;
        this.ruc = ruc;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public long getRuc() {
        return ruc;
    }

    public void setRuc(long ruc) {
        this.ruc = ruc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void mostrar(){
        System.out.println("Codigo: " + this.codigo);
        System.out.println("RUC: " + this.ruc);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Cantidad: " + this.cantidad);
        System.out.println("Precio: " +  this.precio);
    }
    
}
