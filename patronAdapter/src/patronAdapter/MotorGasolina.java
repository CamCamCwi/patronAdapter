package patronAdapter;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MotorGasolina implements Motor {

    public MotorGasolina() {
        //super();
        ImageIcon icon = new ImageIcon("src/img/motor.png");
        JOptionPane.showMessageDialog(null, "Creando el motor a gasolina.", "Motor a gasolina", JOptionPane.PLAIN_MESSAGE,icon);
    }

    @Override
    public void encender() {
        ImageIcon icon = new ImageIcon("src/img/car-key.png");
        JOptionPane.showMessageDialog(null, "Encendiendo el motor a gasolina.", "Motor a gasolina", JOptionPane.PLAIN_MESSAGE,icon);
    }

    @Override
    public void acelerar() {
        ImageIcon icon = new ImageIcon("src/img/gear-shift.png");
        JOptionPane.showMessageDialog(null, "Acelerando el motor a gasolina.", "Motor a gasolina", JOptionPane.PLAIN_MESSAGE,icon);
    }

    @Override
    public void apagar() {
        ImageIcon icon = new ImageIcon("src/img/car-key.png");
        JOptionPane.showMessageDialog(null, "Apagando el motor a gasolina.", "Motor a gasolina", JOptionPane.PLAIN_MESSAGE,icon);
    }
}
