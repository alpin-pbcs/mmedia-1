package presentation.articleSearch;

import presentation.events.*;
import javax.swing.*;

public class ArticleSearch {
    private JPanel pan_artsearch;
    private JList list_article;
    private JButton btn_search;
    private JButton btn_reset;
    private JButton btn_addarticle;
    private JButton btn_editarticle;
    private JButton btn_delarticle;
    private JButton btn_abort;
    private JTextField tf_search;
    private JScrollBar sb_1;

    WindowEvent windowevent = null;
    ArticleEvent artsearchevent = null;

    public ArticleSearch() {
        JFrame frame = new JFrame("Artikelverwaltung");
        windowevent = new WindowEvent(frame);
        artsearchevent = new ArticleEvent(frame);

        btn_abort.addActionListener(windowevent);
        btn_abort.setName("btn_abort");

        frame.setContentPane(pan_artsearch);
        frame.pack();
        frame.setVisible(true);
    }
}
