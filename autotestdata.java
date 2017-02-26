package testdata;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.Calendar;
import java.util.Random;
import java.util.*;



public class autotestdata extends JFrame 
{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

  public static void main(String[] args)
  {
	  
      new autotestdata();
      
	  
  }
  JButton file_name = new JButton("File Name:");;	
  JButton col1 = new JButton("How many columns:");;	
  JButton rowl = new JButton("How many rows:");;	
  JButton label2 = new JButton("The file will be in CSV format");	
  JButton label4 = new JButton("Decimal Format => 3.2 for 999.99 and upto 9,999,999,999.99");	
  JButton d_fmt = new JButton("Change the columns format using Excel");
  JButton d_fmt_txt = new JButton("Number/Decimal length 10(2) digits 9,999,999,999 (.99)");
  JButton ok = new JButton("OK - Click to Genarate Data File");
  JButton g1 = new JButton("File is generating");
  
  
  JLabel c1 = new JLabel("Column 01:");
  JLabel c2 = new JLabel("Column 02:");
  JLabel c3 = new JLabel("Column 03:");
  JLabel c4 = new JLabel("Column 04:");
	JLabel c5 = new JLabel("Column 05:");
	JLabel c6 = new JLabel("Column 06:");
	JLabel c7 = new JLabel("Column 07:");
	JLabel c8 = new JLabel("Column 08:");
	JLabel c9 = new JLabel("Column 09:");
	JLabel c10 = new JLabel("Column 10:");
	JLabel c11 = new JLabel("Column 11:");
	JLabel c12 = new JLabel("Column 12:");
	JLabel c13 = new JLabel("Column 13:");
	JLabel c14 = new JLabel("Column 14:");
	JLabel c15 = new JLabel("Column 15:");
	JLabel c16 = new JLabel("Column 16:");
	JLabel c17 = new JLabel("Column 17:");
	JLabel c18 = new JLabel("Column 18:");
	JLabel c19 = new JLabel("Column 19:");
	JLabel c20 = new JLabel("Column 20:");
		
	JTextField jc1 = new JTextField("Name_Column_01");
	JTextField jc2 = new JTextField("Name_Column_02");
	JTextField jc3 = new JTextField("Name_Column_03");
	JTextField jc4 = new JTextField("Name_Column_04");
	JTextField jc5 = new JTextField("Name_Column_05");
	JTextField jc6 = new JTextField("Name_Column_06");
    JTextField jc7 = new JTextField("Name_Column_07");
	JTextField jc8 = new JTextField("Name_Column_08");
	JTextField jc9 = new JTextField("Name_Column_09");
	JTextField jc10 = new JTextField("Name_Column_10");
	JTextField jc11 = new JTextField("Name_Column_11");
	JTextField jc12 = new JTextField("Name_Column_12");
	JTextField jc13 = new JTextField("Name_Column_13");
	JTextField jc14 = new JTextField("Name_Column_14");
	JTextField jc15 = new JTextField("Name_Column_15");
	JTextField jc16 = new JTextField("Name_Column_16");
	JTextField jc17 = new JTextField("Name_Column_17");
	JTextField jc18 = new JTextField("Name_Column_18");
	JTextField jc19 = new JTextField("Name_Column_19");
	JTextField jc20 = new JTextField("Name_Column_20");
	JTextField[] jco = new JTextField[20];
	JButton label3 = new JButton("Maximum rows are 50,000 and columns are 20");	
	
	String filedir = System.getProperty("user.dir");
	String filepath = filedir + "\\test_data_v01.csv";
	    
	JTextField file = new JTextField(filepath);
	
	JTextField label = new JTextField("50");	
	JTextField col1_label = new JTextField("4");	
	
