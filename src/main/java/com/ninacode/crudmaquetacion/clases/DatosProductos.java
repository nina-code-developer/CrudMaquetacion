package com.ninacode.crudmaquetacion.clases;

public class DatosProductos {
    //Atributos
    private int codigo;
    private String nombre;
    private String categoria;
    private int cantidad;
    private double precio;
   
    //Constructor

    public DatosProductos(int codigo, String nombre, String categoria, int cantidad, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.precio = precio;
    }

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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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
   
    
    //Metodo para monstrar datos de la tienda
    public void mostrar() {
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Cantidad: " + this.cantidad);
        System.out.println("Precio: " + this.precio);
    }
}
