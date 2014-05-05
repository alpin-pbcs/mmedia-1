package presentation.forms.articleSearch;

import presentation.events.*;
import javax.swing.*;

public class ArticleSearch {
    private JPanel pan_artsearch;
    public JList list_article;
    private JButton btn_search;
    private JButton btn_reset;
    private JButton btn_addarticle;
    private JButton btn_editarticle;
    private JButton btn_delarticle;
    private JButton btn_abort;
    public JTextField tf_search;

    private WindowEvent windowevent = null;
    private ArticleEvent artsearchevent = null;

    public ArticleSearch() {
        JFrame frame = new JFrame("Artikelverwaltung");
        windowevent = new WindowEvent(frame);
        artsearchevent = new ArticleEvent(frame);

        this.setButtons();

        frame.setContentPane(pan_artsearch);
        frame.pack();
        frame.setVisible(true);
    }

    private void setButtons() {
        btn_abort.addActionListener(windowevent);
        btn_abort.setName("btn_abort");

        btn_addarticle.addActionListener(artsearchevent);
        btn_addarticle.setName("btn_addarticle");

        btn_editarticle.addActionListener(artsearchevent);
        btn_editarticle.setName("btn_editarticle");

        btn_search.addActionListener(artsearchevent);
        btn_search.setName("btn_search");

        btn_reset.addActionListener(artsearchevent);
        btn_reset.setName("btn_reset");
    }
}
