package GUI;

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
	private JSlider hammNum = new JSlider(0, 4);
	private JTextField num;
	public SliderPanel()
	{
		hammNum.setSize(200, 50);
		num = new JTextField(hammNum.getValue());
		
		//Add the components to the panel
		add(num);
		add(hammNum);
		add(hamming);
	}
	
}
