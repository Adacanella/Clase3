package edu.uca;

import edu.uca.productos.ProductoBase;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private List<ProductoBase> inventario = new ArrayList<>();

    public int getSize(){
        return inventario.size();
    }

    public void agregarProducto(ProductoBase productoBase) {
        inventario.add(productoBase);
    }

    public void mostrarInventario() {
        System.out.println("Inventario: ");
        for (ProductoBase productoBase : inventario) {
            System.out.println(productoBase);
        }
    }

}
