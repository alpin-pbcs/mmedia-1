package presentation.events;

import presentation.forms.articleSearch.ArticleSearch;
import presentation.forms.customerSearch.CustomerSearch;
import presentation.forms.invoice.Invoice;
import presentation.forms.orderSearch.OrderSearch;
import presentation.forms.settings.Settings;

import javax.swing.*;
import java.awt.event.*;

public class StartEvent extends WindowAdapter implements ActionListener{
    JFrame frame = null;

    public StartEvent(JFrame frame) {
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent e) {
        Object object = e.getSource();
        JButton bu_work = null;

        if (object instanceof JButton){
            bu_work = (JButton) object;
            if(bu_work.getName() == "btn_article") {
                new ArticleSearch();
            } else if(bu_work.getName() == "btn_customer") {
                new CustomerSearch();
            } else if(bu_work.getName() == "btn_orders") {
                new OrderSearch();
            } else if(bu_work.getName() == "btn_invoice") {
                new Invoice();
            } else if(bu_work.getName() == "btn_settings") {
                new Settings();
            }
        }
    }
}
