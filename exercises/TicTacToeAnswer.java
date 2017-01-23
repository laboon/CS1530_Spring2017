import java.awt.*;
import java.awt.event.*; 
import javax.swing.*;

public class TicTacToeAnswer {
    
    JFrame _frame = new JFrame("Tic-Tac-Toe");
    JPanel _ttt = new JPanel();
    JPanel _newPanel = new JPanel();
    JButton[] _buttons = new JButton[9];
    JButton _newButton = new JButton("New Game");
    
    boolean _xTurn = true;
    
    public TicTacToeAnswer() {
	_frame.setSize(400, 400);
	_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	_ttt.setLayout(new GridLayout(3, 3));
	_newPanel.setLayout(new FlowLayout());

	// This will place the tic-tac-toe panel at the top of
	// the frame and the newPanel panel at the bottom
	_frame.add(_ttt, BorderLayout.NORTH);
	_frame.add(_newPanel, BorderLayout.SOUTH);

	// Add nine buttons for the Tic-Tac-Toe game itself
	for (int j=0; j<9; j++) {
	    // Make a new button in the array location with text "_"
	    _buttons[j] = new JButton("_");
	    // Associate a new ButtonListener to the button (see below)
	    ActionListener buttonListener = new ButtonListener();
	    _buttons[j].addActionListener(buttonListener);
	    // Set the font on the button
	    _buttons[j].setFont(new Font("Courier", Font.PLAIN, 48));
	    // Add this button to the _ttt panel
	    _ttt.add(_buttons[j]);
	}

	// Associate a NewGameListener with the new button and add it
	// to the newPanel

	_newButton.addActionListener(new NewGameListener());
	_newPanel.add(_newButton);
	
	_frame.setVisible(true);

    }
    
    public static void main(String[] args) {
	new TicTacToeAnswer();
    }

    class ButtonListener implements ActionListener {

	// Every time we click the button, it will perform
	// the following action.

	public void actionPerformed(ActionEvent e) {

	    // Figure out where the click came from.  source will
	    // contain a reference to the clicked button.
	    // Note e.getSource() will return an object, but we know
	    // that it will be a JButton so we cast it.
	    JButton source = (JButton) e.getSource();
	    String currentText = source.getText();
	    if (currentText.equals("_")) {
		// Button has not yet been selected, change it
		// to X or O and then it is the other player's turn
		if (_xTurn) {
		    source.setText("X");
		} else {
		    source.setText("O");
		}
		// flip-flop the boolean
		_xTurn = !_xTurn;
	    } else {
		// Can't click here, already selected!
		// Do nothing
	    }
		
	}
    
    }

    // This listener will be called when the new game button is clicked
    class NewGameListener implements ActionListener {
	
	public void actionPerformed(ActionEvent e) {
	    // Change all of the buttons to "_", unselected
	    // Restart user to be "X" player
	    for (JButton btn : _buttons) {
		_xTurn = true;
		btn.setText("_");
	    }
		
	}
    
    }

    
}
