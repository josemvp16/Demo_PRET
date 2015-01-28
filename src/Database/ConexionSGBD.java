
package Database;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author J.Israel
 */
public class ConexionSGBD {
    
    //VARIABLES
    private Connection conexionBD;
    private Statement consulta;
    private PreparedStatement transaccion;
    private ResultSet resultadosConsulta;
    private ResultSetMetaData rsMetaData;
    
    private final String nombreBD;
    private final String usuarioBD;
    private final String hostBD;
    private final String contraseñaBD;
    
    public ConexionSGBD(String nBD, String uBD, String hBD, String cBD){
        nombreBD = nBD;
        usuarioBD = uBD;
        hostBD = hBD;
        contraseñaBD = cBD;
    }//END CONSTRUCTOR
    
    public Connection ConectToDatabase(){
        try{
            Class.forName("java.sql.Driver");
            conexionBD = DriverManager.getConnection("jdbc:mysql://"+hostBD+"/"+nombreBD, usuarioBD, contraseñaBD);
            System.out.println("OK_Conection");
            return conexionBD;
        }catch(ClassNotFoundException | SQLException e){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "No se pudo realizar la conexión a la base de datos ["+nombreBD+"]: "+e, "Conexion a BD", JOptionPane.ERROR_MESSAGE);
        }//END TRY/CATCH
        return null;
    }//END CONECTTODATABASE()
    
    public void CloseConection(){
        try{
            //resultadosConsulta.close();
            //consulta.close();
            conexionBD.close();
            System.out.println("OK_Close_Conection");
        }catch(SQLException e){
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "No se pudo realizar la conexión a la base de datos ["+nombreBD+"]: "+e, "Conexion a BD", JOptionPane.ERROR_MESSAGE);
        }//END TRY/CATCH
    }//END CLOSECONECTION()
    
}//END CLASS