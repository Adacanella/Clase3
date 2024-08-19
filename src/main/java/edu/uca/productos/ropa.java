package edu.uca.productos;

public class ropa extends ProductoBase {
    private String talle;


    public ropa(int id, String nombre, double precio, String talle) {
        super(id, nombre, precio);
        this.talle = talle;
    }
    @Override
    public String toString() {
        return super.toString() + "ropa{" + "talle=" + talle + '}';
    }

}
