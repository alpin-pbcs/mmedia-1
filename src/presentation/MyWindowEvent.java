package presentation;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Marius on 05.05.14.
 */
public class MyWindowEvent extends WindowAdapter
    implements ActionListener
{
    JFrame frame = null;

    public MyWindowEvent(JFrame frame){
        this.frame = frame;
    }

    public void windowClosing (WindowEvent e) {
        JFrame frame = null;
        frame =(JFrame) e.getSource();
        System.out.println("Hallo");
        frame.dispose();
    }

    public void actionPerformed(ActionEvent e) {
        Object object = e.getSource();
        JButton bu_work = null;

        System.out.println("Test");

        if (object instanceof JButton){
            bu_work = (JButton) object;
            if(bu_work.getName() == "bt_abbrechen"){
                System.out.println("Hallo");
                frame.dispose();
            }
        }
    }
}
