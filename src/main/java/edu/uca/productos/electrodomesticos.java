package edu.uca.productos;

public class electrodomesticos extends ProductoBase {
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

