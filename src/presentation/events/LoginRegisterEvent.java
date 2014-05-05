package presentation.events;

import presentation.forms.start.*;
import presentation.forms.register.*;

import javax.swing.*;
import java.awt.event.*;

public class LoginRegisterEvent extends WindowAdapter implements ActionListener{
    JFrame frame = null;

    public LoginRegisterEvent(JFrame frame) {
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent e) {
        Object object = e.getSource();
        JButton bu_work = null;

        if (object instanceof JButton){
            bu_work = (JButton) object;
            if(bu_work.getName() == "btn_login") {
                new Start();
                frame.dispose();
            } else if(bu_work.getName() == "btn_register") {
                new Register();
            }  else if(bu_work.getName() == "btn_saveRegister") {

            }
        }
    }
}
