package Main;

import Database.DBQueries;

public class Identification {

    public Identification() {
    }

    public boolean prepareText(String texto) {
        String[] sectores = texto.split("\"");
        String celular = sectores[1];
        celular = celular.substring(3, celular.length());
        String[] dateTime = sectores[5].split(",");
        String date = dateTime[0];
        String time = dateTime[1].substring(0, 7);
        String mensaje = sectores[6];
        return registrarMensaje(celular, date, time, mensaje);
    }

    public boolean registrarMensaje(String celular, String fecha, String hora, String mensaje) {
        DBQueries dbq = new DBQueries();
        String[] sectores = mensaje.split(":");
        String estado = sectores[0];
        String notas = sectores[1];
        switch (estado) {
            case "\nRegistro": {
                dbq.insertBitacora(celular, "Registro", notas, fecha, hora);
                return true;
            }
            case "\nApertura": {
                dbq.insertBitacora(celular, "Apertura", notas, fecha, hora);
                return true;
            }
            case "\nIncidente": {
                dbq.insertBitacora(celular, "Incidente", notas, fecha, hora);
                return true;
            }
            case "\nCierre": {
                dbq.insertBitacora(celular, "Cierre", notas, fecha, hora);
                return true;
            }
            case "\nConteo": {
                dbq.insertBitacora(celular, "Conteo", notas, fecha, hora);
                String[] sectoresVotos = notas.split(";");
                for (int i = 0; i < sectoresVotos.length; i++) {
                    String[] candidatoVotos = sectoresVotos[i].split("-");
                    dbq.updateResultados(celular, candidatoVotos[0], candidatoVotos[1]);
                }
                return true;
            }
            default: {
                System.out.println("Mensaje erroneo");
                return false;
            }
        }
    }

public static void main(String[] args) throws Exception {
        String mensaje2;
//        mensaje2 = "Registro: juan eduardo: Casilla: 1225";
//        mensaje2 = "Apertura: La casilla se abrio correctamente";
//        mensaje2 = "Incidente: Se presento un problema en la casilla";
//        mensaje2 = "Cierre: Se serro la casilla con exito";
//        mensaje2 = "Conteo: Se realizara el conteo";
        //mensaje2 = "Votos:, PRI-33, PAN-23, PRD-44, PT-67, PANAL-23";
        mensaje2 = "Votos:PRI-33,PAN-23,PRD-44,PT-67,PANAL-23";
        String mensaje = "+CMT: \"+527751197310\",\"\",\"15/01/27,23:06:22-24\"\n" + mensaje2;
        Identification id = new Identification();
        id.prepareText(mensaje);
    }
}
