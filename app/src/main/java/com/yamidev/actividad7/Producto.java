package com.yamidev.actividad7;

public class Producto {
    private String nombre;
    private double precio;
    private String descripcion;
    private String imagenUrl;
    private String webUrl;

    public Producto(String nombre, double precio, String descripcion, String imagenUrl, String webUrl) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.imagenUrl = imagenUrl;
        this.webUrl = webUrl;
    }

    // Getters
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public String getDescripcion() { return descripcion; }
    public String getImagenUrl() { return imagenUrl; }
    public String getWebUrl() { return webUrl; }

    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPrecio(double precio) { this.precio = precio; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setImagenUrl(String imagenUrl) { this.imagenUrl = imagenUrl; }
    public void setWebUrl(String webUrl) { this.webUrl = webUrl; }
}
