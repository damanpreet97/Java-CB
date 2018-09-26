package aug5;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;

public class TypingTutor extends JFrame implements ActionListener, KeyListener {

	private JLabel lblTimer;
	private JLabel lblScore;
	private JLabel lblWord;
	private JTextField txtWord;
	private JButton btnStart;
	private JButton btnStop;

	private boolean running = false;
	private Timer clockTimer = null;
	private Timer wordTimer = null;
	private int timeRemaining = 50;
	private int score = 0;

	private String[] words = null;

	public TypingTutor(String[] args) {
		words = args;
		GridLayout layout = new GridLayout(3, 2);
		super.setLayout(layout);

		Font font = new Font("Comic Sans MS", 1, 100);

		lblTimer = new JLabel("Time");
		lblTimer.setFont(font);
		super.add(lblTimer);

		lblScore = new JLabel("Score");
		lblScore.setFont(font);
		super.add(lblScore);

		lblWord = new JLabel("");
		lblWord.setFont(font);
		super.add(lblWord);

		txtWord = new JTextField("");
		txtWord.setFont(font);
		txtWord.addKeyListener(this);
		super.add(txtWord);

		btnStart = new JButton("Start");
		btnStart.setFont(font);
		super.add(btnStart);

		btnStop = new JButton("Stop");
		btnStop.setFont(font);
		super.add(btnStop);

		btnStart.addActionListener(this);
		btnStop.addActionListener(this);
		super.setTitle("Typing Tutor");
		super.setExtendedState(MAXIMIZED_BOTH);// sets size of the game window
												// to max
		// super.setSize(500,500); //sets size of game window of our own choice
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		super.setVisible(true);

		setupthegame();

	}

	private void setupthegame() {
		timeRemaining = 50;
		running = false;
		score = 0;
		clockTimer = new Timer(1000, this);
		clockTimer.setInitialDelay(0);

		wordTimer = new Timer(3000, this);
		wordTimer.setInitialDelay(0);

		lblScore.setText("Score: " + score);
		lblWord.setText("");
		lblTimer.setText("Time: " + timeRemaining);
		btnStart.setText("Start");
		btnStop.setText("Stop");

		txtWord.setEnabled(false);
		btnStop.setEnabled(false);

	}

	@Override
	public synchronized void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnStart) {
			handleStart();
		} else if (e.getSource() == btnStop) {
			handleStop();
		} else if (e.getSource() == clockTimer) {
			handleClockTimer();
		} else if (e.getSource() == wordTimer) {
			handleWordTimer();
		}
	}

	private void handleWordTimer() {
		String written = txtWord.getText();
		String expected = lblWord.getText();

		if (expected.length() > 0 && expected.equals(written)) {
			score++;
		}
		lblScore.setText("Score: " + score);
		int randomIdx = (int) (Math.random() * words.length); // Math.random()
																// gives a
																// random no.
																// between 0 & 1
																// (1 is
																// exclusive)

		lblWord.setText(words[randomIdx]);

		txtWord.setText("");

	}

	private void handleClockTimer() {

		timeRemaining--;

		lblTimer.setText("Time: " + timeRemaining);

		if (timeRemaining == 0) {
			handleStop();
		}
	}

	private void handleStart() {
		if (running) {
			running = false;
			clockTimer.stop();
			wordTimer.stop();
			btnStart.setText("Start");

			txtWord.setEnabled(false);
			btnStop.setEnabled(false);

		} else {
			running = true;
			clockTimer.start();
			wordTimer.start();
			btnStart.setText("Pause");

			txtWord.setEnabled(true);
			btnStop.setEnabled(true);

			txtWord.setFocusCycleRoot(true);
			super.nextFocus();
		}
	}

	private void handleStop() {
		clockTimer.stop();
		wordTimer.stop();
		int choice = JOptionPane.showConfirmDialog(this, "Replay?");
		if (choice == JOptionPane.YES_OPTION) {
			setupthegame();
		} else if (choice == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(this, "Final Score is " + score);
			super.dispose();
		} else if (choice == JOptionPane.CANCEL_OPTION) {
			if (timeRemaining == 0) {
				setupthegame();
			} else {
				clockTimer.start();
				wordTimer.start();
			}
		}

	}

	@Override
	public void keyPressed(KeyEvent arg0) {
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		String written = txtWord.getText();
		String expected = lblWord.getText();

		if (expected.length() > 0 && expected.equals(written)) {
			score++;

			lblScore.setText("Score: " + score);
			int randomIdx = (int) (Math.random() * words.length);

			lblWord.setText(words[randomIdx]);

			txtWord.setText("");
			wordTimer.restart();
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {

	}
}
