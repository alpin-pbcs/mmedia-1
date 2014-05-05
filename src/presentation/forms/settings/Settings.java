package presentation.forms.settings;

import presentation.events.WindowEvent;
import presentation.events.SettingsEvent;

import javax.swing.*;

public class Settings {
    private JButton btn_abort;
    private JButton btn_save;
    private JButton btn_user;
    public JComboBox cb_dbsystem;
    private JPanel pan_settings;

    private WindowEvent windowevent = null;
    private SettingsEvent settingevent = null;

    public Settings() {
        JFrame frame = new JFrame("Einstellungen");
        windowevent = new WindowEvent(frame);
        settingevent = new SettingsEvent(frame);

        this.setButtons();

        frame.setContentPane(pan_settings);
        frame.pack();
        frame.setVisible(true);
    }

    private void setButtons() {
        btn_abort.addActionListener(windowevent);
        btn_abort.setName("btn_abort");

        btn_save.addActionListener(settingevent);
        btn_save.setName("btn_save");

        btn_user.addActionListener(settingevent);
        btn_user.setName("btn_user");
    }
}
