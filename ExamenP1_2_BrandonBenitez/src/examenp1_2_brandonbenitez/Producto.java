
package examenp1_2_brandonbenitez;

/**
 *
 * @author brhb2
 */
public class Producto {
    
    private int id_producto;
    private int cantidad;
    private String nombre;
    private int precio;
    private String estado;

    public Producto(int id_producto, int cantidad, String nombre, int precio, String estado) {
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.precio = precio;
        this.estado = estado;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Producto" + "id_producto: " + id_producto + ", cantidad: " + cantidad + ", nombre: " + nombre + ", precio: " + precio + ", estado: " + estado + "\n";
    }
    
    
    
}
