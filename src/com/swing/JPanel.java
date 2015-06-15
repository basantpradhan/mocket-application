package com.swing;

import java.awt.Dimension;
import java.awt.Image;

public class JPanel extends javax.swing.JPanel  {

	private Image img ;
	
	
	public JPanel (Image img){
		
		this.img = img;
		Dimension size = new Dimension(img.getWidth(null),
						   img.getHeight(null));
		setSize(size);
		setPreferredSize(size);
		setMinimumSize(size);
		setMaximumSize(size);
		setLayout(null);

	}
	
	
	public static void main(String args []){
		
	}
}
