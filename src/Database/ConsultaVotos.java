
package Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConsultaVotos {
    private int votosPRI;
    private int votosPAN;
    private int votosPRD;
    private String mensaje;
    private String status;

    public ConsultaVotos() {
    }

    public int getVotosPRI() {
        return votosPRI;
    }

    public void setVotosPRI(int votosPRI) {
        this.votosPRI = votosPRI;
    }

    public int getVotosPAN() {
        return votosPAN;
    }

    public void setVotosPAN(int votosPAN) {
        this.votosPAN = votosPAN;
    }

    public int getVotosPRD() {
        return votosPRD;
    }

    public void setVotosPRD(int votosPRD) {
        this.votosPRD = votosPRD;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    public int[] getVotosEstado(String casilla){
        ConexionSGBD conexion = new ConexionSGBD("shiftdb","champeto","192.168.1.65","simons83");
        Connection conectar = conexion.ConectToDatabase();
        try{
            try (Statement consulta = conectar.createStatement()) {
                String query = "SELECT cveCasilla, pri, pan, prd FROM voto WHERE cveCasilla='"+ casilla+"'";
                try (ResultSet resultado = consulta.executeQuery(query)) {
                    if(resultado.next()){
                        setVotosPRI(resultado.getInt("pri"));
                        setVotosPAN(resultado.getInt("pan"));
                        setVotosPRD(resultado.getInt("prd"));
                    }
                }
            }
            conectar.close();
            conexion.CloseConection();
        }catch(Exception e){
            System.out.println("Error SQL"+e);
        }
        int votosEstado[] = {
            getVotosPRI(),
            getVotosPAN(),
            getVotosPRD(),
        };
        return votosEstado;
    }
    
    public String[] getEstadoCasilla(String casilla){
        ConexionSGBD conexion = new ConexionSGBD("shiftdb","champeto","192.168.1.65","simons83");
        Connection conectar = conexion.ConectToDatabase();
        try{
            try (Statement consulta = conectar.createStatement()) {
                String query = "SELECT cveCasilla, mensaje, status FROM estado WHERE cveCasilla='"+ casilla+"'";
                try (ResultSet resultado = consulta.executeQuery(query)) {
                    if(resultado.next()){
                        setMensaje(resultado.getString("mensaje"));
                        setStatus(resultado.getString("status"));
                    }
                }
            }
            conectar.close();
            conexion.CloseConection();
        }catch(Exception e){
            System.out.println("Error SQL");
        }
        String estadoCasilla[] = {
            getMensaje(),
            getStatus(),
        };
        return estadoCasilla;
    }
    
    public void updateVotos(String casilla, int vpri, int vpan, int vprd) {
        ConexionSGBD conexion = new ConexionSGBD("shiftdb","champeto","192.168.1.65", "simons83");
        Connection conectar = conexion.ConectToDatabase();
        try {
            String query = "UPDATE voto set pri=?, pan=?,prd=? WHERE cveCasilla= '" + casilla + "'";
            PreparedStatement consulta = conectar.prepareStatement(query);
            consulta.setInt(1, vpri);
            consulta.setInt(2, vpan);
            consulta.setInt(3, vprd);
            consulta.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error SQL");
        }
    }
    
    public void updateEstado(String casilla, String msj, String status) {
        ConexionSGBD conexion = new ConexionSGBD("shiftdb","champeto","192.168.1.65", "simons83");
        Connection conectar = conexion.ConectToDatabase();
        try {
            String query = "UPDATE estado set mensaje=?, status=? WHERE cveCasilla= '" + casilla + "'";
            PreparedStatement consulta = conectar.prepareStatement(query);
            consulta.setString(1, msj);
            consulta.setString(2, status);
            consulta.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error SQL");
        }
    }
    
}
