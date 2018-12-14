package com.sample;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class WindowGUI {
	public static JFrame okno;
	
	public static String wyswietl(List<String>poss,String pytanie)
	{
		Object[]possible=poss.toArray();
		String selectedValue = (String)JOptionPane.showInputDialog(okno,
            	pytanie,"Electronic music",
            	JOptionPane.INFORMATION_MESSAGE, null,
            	possible, possible);
			return selectedValue;
	}
	
	public static void koniec(String wybor)
	{
		JOptionPane.showMessageDialog(okno, "Your choice: "+wybor);
	}
}
