package presentation.order;

import presentation.events.WindowEvent;

import javax.swing.*;


public class Order{
    private JButton btn_abort;
    private JButton bt_add;
    private JButton bt_delete;
    private JButton bt_save;
    private JList list_order;
    private JComboBox cb_customer;
    private JPanel panel1;


   WindowEvent windowevent = null;

    public Order() {

        JFrame frame = new JFrame("Auftrag hinzufügen/bearbeiten");
        windowevent = new WindowEvent(frame);

        btn_abort.addActionListener(windowevent);
        btn_abort.setName("btn_abort");

        frame.setContentPane(panel1);
        frame.pack();
        frame.setVisible(true);
    }
}