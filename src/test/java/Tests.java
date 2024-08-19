import edu.uca.productos.ProductoBase;
import edu.uca.Tienda;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {

    @Test
    public void productToStringTest(){
        ProductoBase ProductoBase = new ProductoBase(1, "producto de prueba", 200) {
            @Override
            public int getId() {
                return super.getId();
            }
        };
        System.out.println(productoBase);
    }

    @Test
    public void tiendaAgregarProductoTest(){
        Tienda tienda = new Tienda();
        ProductoBase productoBase = new ProductoBase(1, "producto de prueba", 200);
        tienda.agregarProducto(productoBase);
        Assert.assertEquals(tienda.getSize(), 1);
    }

    @Test
    public void mostrarInventarioTest(){
        Tienda tienda = new Tienda();
        ProductoBase productoBase = new ProductoBase(1, "producto de prueba", 200);
        tienda.agregarProducto(productoBase);
        tienda.mostrarInventario();
    }
}
