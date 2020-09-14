package patronAdapter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MotorElectrico {

    private boolean conectado;

    public MotorElectrico() {
        ImageIcon icon = new ImageIcon("src/img/motor.png");
        JOptionPane.showMessageDialog(null, "Creando motor eléctrico...", "Motor eléctrico", JOptionPane.PLAIN_MESSAGE, icon);
        this.conectado = false;
    }

    public void conectar() {
        ImageIcon icon = new ImageIcon("src/img/car-key.png");
        JOptionPane.showMessageDialog(null, "Conectando motor eléctrico...", "Motor eléctrico", JOptionPane.PLAIN_MESSAGE, icon);
        this.conectado = true;
    }

    public void activar() {
        if (!this.conectado) {
            ImageIcon icon = new ImageIcon("src/img/dashboard.png");
            JOptionPane.showMessageDialog(null, "No se puede activar, porque no está conectado el motor eléctrico.", "Motor eléctrico", JOptionPane.PLAIN_MESSAGE, icon);
        } else {
            ImageIcon icon = new ImageIcon("src/img/power.png");
            JOptionPane.showMessageDialog(null, "Está conectado, activando motor eléctrico....bbrrrrr.", "Motor eléctrico", JOptionPane.PLAIN_MESSAGE, icon);
        }
    }

    public void moverMasRapido() {
        if (!this.conectado) {
            ImageIcon icon = new ImageIcon("src/img/dashboard.png");
            JOptionPane.showMessageDialog(null, "No se puede mover rápido el motor eléctrico, porque no está conectado...", "Motor eléctrico", JOptionPane.PLAIN_MESSAGE, icon);
        } else {
            ImageIcon icon = new ImageIcon("src/img/gear-shift.png");
            JOptionPane.showMessageDialog(null, "Moviendo más rapido...aumentando voltaje.", "Motor eléctrico", JOptionPane.PLAIN_MESSAGE, icon);
        }
    }

    public void detener() {
        if (!this.conectado) {
            ImageIcon icon = new ImageIcon("src/img/dashboard.png");
            JOptionPane.showMessageDialog(null, "No se puede detener el motor eléctrico, porque no está conectado.", "Motor eléctrico", JOptionPane.PLAIN_MESSAGE, icon);
        } else {
            ImageIcon icon = new ImageIcon("src/img/gearshift.png");
            JOptionPane.showMessageDialog(null, "Deteniendo motor eléctrico.", "Motor eléctrico", JOptionPane.PLAIN_MESSAGE, icon);
        }
    }

    public void desconectar() {
        ImageIcon icon = new ImageIcon("src/img/car-key.png");
        JOptionPane.showMessageDialog(null, "Desconectando motor eléctrico...prrrruummm.", "Motor eléctrico", JOptionPane.PLAIN_MESSAGE, icon);
        this.conectado = false;
    }
}
