package Clases;

/**
 *
 * @author Victor Pino
 */
public class Proveedor {
    
    private Integer idProveedor;
    private String rifCed;
    private String nombre;
    private String direccion;

    public Proveedor(Integer idProveedor, String rifCed, String nombre, String direccion) {
        this.idProveedor = idProveedor;
        this.rifCed = rifCed;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getRifCed() {
        return rifCed;
    }

    public void setRifCed(String rifCed) {
        this.rifCed = rifCed;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
}
