package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class HammingFrame extends JFrame
{
	//Private class constants 
	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 700;
	public class HammingPanel extends JPanel
	{
		
	}
	
	public HammingFrame()
	{
		super("HammingFrame");
	}
	
	public static void main (String [] args)
	{
		new HammingFrame();
	}
	
	
}
