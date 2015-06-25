
package BL;

import UI.Mantenimiento;

public class Principal {
    public static void main(String[] args) {
        Mantenimiento mantenimiento = Mantenimiento.getInstanciaMantenimiento(); //Singleton
        mantenimiento.iniciarMantenimiento();
        
        incluirRegistros(mantenimiento);
        
        mantenimiento.setVisible(true);
        
    }
    
    private static void incluirRegistros(Mantenimiento mantenimiento) {
        Articulo articulo = new Articulo(0, "R21921921", "Útiles escolares", 3.0, "IGV", 13, 9, "Chiclayo", "Articulo de gran valor", "Marcador para pizarra", "Inversiones Santa Catalina", 5.0, "Percepción IGV", 13, 100, true, false);
        mantenimiento.getListaArticulos().add(articulo);
        
    }
}
