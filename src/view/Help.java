package view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class Help extends JInternalFrame {
	private JPanel panel = new JPanel();
	public Help() {
		super("Information on shortcuts", false, false, false, false);
		this.setSize(200, 120);
		this.setLocation(220, 100);
		this.setContentPane(init());
		show();
	}
	private JPanel init() {
		
		panel.setBorder(new EmptyBorder(10, 10, 0, 5));
		panel.setLayout(new GridLayout(2, 2));

		panel.add(new JLabel("Quit"));
		panel.add(new JLabel("Ctrl + Q"));
		panel.add(new JLabel(""));
		panel.add(new JButton("Close"));
		
		((JLabel) panel.getComponent(1)).setHorizontalAlignment(SwingConstants.CENTER);
		
		return panel;
	}
}
