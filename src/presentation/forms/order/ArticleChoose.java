package presentation.forms.order;

import presentation.events.OrderEvent;
import presentation.events.WindowEvent;

import javax.swing.*;
import java.awt.*;

public class ArticleChoose {
    private JButton btn_saveArticle;
    private JButton btn_abort;
    public JComboBox cb_article;
    public JTextField tf_count;
    private JPanel pan_artSelect;

    private WindowEvent windowevent = null;
    private OrderEvent orderevent = null;

    public ArticleChoose() {
        JFrame frame = new JFrame("Artikelauswahl");
        windowevent = new WindowEvent(frame);
        orderevent = new OrderEvent(frame);

        this.setButtons();

        frame.setContentPane(pan_artSelect);
        frame.pack();
        frame.setVisible(true);
    }

    private void setButtons() {
        btn_abort.addActionListener(windowevent);
        btn_abort.setName("btn_abort");

        btn_saveArticle.addActionListener(orderevent);
        btn_saveArticle.setName("btn_saveArticle");
    }
}
