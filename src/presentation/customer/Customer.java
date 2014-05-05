package presentation.customer;

import javax.swing.*;
import java.awt.event.WindowEvent;

public class Customer{
    private JButton btn_abort;
    private JButton bt_save;
    private JTextField tf_customernr;
    private JTextField tf_Name;
    private JTextField tf_LastName;
    private JTextField tf_street;
    private JTextField tf_PLZ;
    private JTextField tf_email;
    private JTextField tf_housenr;
    private JTextField tf_phone;
    private JTextField tf_city;
    private JComboBox cb_status;
    private JPanel panel1;


    WindowEvent windowevent = null;

    public Customer() {

        JFrame frame = new JFrame("Kunde hinzufügen/bearbeiten");
        windowevent = new WindowEvent(frame);

        btn_abort.addActionListener();
        btn_abort.setName("btn_abort");

        frame.setContentPane(panel1);
        frame.pack();
        frame.setVisible(true);
    }
}