package jtest;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DMWindows extends JFrame {

	public void popWindow() {
		// TODO Auto-generated method stub
	      JFrame f = new JFrame("A JFrame");
	      JButton buttGo = new JButton("Go");
	      JButton buttEx = new JButton("Exit");
	      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      f.setSize(250, 250);
	      f.setLocation(300,200);
	      f.setLayout(new FlowLayout());
	      //f.getContentPane().add(BorderLayout.CENTER, new JTextArea(10, 40));
	      f.add(buttGo);
	      f.add(buttEx);
	      f.add(new JTextArea(10, 40));
	      f.add(new JButton("Done"));
	      f.setVisible(true);
	}

}
