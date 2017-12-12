import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Startseite {

	private JFrame StartseiteFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Startseite window = new Startseite();
					window.StartseiteFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Startseite() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		StartseiteFrame = new JFrame();
		StartseiteFrame.setBounds(100, 100, 823, 513);
		StartseiteFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		StartseiteFrame.getContentPane().setLayout(null);
		
		JButton btnPersonErfassen = new JButton("Person erfassen");
		btnPersonErfassen.setBounds(35, 118, 165, 51);
		StartseiteFrame.getContentPane().add(btnPersonErfassen);
	}
}
