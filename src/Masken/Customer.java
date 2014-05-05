package presentation.customer;

import javax.swing.*;
import presentation.MyWindowEvent;

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


    MyWindowEvent windowevent = null;

    public Customer() {
        this.createUIComponents();
    }

    private void createUIComponents() {
        JFrame frame = new JFrame("Kunde hinzufügen/bearbeiten");
        windowevent = new MyWindowEvent(frame);

        bt_abbrechen.addActionListener(windowevent);
        bt_abbrechen.setName("bt_abbrechen");

        frame.setContentPane(panel1);
        frame.pack();
        frame.setVisible(true);
    }
}