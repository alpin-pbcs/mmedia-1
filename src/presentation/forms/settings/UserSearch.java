package presentation.forms.settings;

import presentation.events.SettingsEvent;
import presentation.events.WindowEvent;

import javax.swing.*;
import java.awt.*;

public class UserSearch {
    private JButton btn_abort;
    private JButton btn_addUser;
    private JButton btn_editUser;
    private JButton btn_delUser;
    private JButton btn_search;
    private JButton btn_reset;
    public JTextField tf_search;
    public JList list_user;
    private JPanel pan_usersearch;

    private WindowEvent windowevent = null;
    private SettingsEvent settingevent = null;

    public UserSearch() {
        JFrame frame = new JFrame("Benutzerverwaltung");
        windowevent = new WindowEvent(frame);
        settingevent = new SettingsEvent(frame);

        this.setButtons();

        frame.setContentPane(pan_usersearch);
        frame.pack();
        frame.setVisible(true);
    }

    private void setButtons() {
        btn_abort.addActionListener(windowevent);
        btn_abort.setName("btn_abort");

        btn_addUser.addActionListener(settingevent);
        btn_addUser.setName("btn_addUser");

        btn_editUser.addActionListener(settingevent);
        btn_editUser.setName("btn_editUser");

        btn_delUser.addActionListener(settingevent);
        btn_delUser.setName("btn_delUser");

        btn_search.addActionListener(settingevent);
        btn_search.setName("btn_searchUser");

        btn_reset.addActionListener(settingevent);
        btn_reset.setName("btn_resetUserList");
    }
}
