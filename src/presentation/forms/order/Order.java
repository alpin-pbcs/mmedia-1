package presentation.forms.order;

import presentation.events.OrderEvent;
import presentation.events.WindowEvent;

import javax.swing.*;


public class Order{
    private JButton btn_abort;
    private JButton btn_addArticle;
    private JButton btn_delArticle;
    private JButton btn_saveOrder;
    public JList list_order;
    public JComboBox cb_customer;
    private JPanel pan_order;


    private WindowEvent windowevent = null;
    private OrderEvent orderevent = null;

    public Order() {
        JFrame frame = new JFrame("Auftrag hinzufügen/bearbeiten");
        windowevent = new WindowEvent(frame);
        orderevent = new OrderEvent(frame);

        this.setButtons();

        frame.setContentPane(pan_order);
        frame.pack();
        frame.setVisible(true);
    }

    private void setButtons() {
        btn_abort.addActionListener(windowevent);
        btn_abort.setName("btn_abort");

        btn_addArticle.addActionListener(orderevent);
        btn_addArticle.setName("btn_addArticle");

        btn_delArticle.addActionListener(orderevent);
        btn_delArticle.setName("btn_delArticle");

        btn_saveOrder.addActionListener(orderevent);
        btn_saveOrder.setName("btn_saveOrder");
    }
}