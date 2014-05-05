package presentation.forms.customerSearch;

import presentation.events.CustomerEvent;
import presentation.events.WindowEvent;

import javax.swing.*;

public class CustomerSearch {
    private JButton btn_search;
    private JButton btn_reset;
    private JButton btn_addCustomer;
    private JButton btn_editCustomer;
    private JButton btn_delCustomer;
    private JButton btn_abort;
    private JPanel pan_custsearch;
    public JTextField tf_search;
    public JList list_customer;

    private WindowEvent windowevent = null;
    private CustomerEvent customerevent = null;

    public CustomerSearch() {
        JFrame frame = new JFrame("Kundenverwaltung");
        windowevent = new WindowEvent(frame);
        customerevent = new CustomerEvent(frame);

        this.setButtons();

        frame.setContentPane(pan_custsearch);
        frame.pack();
        frame.setVisible(true);
    }

    private void setButtons() {
        btn_abort.addActionListener(windowevent);
        btn_abort.setName("btn_abort");

        btn_search.addActionListener(customerevent);
        btn_search.setName("btn_search");

        btn_reset.addActionListener(customerevent);
        btn_reset.setName("btn_reset");

        btn_addCustomer.addActionListener(customerevent);
        btn_addCustomer.setName("btn_addCustomer");

        btn_editCustomer.addActionListener(customerevent);
        btn_editCustomer.setName("btn_editCustomer");

        btn_delCustomer.addActionListener(customerevent);
        btn_delCustomer.setName("btn_delCustomer");
    }

}
