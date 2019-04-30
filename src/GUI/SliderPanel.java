package GUI;

import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
/*
 * 
 */
public class SliderPanel extends JPanel
{
	private JLabel hamming = new JLabel("Enter Hamming Dist:");
	private JSlider hammNum = new JSlider(1, 4);
	private JTextField num;
	
	int val;
	public SliderPanel()
	{
		hammNum.setSize(200, 50);
		hammNum.setMajorTickSpacing(10);
		hammNum.setMinorTickSpacing(1);
		hammNum.setPaintTicks(true);
		hammNum.setPaintLabels(true);
		
		val = hammNum.getValue();
		num = new JTextField( val + "");
	
		
		//Add the components to the panel
		add(hamming);
		add(num);
		add(hammNum);
	}
	/**
	public void getCurrentSlide()
	{
		int val;
		while(hammNum.getValueIsAdjusting())
		{
			if(hammNum.getValue() == 1)
			{
				val = 1;
				num.setText(val + "");
			}
			else if (hammNum.getValue() == 2)
			{
				val = 2;
				num.setText(val + "");
			}
			else if (hammNum.getValue() == 3)
			{
				val = 3;
				num.setText(val + "");
			}
			else if (hammNum.getValue() == 4)
			{
				val = 4;
				num.setText(val + "");
			}
			else
			{
				val = 0;
				num.setText(val + "");
			}
		}
		
	}
	**/
	
}
