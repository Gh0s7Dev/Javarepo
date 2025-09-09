import javax.swing.*;
import java.awt.event.*;

public class EventoEjemplo {
    public static void main(String[] args) {
        // Crear ventana
        JFrame frame = new JFrame("Ejemplo de Evento");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear botón
        JButton boton = new JButton("Haz clic aquí");
        frame.add(boton);

        // Manejar evento de clic
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "¡Botón presionado!");
            }
        });

        // Mostrar ventana
        frame.setVisible(true);
    }
}
//Comentario de prueba