
package BL;

public class Articulo {
    
    private int numeroArticulo;
    private String upc_ean_isbn;
    private String categoria;
    private double costo;
    private String impuesto1;
    private int porcentaje1;
    private int cantidad;
    private String localizacion;
    private String descripcion;
    private String nombreArticulo;
    private String proveedor;
    private double precioUnitario;
    private String impuesto2;
    private int porcentaje2;
    private int nivelReordenamiento;
    private boolean descripcionAlterna;
    private boolean articuloTieneNumeroSerie;
    
    public Articulo(int numeroArticulo, String upc_ean_isbn, String categoria, double costo, String impuesto1, int porcentaje1, int cantidad, String localizacion, String descripcion, String nombreArticulo, String proveedor, double precioUnitario, String impuesto2, int porcentaje2, int nivelReordenamiento, boolean descripcionAlterna, boolean articuloTieneNumeroSerie) {
        this.numeroArticulo = numeroArticulo;
        this.upc_ean_isbn = upc_ean_isbn;
        this.categoria = categoria;
        this.costo = costo;
        this.impuesto1 = impuesto1;
        this.porcentaje1 = porcentaje1;
        this.cantidad = cantidad;
        this.localizacion = localizacion;
        this.descripcion = descripcion;
        this.nombreArticulo = nombreArticulo;
        this.proveedor = proveedor;
        this.precioUnitario = precioUnitario;
        this.impuesto2 = impuesto2;
        this.porcentaje2 = porcentaje2;
        this.nivelReordenamiento = nivelReordenamiento;
        this.descripcionAlterna = descripcionAlterna;
        this.articuloTieneNumeroSerie = articuloTieneNumeroSerie;
    }
    
    public Articulo() {
    }
    
    public void editarArticulo(String upc_ean_isbn, String categoria, double costo, String impuesto1, int cantidad, String localizacion, String descripcion, String nombreArticulo, String proveedor, double precioUnitario, String impuesto2, int nivelReordenamiento, boolean descripcionAlterna, boolean articuloTieneNumeroSerie) {
        this.upc_ean_isbn = upc_ean_isbn;
        this.categoria = categoria;
        this.costo = costo;
        this.impuesto1 = impuesto1;
        this.cantidad = cantidad;
        this.localizacion = localizacion;
        this.descripcion = descripcion;
        this.nombreArticulo = nombreArticulo;
        this.proveedor = proveedor;
        this.precioUnitario = precioUnitario;
        this.impuesto2 = impuesto2;
        this.nivelReordenamiento = nivelReordenamiento;
        this.descripcionAlterna = descripcionAlterna;
        this.articuloTieneNumeroSerie = articuloTieneNumeroSerie;
    }

    public int getNumeroArticulo() {
        return numeroArticulo;
    }

    public void setNumeroArticulo(int numeroArticulo) {
        this.numeroArticulo = numeroArticulo;
    }

    public String getUpc_ean_isbn() {
        return upc_ean_isbn;
    }

    public void setUpc_ean_isbn(String upc_ean_isbn) {
        this.upc_ean_isbn = upc_ean_isbn;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getImpuesto1() {
        return impuesto1;
    }

    public void setImpuesto1(String impuesto1) {
        this.impuesto1 = impuesto1;
    }

    public int getPorcentaje1() {
        return porcentaje1;
    }

    public void setPorcentaje1(int porcentaje1) {
        this.porcentaje1 = porcentaje1;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getImpuesto2() {
        return impuesto2;
    }

    public void setImpuesto2(String impuesto2) {
        this.impuesto2 = impuesto2;
    }

    public int getPorcentaje2() {
        return porcentaje2;
    }

    public void setPorcentaje2(int porcentaje2) {
        this.porcentaje2 = porcentaje2;
    }

    public int getNivelReordenamiento() {
        return nivelReordenamiento;
    }

    public void setNivelReordenamiento(int nivelReordenamiento) {
        this.nivelReordenamiento = nivelReordenamiento;
    }

    public boolean isDescripcionAlterna() {
        return descripcionAlterna;
    }

    public void setDescripcionAlterna(boolean descripcionAlterna) {
        this.descripcionAlterna = descripcionAlterna;
    }

    public boolean isArticuloTieneNumeroSerie() {
        return articuloTieneNumeroSerie;
    }

    public void setArticuloTieneNumeroSerie(boolean articuloTieneNumeroSerie) {
        this.articuloTieneNumeroSerie = articuloTieneNumeroSerie;
    }
}
