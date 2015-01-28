
package Main;

import Database.ConsultaVotos;
import static Main.Monitor.labelPAN;
import static Main.Monitor.labelPRD;
import static Main.Monitor.labelPRI;
import static Main.Monitor.labelStatus;
import java.awt.Color;

public class Update implements Runnable{

    @Override
    public void run() {
        try{
            while(true){
                ConsultaVotos cd = new ConsultaVotos();
                int votos[] = cd.getVotosEstado("1225");
                String estado[] = cd.getEstadoCasilla("1225");
                labelPRI.setText("" + votos[0]);
                labelPAN.setText("" + votos[1]);
                labelPRD.setText("" + votos[2]);
                labelStatus.setToolTipText(estado[0]);
                switch (estado[1]) {
                    case "A":
                        labelStatus.setBackground(Color.GREEN);
                        break;
                    case "B":
                        labelStatus.setBackground(Color.ORANGE);
                        break;
                    case "C":
                        labelStatus.setBackground(Color.RED);
                        break;
                }
                Thread.sleep(2000);
            }
        }catch(Exception e){
            
        }
    }
    
    
}
