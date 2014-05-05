package presentation.events;

import javax.swing.*;
import java.awt.event.*;

import presentation.forms.order.ArticleChoose;
import presentation.forms.order.Order;

public class OrderEvent extends WindowAdapter implements ActionListener {
    JFrame frame = null;

    public OrderEvent(JFrame frame) {
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent e) {
        Object object = e.getSource();
        JButton bu_work = null;

        if (object instanceof JButton){
            bu_work = (JButton) object;
            if(bu_work.getName() == "btn_save"){
                frame.dispose();
            } else if(bu_work.getName() == "btn_addOrder") {
                new Order();
            } else if(bu_work.getName() == "btn_editOrder") {
                new Order();
            } else if(bu_work.getName() == "btn_delOrder") {

            } else if(bu_work.getName() == "btn_search") {

            } else if(bu_work.getName() == "btn_reset") {

            } else if(bu_work.getName() == "btn_saveOrder") {

            } else if(bu_work.getName() == "btn_addArticle") {
                new ArticleChoose();
            } else if(bu_work.getName() == "btn_delArticle") {

            } else if(bu_work.getName() == "btn_saveArticle") {

            }
        }
    }
}
