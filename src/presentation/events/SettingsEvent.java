package presentation.events;

import presentation.forms.settings.*;

import javax.swing.*;
import java.awt.event.*;

public class SettingsEvent extends WindowAdapter implements ActionListener{
    JFrame frame = null;

    public SettingsEvent(JFrame frame) {
        this.frame = frame;
    }

    public void actionPerformed(ActionEvent e) {
        Object object = e.getSource();
        JButton bu_work = null;

        if (object instanceof JButton){
            bu_work = (JButton) object;
            if(bu_work.getName() == "btn_save") {
                frame.dispose();
            } else if(bu_work.getName() == "btn_user") {
                new UserSearch();
            } else if(bu_work.getName() == "btn_saveUser") {
                frame.dispose();
            } else if(bu_work.getName() == "btn_addUser") {
                new User();
            } else if(bu_work.getName() == "btn_editUser") {
                new User();
            } else if(bu_work.getName() == "btn_delUser") {

            } else if(bu_work.getName() == "btn_searchUser") {

            } else if(bu_work.getName() == "btn_resetUserList") {

            }
        }
    }
}
