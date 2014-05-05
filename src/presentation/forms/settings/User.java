package presentation.forms.settings;

import presentation.events.SettingsEvent;
import presentation.events.WindowEvent;

import javax.swing.*;

public class User {
    private JButton btn_save;
    private JButton btn_abort;
    public JTextField tf_username;
    public JTextField tf_passwd;
    public JTextField tf_email;
    public JCheckBox cb_admin;
    private JPanel pan_user;

    private WindowEvent windowevent = null;
    private SettingsEvent settingevent = null;

    public User() {
        JFrame frame = new JFrame("Registrierung");
        windowevent = new WindowEvent(frame);
        settingevent = new SettingsEvent(frame);

        this.setButtons();

        frame.setContentPane(pan_user);
        frame.pack();
        frame.setVisible(true);
    }

    private void setButtons() {
        btn_abort.addActionListener(windowevent);
        btn_abort.setName("btn_abort");

        btn_save.addActionListener(settingevent);
        btn_save.setName("btn_saveUser");
    }
}
