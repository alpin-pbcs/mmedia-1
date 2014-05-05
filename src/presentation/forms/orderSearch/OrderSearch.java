package presentation.forms.orderSearch;

import presentation.events.OrderEvent;
import presentation.events.WindowEvent;

import javax.swing.*;

public class OrderSearch {
    private JButton btn_abort;
    private JButton btn_addOrder;
    private JButton btn_editOrder;
    private JButton btn_delOrder;
    private JButton btn_search;
    private JButton btn_reset;
    private JPanel pan_ordersearch;
    public JTextField tf_search;
    public JList list_orders;

    private WindowEvent windowevent = null;
    private OrderEvent orderevent = null;

    public OrderSearch() {
        JFrame frame = new JFrame("Auftragsverwaltung");
        windowevent = new WindowEvent(frame);
        orderevent = new OrderEvent(frame);

        this.setButtons();

        frame.setContentPane(pan_ordersearch);
        frame.pack();
        frame.setVisible(true);
    }

    private void setButtons() {
        btn_abort.addActionListener(windowevent);
        btn_abort.setName("btn_abort");

        btn_addOrder.addActionListener(orderevent);
        btn_addOrder.setName("btn_addOrder");

        btn_editOrder.addActionListener(orderevent);
        btn_editOrder.setName("btn_editOrder");

        btn_delOrder.addActionListener(orderevent);
        btn_delOrder.setName("btn_delOrder");

        btn_search.addActionListener(orderevent);
        btn_search.setName("btn_search");

        btn_reset.addActionListener(orderevent);
        btn_reset.setName("btn_reset");
    }
}
