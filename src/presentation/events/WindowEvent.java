package presentation.events;

import javax.swing.*;
import java.awt.event.*;

public class WindowEvent extends WindowAdapter
        implements ActionListener
{
    JFrame frame = null;

    public WindowEvent(JFrame frame){
        this.frame = frame;
    }

    public void windowClosing (java.awt.event.WindowEvent e) {
        JFrame frame = null;
        frame =(JFrame) e.getSource();
        frame.dispose();
    }

    public void actionPerformed(ActionEvent e) {
        Object object = e.getSource();
        JButton bu_work = null;

        if (object instanceof JButton){
            bu_work = (JButton) object;
            if(bu_work.getName() == "btn_abort"){
                frame.dispose();
            }
        }
    }
}