package presentation.forms.invoice;

import presentation.events.InvoiceEvent;
import presentation.events.WindowEvent;

import javax.swing.*;

public class Invoice {
    private JButton btn_abort;
    private JButton btn_createPDF;
    private JPanel pan_invoice;
    public JList list_invoice;
    public JComboBox cb_order;

    private WindowEvent windowevent = null;
    private InvoiceEvent invoiceevent = null;

    public Invoice() {
        JFrame frame = new JFrame("Rechnung erstellen");
        windowevent = new WindowEvent(frame);
        invoiceevent = new InvoiceEvent(frame);

        this.setButtons();

        frame.setContentPane(pan_invoice);
        frame.pack();
        frame.setVisible(true);
    }

    private void setButtons() {
        btn_abort.addActionListener(windowevent);
        btn_abort.setName("btn_abort");

        btn_createPDF.addActionListener(invoiceevent);
        btn_createPDF.setName("btn_createPDF");
    }
}
