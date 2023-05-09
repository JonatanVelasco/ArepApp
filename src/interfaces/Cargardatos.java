
package interfaces;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class Cargardatos {
    
    
    public void CargarDatos(JTable paramtabla, JTextField paramCedula, JTextField paramNombre, JTextField paramApelldio, JTextField paramDireccion, JTextField paramCelular, JTextField paramUsuario, JTextField paramPass, JTextField paramCodigo_rol) {

        try {

            int fila = paramtabla.getSelectedRow();

            if (fila >= 0) {

                paramCedula.setText(paramtabla.getValueAt(fila, 0).toString());
                paramNombre.setText(paramtabla.getValueAt(fila, 1).toString());
                paramApelldio.setText(paramtabla.getValueAt(fila, 2).toString());
                paramDireccion.setText(paramtabla.getValueAt(fila, 3).toString());
                paramCelular.setText(paramtabla.getValueAt(fila, 4).toString());
                paramUsuario.setText(paramtabla.getValueAt(fila, 5).toString());
                paramPass.setText(paramtabla.getValueAt(fila, 6).toString());
                paramCodigo_rol.setText(paramtabla.getValueAt(fila, 7).toString());

            } else {

                JOptionPane.showMessageDialog(null, "no se selecciono los registros, error ");

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "error de seleccion, error " + e.toString());
        }

    }

}

