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
import javax.swing.JSlider;
import javax.swing.JTextField;

public class HammingFrame extends JFrame
{
	//Private class constants 
	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 700;
	


	

	public HammingFrame()
	{
		super("Hamming Distance");
		this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		this.setLayout(new GridLayout(1,1));
		add(new SliderPanel());
		
		
		//Needed don't touch
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
       
	}
	

	//Create A JPanel to add all components 
	
	public static void main (String [] args)
	{
		new HammingFrame();
	}
	
	
}
