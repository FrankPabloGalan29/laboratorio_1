/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio1;

/**
 *
 * @author ESTUDIANTE
 */
public class Producto {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the precioCompra
     */
    public double getPrecioCompra() {
        return precioCompra;
    }

    /**
     * @param precioCompra the precioCompra to set
     */
    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    /**
     * @return the precioVenta
     */
    public double getPrecioVenta() {
        return precioVenta;
    }

    /**
     * @param precioVenta the precioVenta to set
     */
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    /**
     * @return the stackMinimo
     */
    public int getStackMinimo() {
        return stackMinimo;
    }

    /**
     * @param stackMinimo the stackMinimo to set
     */
    public void setStackMinimo(int stackMinimo) {
        this.stackMinimo = stackMinimo;
    }

    /**
     * @return the stackMaximo
     */
    public int getStackMaximo() {
        return stackMaximo;
    }

    /**
     * @param stackMaximo the stackMaximo to set
     */
    public void setStackMaximo(int stackMaximo) {
        this.stackMaximo = stackMaximo;
    }

    /**
     * @return the formaPago
     */
    public String getFormaPago() {
        return formaPago;
    }

    /**
     * @param formaPago the formaPago to set
     */
    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }
    private String nombre;
    private String codigo;
    private double precioCompra;
    private double precioVenta;
    private int stackMinimo;
    private int stackMaximo;
    private String formaPago;
    
    
}
