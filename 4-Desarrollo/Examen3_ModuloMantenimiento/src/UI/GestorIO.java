package UI;

import javax.swing.JOptionPane;

/**
 * Clase utilizada para mostrar y solicitar datos al usuario
 * 
 * @author Carlos
 * @author Melvin
 */
public class GestorIO {
  /**
   * metodo para mostrar datos de tipo String
   * @param String
   */
  public static void mostrarString(String mensaje) {
    JOptionPane.showMessageDialog(null, mensaje);
  }
  
  /**
   * metodo para solicitar datos de tipo entero
   * @param String
   * @return int
   */
  public static int solicitarInt(String mensaje) {
    int numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
    return numero;
  }
  
  /**
   * metodo para ingresar datos de tipo String
   * @param String
   * @return String
   */
  public static String solicitarString(String mensaje) {
    return JOptionPane.showInputDialog(null, mensaje);
  }
  
  /**
   * metodo para mostrar datos de tipo String con mensaje de error
   * @param String
   */
  public static void  mostrarStringError(String mensaje) {
      JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
  }
}