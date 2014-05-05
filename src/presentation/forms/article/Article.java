package presentation.forms.article;

import javax.swing.*;
import presentation.events.*;

public class Article{
    private JButton btn_abort;
    private JButton btn_save;
    public JTextField tf_artnr;
    public JTextField tf_artdesc;
    public JTextField tf_sz;
    public JTextField tf_price;
    public JComboBox cb_status;
    private JPanel pan_art;

    private WindowEvent windowevent = null;
    private ArticleEvent articleevent = null;

    public Article() {
        JFrame frame = new JFrame("Artikel hinzufügen/bearbeiten");
        windowevent = new WindowEvent(frame);
        articleevent = new ArticleEvent(frame);

        this.setButtons();

        frame.setContentPane(pan_art);
        frame.pack();
        frame.setVisible(true);
    }

    private void setButtons() {
        btn_abort.addActionListener(windowevent);
        btn_abort.setName("btn_abort");

        btn_save.addActionListener(articleevent);
        btn_save.setName("btn_save");
    }
}