
package Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConsultaVotos {
    private int votosPRI;
    private int votosPAN;
    private int votosPRD;
    private int votosPT;
    private int votosVERDE;
    private int votosALIANZA;

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

    public int getVotosPT() {
        return votosPT;
    }

    public void setVotosPT(int votosPT) {
        this.votosPT = votosPT;
    }

    public int getVotosVERDE() {
        return votosVERDE;
    }

    public void setVotosVERDE(int votosVERDE) {
        this.votosVERDE = votosVERDE;
    }

    public int getVotosALIANZA() {
        return votosALIANZA;
    }

    public void setVotosALIANZA(int votosALIANZA) {
        this.votosALIANZA = votosALIANZA;
    }
    
    public int[] getVotosEstado(String casilla){
        ConexionSGBD conexion = new ConexionSGBD("mysql-f6.homelinux.net","shiftdb","champeto","simons83");
        Connection conectar = conexion.ConectToDatabase();
        try{
            Statement consulta = conectar.createStatement();
            String query = "SELECT cveCasilla, pri, pan, prd FROM voto WHERE casilla='"+ casilla+"'";
            ResultSet resultado = consulta.executeQuery(query);
            if(resultado.next()){
                setVotosPRI(resultado.getInt("pri"));
                setVotosPAN(resultado.getInt("pan"));
                setVotosPRD(resultado.getInt("prd"));
            }
        }catch(Exception e){
            System.out.println("Error SQL");
        }
        int votosEstado[] = {
            getVotosPRI(),
            getVotosPAN(),
            getVotosPRD(),
        };
        return votosEstado;
    }
    
    
    
}
