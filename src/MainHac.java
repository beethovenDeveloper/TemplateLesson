import java.awt.Color;
import java.awt.Container;
import java.awt.event.*;
import java.util.StringTokenizer;

import javax.swing.*;

import com.beethoven.pattern.AbstractFactory;
import com.beethoven.pattern.Adapter;
import com.beethoven.pattern.Decorator;
import com.beethoven.pattern.Delegate;
import com.beethoven.pattern.Fasad;
import com.beethoven.pattern.MethodFactory;
import com.beethoven.pattern.Strateges;
import com.beethoven.pattern.TemplateMethod;

public class MainHac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         MFrame frame=new MFrame();
         frame.show();
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MFrame extends JFrame
{
	public MFrame()
	{
		setSize(500,500);
		MPanel panel=new MPanel();
		Container cont=getContentPane();
		cont.add(panel);
	}
}

class MPanel extends JPanel
{
	JTextArea area;
	public MPanel() {
		// TODO Auto-generated constructor stub
		
		Act a=new Act();
		JButton button1=new JButton("Factory method");
		button1.addActionListener(a);
		add(button1);
		
		JButton button2=new JButton("Abstract factory");
		button2.addActionListener(a);
		add(button2);

		JButton button3=new JButton("Template method");
		button3.addActionListener(a);
		add(button3);
		
		JButton button4=new JButton("Stratege");
		button4.addActionListener(a);
		add(button4);
		
		JButton button5=new JButton("Decorator");
		button5.addActionListener(a);
		add(button5);
		
		JButton button6=new JButton("Adapter");
		button6.addActionListener(a);
		add(button6);
		
		JButton button7=new JButton("Fasad");
		button7.addActionListener(a);
		add(button7);
		
		JButton button8=new JButton("Delegate");
		button8.addActionListener(a);
		add(button8);
		
		area=new JTextArea("text object",20,30);
		JScrollPane scroll=new JScrollPane(area);
		add(scroll);
	}
	
	class Act implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			String c=e.paramString();
			StringTokenizer token=new StringTokenizer(c,",");
		    token.nextToken();
		    String t1=token.nextToken();
		    String c1=t1.substring(4);
		    if(c1.equals("Factory method"))
		    {
		    	area.setText(MethodFactory.createMethodFactory());
		    }
		    
		    else if(c1.equals("Abstract factory"))
		    {
		    	area.setText(""+AbstractFactory.createAbstractFactory());
		    }
		    
		    else if(c1.equals("Template method"))
		    {
		    	area.setText(""+TemplateMethod.createTemplateMethod());
		    }
		    else if(c1.equals("Stratege"))
		    {
		    	area.setText(""+Strateges.createStrateges());
		    }
		    else if(c1.equals("Decorator"))
		    {
		    	area.setText(""+Decorator.createDecorator());
		    }
		    else if (c1.equals("Adapter")) {
				area.setText(""+Adapter.createAdapter());
			}
		    else if (c1.equals("Fasad")) {
				area.setText(""+Fasad.createFasad());
			}
		    else if (c1.equals("Delegate")) {
				area.setText(""+Delegate.createDelegate());
			}
		}
	}
}