	String[] type = {"Number","Decimal","Date","Character"};
	JComboBox[] cmb = new JComboBox[20];
	JComboBox co2 = new JComboBox(type);
	JComboBox co3 = new JComboBox(type);
	JComboBox co4 = new JComboBox(type);
	JComboBox co5 = new JComboBox(type);
	JComboBox co6 = new JComboBox(type);
	JComboBox co7 = new JComboBox(type);
	JComboBox co8 = new JComboBox(type);
    JComboBox co9 = new JComboBox(type);
	JComboBox co10 = new JComboBox(type);
	JComboBox co11 = new JComboBox(type);
	JComboBox co12 = new JComboBox(type);
	JComboBox co13 = new JComboBox(type);
	JComboBox co14 = new JComboBox(type);
	JComboBox co15 = new JComboBox(type);
	JComboBox co16 = new JComboBox(type);
	JComboBox co17 = new JComboBox(type);
	JComboBox co18 = new JComboBox(type);
	JComboBox co19 = new JComboBox(type);
	JComboBox co20 = new JComboBox(type);
	JPanel panel1 = new JPanel();
    
	String col1_flag = "N";
	String col2_flag = "N";
	String col3_flag = "N";
	String col4_flag = "N";
	GridBagConstraints gc = new GridBagConstraints();
		
		
	    
		
    
public autotestdata()
  {
	this.setTitle("AutoData 1.2 - Automate Test Data - from MAMPSOLUTIONS");
	panel1.setLayout(new GridBagLayout());
    panel1.setSize(1000, 1400);
	
	
	gc.ipadx = 1;
	gc.ipady = 5;
	gc.fill = GridBagConstraints.NONE;
	gc.weightx = .01;
	gc.weighty = .05;
	gc.gridwidth = 1;
	gc.gridheight = 1;
	gc.anchor = GridBagConstraints.NORTHWEST; 
	gc.insets = new Insets(5,5,5,5);
	
	
	
	gc.gridx=0;
	gc.gridy=1;
	panel1.add(c1,gc);
	gc.gridy = 2;
	panel1.add(c2,gc);
	gc.gridy = 3;
	panel1.add(c3,gc);
	gc.gridy = 4;
	panel1.add(c4,gc);
	gc.gridy = 5;
	panel1.add(c5,gc);
	gc.gridy=6;
	panel1.add(c6,gc);
	gc.gridy = 7;
	panel1.add(c7,gc);
	gc.gridy = 8;
	panel1.add(c8,gc);
	gc.gridy = 9;
	panel1.add(c9,gc);
	gc.gridy = 10;
	panel1.add(c10,gc);
	gc.gridy=11;
	panel1.add(c11,gc);
	gc.gridy = 12;
	panel1.add(c12,gc);
	gc.gridy = 13;
	panel1.add(c13,gc);
	gc.gridy = 14;
	panel1.add(c14,gc);
	gc.gridy = 15;
	panel1.add(c15,gc);
	gc.gridy=16;
	panel1.add(c16,gc);
	gc.gridy = 17;
	panel1.add(c17,gc);
	gc.gridy = 18;
	panel1.add(c18,gc);
	gc.gridy = 19;
	panel1.add(c19,gc);
	gc.gridy = 20;
	panel1.add(c20,gc);
	
	gc.weightx = .5;
	gc.weighty = .5;
	gc.ipadx = 150;
	gc.gridx=1;
	gc.gridy=1;
	panel1.add(jc1,gc);
	gc.gridy=2;
	panel1.add(jc2,gc);
	gc.gridy=3;
	panel1.add(jc3,gc);
	gc.gridy=4;
	panel1.add(jc4,gc);
	gc.gridy=5;
	panel1.add(jc5,gc);
	gc.gridy=6;
	panel1.add(jc6,gc);
	gc.gridy=7;
	panel1.add(jc7,gc);
	gc.gridy=8;
	panel1.add(jc8,gc);
	gc.gridy=9;
	panel1.add(jc9,gc);
	gc.gridy=10;
	panel1.add(jc10,gc);
	gc.gridy=11;
	panel1.add(jc11,gc);
	gc.gridy=12;
	panel1.add(jc12,gc);
	gc.gridy=13;
	panel1.add(jc13,gc);
	gc.gridy=14;
	panel1.add(jc14,gc);
	gc.gridy=15;
	panel1.add(jc15,gc);
	gc.gridy=16;
	panel1.add(jc16,gc);
	gc.gridy=17;
	panel1.add(jc17,gc);
	gc.gridy=18;
	panel1.add(jc18,gc);
	gc.gridy=19;
	panel1.add(jc19,gc);
	gc.gridy=20;
	panel1.add(jc20,gc);
	
	gc.weightx = 10;
	gc.weighty = .05;
	gc.ipadx = 80;
	
	gc.gridx=2;
	for(int i=0; i<=19; i++){
        gc.gridy=i+1;
        cmb[i] = new JComboBox(type);
        panel1.add(cmb[i],gc);
    }
	
	gc.weightx = 20;
	gc.weighty = .05;
	
	gc.ipadx = 100;
	
    gc.gridx=3;
	int i=0;
	
	for(i=0; i<=19; i++){
    	gc.gridy=i+1;
    	jco[i] = new JTextField("5");
    	panel1.add(jco[i],gc);
	}	
    
	gc.weightx = 100;
	
	gc.ipadx = 70;
	
	gc.gridx=4;
	gc.gridy=3;
	panel1.add(rowl,gc);
	gc.gridy=1;
	panel1.add(col1,gc);
	gc.gridy=2;
	panel1.add(col1_label,gc);
	
	gc.ipadx = 70;
	gc.gridx=4;
	gc.gridy=4;
	panel1.add(label,gc);
	
	gc.gridx=4;
	gc.gridy=5;
	panel1.add(label3,gc);
	
	
	gc.ipadx = 10;
	gc.gridx=4;
	gc.gridy=6;
	panel1.add(file_name,gc);
	gc.ipadx = 400;
	gc.gridx=4;
	gc.gridy=7;
	
	panel1.add(file,gc);
	
	gc.ipadx = 70;
	
	gc.gridx=4;
	gc.gridy=8;
	panel1.add(label2,gc);
	
	gc.gridx=4;
	gc.gridy=9;
	panel1.add(label4,gc);
	
	gc.gridx=4;
	gc.gridy=10;
	panel1.add(d_fmt,gc);
	
	gc.gridx=4;
	gc.gridy=11;
	panel1.add(d_fmt_txt,gc);
	

	
	
	gc.gridx=4;
	gc.gridy=20;
	ok.setBackground(Color.CYAN);
	panel1.add(ok,gc);
	
	gc.gridx=5;
	gc.gridy=20;
	ok.setBackground(Color.CYAN);
	panel1.add(g1,gc);
	g1.setVisible(false);
	
	this.add(panel1);
    this.pack();
    this.setSize(1000,700);
    this.setVisible(true);
    
   
    ok.addActionListener(new generateFile());
  }
  
	
	
	
public class generateFile implements ActionListener {
   /**
	 * 
	 */
	
