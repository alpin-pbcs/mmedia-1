package presentation;

import javax.swing.*;

public class Artikel{
    private JButton bt_abbrechen;
    private JButton bt_speichern;
    private JTextField tf_artnr;
    private JTextField tf_artbez;
    private JTextField tf_anzahl;
    private JTextField tf_Preis;
    private JComboBox cb_status;
    private JPanel panel1;


    MyWindowEvent windowevent = null;

    public Artikel() {
        JFrame frame = new JFrame("Artikel hinzufügen/bearbeiten");
        windowevent = new MyWindowEvent(frame);

        bt_abbrechen.addActionListener(windowevent);
        bt_abbrechen.setName("bt_abbrechen");

        frame.setContentPane(panel1);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {

    }

    public void setData(Artikel data) {
    }

    public void getData(Artikel data) {
    }

    public boolean isModified(Artikel data) {
        return false;
    }
}
