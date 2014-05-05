package presentation.events;

import javax.swing.*;
import java.awt.event.*;
import presentation.forms.article.*;

public class ArticleEvent extends WindowAdapter implements ActionListener {
    JFrame frame = null;

    public ArticleEvent(JFrame frame) {
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent e) {
        Object object = e.getSource();
        JButton bu_work = null;

        if (object instanceof JButton){
            bu_work = (JButton) object;
            if(bu_work.getName() == "btn_save"){
                frame.dispose();
            } else if(bu_work.getName() == "btn_addarticle") {
                new Article();
            } else if(bu_work.getName() == "btn_editarticle") {
                new Article();
            } else if(bu_work.getName() == "btn_search") {

            } else if(bu_work.getName() == "btn_reset") {

            }
        }
    }
}
