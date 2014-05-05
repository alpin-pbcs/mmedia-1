package presentation.events;

import presentation.forms.customer.Customer;

import javax.swing.*;
import java.awt.event.*;

public class InvoiceEvent extends WindowAdapter implements ActionListener {
    JFrame frame = null;

    public InvoiceEvent(JFrame frame) {
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent e) {
        Object object = e.getSource();
        JButton bu_work = null;

        if (object instanceof JButton){
            bu_work = (JButton) object;
            if(bu_work.getName() == "btn_createPDF"){

            }
        }
    }
}
