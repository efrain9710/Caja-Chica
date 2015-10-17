package Clases;

import java.util.Date;

/**
 *
 * @author Victor Pino
 */

public class Factura {
    
    private Integer idFactura;
    private Date fechaFactura;
    private Date fechaCarga;
    private Integer idProveedor;
    private Integer idPersonal;
    private Integer idServicio;
    private String descripcion;
    private Integer idStatus;
    private Double monto;

    public Factura(Integer idFactura, Date fechaFactura, Date fechaCarga, 
            Integer idProveedor, Integer idPersonal, Integer idServicio, 
            String descripcion, Integer idStatus, Double monto) {
        this.idFactura = idFactura;
        this.fechaFactura = fechaFactura;
        this.fechaCarga = fechaCarga;
        this.idProveedor = idProveedor;
        this.idPersonal = idPersonal;
        this.idServicio = idServicio;
        this.descripcion = descripcion;
        this.idStatus = idStatus;
        this.monto = monto;
    }

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public Date getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(Date fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Integer getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(Integer idPersonal) {
        this.idPersonal = idPersonal;
    }

    public Integer getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Integer idServicio) {
        this.idServicio = idServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }
    
    
    
}
