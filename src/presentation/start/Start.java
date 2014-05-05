package presentation.start;

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

    WindowEvent windowevent = null;

    public Start() {
        JFrame frame = new JFrame("Verwaltungssoftware");
        windowevent = new WindowEvent(frame);

        btn_end.addActionListener(windowevent);
        btn_end.setName("btn_abort");

        frame.setContentPane(pan_start1);
        frame.pack();
        frame.setVisible(true);
    }
}