	public generateFile() {
		}
    public void actionPerformed(ActionEvent e) {
    	//ok.setText("The File is generating, please wait.");
    	//g1.setVisible(true);
    	JFrame panel7 = new JFrame();
        panel7.setTitle("File is generating");
        panel7.setSize(400, 50);
    	// .setActionCommand("The File is generating, please wait.");
    	File file1 = new File(file.getText());
    	//System.out.println(file1);
    	if (file1.exists() == true)
    	{
    		JFrame panel4 = new JFrame();
	        JOptionPane.showMessageDialog(panel4, "The file already exists.");
	        //panel7.setVisible(false);
	        return;
    	}
    	panel7.setVisible(true);
        panel1.setEnabled(false);
    	
    	try {
			FileWriter fw = new FileWriter(file1);
			BufferedWriter bw = new BufferedWriter(fw);
	    	PrintWriter pw = new PrintWriter(bw);
	    	int num_col = Integer.parseInt(col1_label.getText());
	    	int num_rows = Integer.parseInt(label.getText());
	    	if (num_rows > 50000)
	    		num_rows=50000;
	    	if (num_col > 20)
	    		num_col=20;
	    	//JFrame panel5 = new JFrame();
	        //JOptionPane.showMessageDialog(panel5, "The File is generating, please wait.");
	    	//System.out.println("The File is generating, please wait.");
	    	if (num_col > 20)
	    	  num_col = 20;
	    	
	    	for (int r =0; r<=num_col-1; r++)
	    	{
	    		if (r == 0)
	    		  pw.print(jc1.getText());
	    		else if (r == 1)
	    		  pw.print(jc2.getText());
	    		else if (r == 2)
		    	  pw.print(jc3.getText());
	    		else if (r == 3)
		    	  pw.print(jc4.getText());
		        else if (r == 4)
			      pw.print(jc5.getText());
		    	else if (r == 5)
			      pw.print(jc6.getText());
			    else if (r == 6)
				  pw.print(jc7.getText());
			    else if (r == 7)
				  pw.print(jc8.getText());
				else if (r == 8)
				  pw.print(jc9.getText());
				else if (r == 9)
				  pw.print(jc10.getText());
				else if (r == 10)
				  pw.print(jc11.getText());
				else if (r == 11)
				  pw.print(jc12.getText());
				else if (r == 12)
			   	  pw.print(jc13.getText());
				else if (r == 13)
				  pw.print(jc14.getText());
				else if (r == 14)
			  	  pw.print(jc15.getText());
				else if (r == 15)
				  pw.print(jc16.getText());
				else if (r == 16)
				  pw.print(jc17.getText());
				else if (r == 17)
				  pw.print(jc18.getText());
				else if (r == 18)
			   	  pw.print(jc19.getText());
				else if (r == 19)
			   	  pw.print(jc20.getText());
	    	    if (r < num_col)	
	    		  pw.print(",");
	    	}
	    	pw.print("\n");
	    	pw.flush();
	    	Random ran = new Random();
    		String temp="1";
	    	for (int r =0; r<=num_rows-1; r++)
	    	{
	    		for (int k =0; k<=num_col-1; k++)
	    	    {
		    		if ((cmb[k].getSelectedItem()=="Number"))
		    		{
		    		   long column = Integer.parseInt(jco[k].getText());
		    		   for (int ll=0; ll<=column -2; ll++)
		    		   temp = temp+0;
		    		   //System.out.println(temp);
		    		   column = Integer.parseInt(temp);
		    		   long i1 = Math.abs((ran.nextInt(6)+1)*column+k);
		    		   temp="1";
		    		   
		    		   //System.out.print("column:");
		    		   //System.out.print(column);
		    		   //System.out.print(" k:");
		    		   //System.out.print(k);
		    		   //System.out.print(" i1:");
		    		   //System.out.print(i1);
		    		   //System.out.print(" random:");
		    		   //System.out.println(Math.abs((ran.nextInt(6)+1)));
		    		   //System.out.println(column);
		    		   pw.print(i1);
		    		}
		    		else if ((cmb[k].getSelectedItem()=="Decimal"))
		    		{
		    		   double column = Integer.parseInt(jco[k].getText());
		    		   for (int ll=0; ll<=column -2; ll++)
			    		    temp = temp+0;
		    		   column = Integer.parseInt(temp);
			    	   double i1 = Math.abs((ran.nextInt(6)+1)*(column+0.01)+k);
			    	   temp="1";
		    		   pw.print(i1);
		    		}
		    		else if ((cmb[k].getSelectedItem()=="Date"))
		    		{
		    		   Calendar cal = Calendar.getInstance();
		    		   Date date = (Date) cal.getTime();
			    	   String d1 = date.toLocaleString();
			    	   pw.print(d1);
		    		}
		    		else if ((cmb[k].getSelectedItem()=="Character"))
		    		{
		    		   String s1="A";
		    		   int column = Integer.parseInt(jco[k].getText());
		    		   if (column > 200)
		    		      column = 200;
		 	    	   for (int s=0; s<=column-2; s++)
		 		       s1 = s1+ran.nextInt(6);
		 	    	   pw.print(s1);
		    		}
		    		pw.print(",");
 	    	   }
		       pw.print("\n");
		       pw.flush();
	    	}
	    	pw.close();
    	
		} catch (Exception e1) {
			JFrame panel3 = new JFrame();
	        JOptionPane.showMessageDialog(panel3, e1.toString());
	        panel7.setVisible(false);
	        ok.setText("OK - Click to Genarate Data File");
	        return;
	        }
    	
    	
    	
    	
    	
    	
    	/*
    	try{
    	Thread.sleep(10000);
    	}
    	catch(Exception e1)
    	{};
    	*/
    	
        JFrame panel2 = new JFrame();
        JOptionPane.showMessageDialog(panel2, "The File is generated.");
        panel7.setVisible(false);
        ok.setText("OK - Click to Genarate Data File");
        panel1.setEnabled(true);
    	
    }

}
}
