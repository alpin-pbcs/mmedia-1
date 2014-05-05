package presentation.forms.start;

import presentation.events.StartEvent;
import presentation.events.WindowEvent;

import javax.swing.*;

public class Start {
    private JButton btn_customer;
    private JButton btn_orders;
    private JButton btn_invoice;
    private JButton btn_settings;
    private JButton btn_article;
    private JButton btn_end;
    private JPanel pan_start1;
    private JPanel pan_start2;

    private WindowEvent windowevent = null;
    private StartEvent startevent = null;

    public Start() {
        JFrame frame = new JFrame("Verwaltungssoftware");
        windowevent = new WindowEvent(frame);
        startevent = new StartEvent(frame);

        this.setButtons();

        frame.setContentPane(pan_start1);
        frame.pack();
        frame.setVisible(true);
    }

    private void setButtons() {
        btn_end.addActionListener(windowevent);
        btn_end.setName("btn_abort");

        btn_customer.addActionListener(startevent);
        btn_customer.setName("btn_customer");

        btn_orders.addActionListener(startevent);
        btn_orders.setName("btn_orders");

        btn_invoice.addActionListener(startevent);
        btn_invoice.setName("btn_invoice");

        btn_article.addActionListener(startevent);
        btn_article.setName("btn_article");

        btn_settings.addActionListener(startevent);
        btn_settings.setName("btn_settings");
    }
}
