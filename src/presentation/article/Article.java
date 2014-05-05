package presentation.article;

import javax.swing.*;
import presentation.events.*;

public class Article{
    private JButton btn_abort;
    private JButton btn_save;
    private JTextField tf_artnr;
    private JTextField tf_artdesc;
    private JTextField tf_sz;
    private JTextField tf_price;
    private JComboBox cb_status;
    private JPanel pan_art;


    WindowEvent windowevent = null;
    ArticleEvent articleevent = null;


    public Article() {
        this.createUIComponents();
    }

    private void createUIComponents() {
        JFrame frame = new JFrame("Artikel hinzufügen/bearbeiten");
        windowevent = new WindowEvent(frame);
        articleevent = new ArticleEvent(frame);

        btn_abort.addActionListener(windowevent);
        btn_abort.setName("btn_abort");

        btn_save.addActionListener(articleevent);
        btn_save.setName("btn_save");

        frame.setContentPane(pan_art);
        frame.pack();
        frame.setVisible(true);
    }
}