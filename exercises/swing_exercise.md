## Swing Exercise

Your mission, should you choose to accept it, is to create a Tic-Tac-Toe game!

### Instructions

1. First, create a new frame.  A frame is what most people think of as a window (this is actually an old term - Emacs, for example, calls a window a "frame").  Creating a JFrame will create a new window.  You can set its size, default closing behavior, etc.  Frames are constructed like so:

```java
    JFrame _frame = new JFrame("Tic-Tac-Toe");
```

You will note that this is called a JFrame, and not a Frame.  Frames are AWT (Abstract Window Toolkit) classes; JFrames are Swing classes.  Swing is a GUI framework built on top of AWT (which is much nicer, trust me).  You will find that most classes that start with J have an equivalent J-less class in AWT.

2. You can set the size of the frame by using the `setSize(width, height)` method on the frame.  `width` and `height` are specified in pixels.  The size of the frame is up to you.  Figure out what works best on your screen.

3. Now, we want to have two sections of the frame.  Each of these sections is called a panel, and like good Swing classes, are called JPanels.  Create them liek so:

```

	JPanel ttt = 

	// This will place the tic-tac-toe panel at the top of
	// the frame and the newPanel panel at the bottom
	window.add(ttt, BorderLayout.NORTH);
	window.add(newPanel, BorderLayout.SOUTH);

```

4. The top panel is going to be a grid layout (that is, it will have all of its elements in a two-dimensional grid, just like a Tic-Tac-Toe board).  Each spot in the grid will be a button.  The bottom panel is only going to have one button in it, so it doesn't really matter what layout we use.

5. Create nine buttons to put in the 3x3 layout and add them.

6. Create one button for the other part of the layout.

7. Add listeners to the tic-tac-toe grid buttons.  A listener listens for an event to occur (e.g., a button being pressed) and then executes some code.  

8. We will now display

8. Using the previous steps as a base, create the listener for the "new game" button.  It should "erase" all of the buttons, putting them back to their default text when pressed.

9. Using the previous steps as a base, create a boolean variable which flip-flops every time somebody presses a button.  The first time a button is pressed, the player should be an X, the second time an O, the third time an X, etc.  You can determine whether to make the spot an X or O based on this flip-flop variable.

10. Finally, add code to ensure that users cannot press a button which is already an X or an O.

### Additional Information

Feel free to take a look at the sample code for these classes to help put the system together:

1. Frames - https://github.com/laboon/cs0401/blob/master/sample_code/FrameDemo.java
1. Panels - https://github.com/laboon/cs0401/blob/master/sample_code/PanelDemo.java and https://github.com/laboon/cs0401/blob/master/sample_code/PanelDemo2.java
2. Extending Panels - https://github.com/laboon/cs0401/tree/master/sample_code/extended_jpanel
3. Creating and Interacting with Buttons - https://github.com/laboon/cs0401/blob/master/sample_code/ButtonDemo.java
4. Creating a Grid Layout - https://github.com/laboon/cs0401/blob/master/sample_code/GridDemo.java
5. Dynamically Changing A Button - https://github.com/laboon/cs0401/blob/master/sample_code/NameChangeButtonDemo.java

Remember that part of being a software engineer is knowing how to look things up on your own!  If you don't understand how something works, feel free to look at the Java API pages (http://docs.oracle.com/javase/8/docs/api/).  

For fun, you can add code to detect when a player has won or lost.  For even more fun, add some artificial intelligence and have the computer play the user!  However, neither of these is necessary.

Working code will be put up on GitHub in this directory sometime after class today.