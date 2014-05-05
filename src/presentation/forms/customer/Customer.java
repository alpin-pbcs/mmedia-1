package presentation.forms.customer;

import presentation.events.CustomerEvent;
import presentation.events.WindowEvent;

import javax.swing.*;

public class Customer {
    private JButton btn_save;
    private JButton btn_abort;
    private JPanel pan_customer;
    public JTextField tf_custnr;
    public JTextField tf_firstname;
    public JTextField tf_lastname;
    public JTextField tf_street;
    public JTextField tf_housenr;
    public JTextField tf_city;
    public JTextField tf_zip;
    public JTextField tf_email;
    public JTextField tf_tel;

    private WindowEvent windowevent = null;
    private CustomerEvent customerevent = null;

    public Customer() {
        JFrame frame = new JFrame("Kunde hinzufügen/bearbeiten");
        windowevent = new WindowEvent(frame);
        customerevent = new CustomerEvent(frame);

        this.setButtons();

        frame.setContentPane(pan_customer);
        frame.pack();
        frame.setVisible(true);
    }

    private void setButtons() {
        btn_abort.addActionListener(windowevent);
        btn_abort.setName("btn_abort");

        btn_save.addActionListener(customerevent);
        btn_save.setName("btn_save");
    }
}
