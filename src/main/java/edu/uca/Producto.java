package edu.uca;

public class Producto {
    private int id;
    private String nombre;
    private double precio;

    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }

    public double getPrecioFinal() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto{id=" + id + ", nombre='" + nombre + "', precio=" + precio + "}";
    }


    public static class electrodomesticos extends Producto{
        private String garantia;
        public electrodomesticos(int id, String nombre, double precio, String garantia) {
            super(id, nombre, precio);
            this.garantia = garantia;
        }
        @Override
        public String toString() {
            return super.toString() + "electrodomesticos{" + "garantia=" + garantia + '}';
        }
    }
}
