import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ClockMenuFrameH extends JFrame
{
	public ClockMenuFrameH(ClockAppH clockRef)
	{
	// construct menu
	
	JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
	menuBar.add(createFileMenu());
	menuBar.add(createShowMenu());
	setSize(FRAME_WIDTH, FRAME_HEIGHT);
	
	clock = clockRef;
	}
	
	//creates file menu
	public JMenu createFileMenu()
	{
	JMenu menu = new JMenu("FILE");
	menu.add(createFileExitItem());
	return menu;
	}
	
	// creates the file exit menu item
	
	public JMenuItem createFileExitItem()   
	{    
		JMenuItem item = new JMenuItem("Exit");
			
			class MenuItemListener implements ActionListener
			{
				public void actionPerformed(ActionEvent event)
				{
					System.exit(0);
				}
			}
		ActionListener listener = new MenuItemListener();
		item.addActionListener(listener);
		return item;
	}
	
	public JMenu createShowMenu()
	{
		JMenu menu = new JMenu("Show");
		menu.add(createSecondHandItemOn());
		menu.add(createSecondHandItemOff());
		menu.add(createMinuteHandItemOn());
		menu.add(createMinuteHandItemOff());
		menu.add(createHourHandItemOn());
		menu.add(createHourHandItemOff());
		
		return menu;
	}
	
	// creates file-second hand menu
	public JMenuItem createSecondHandItemOn()
	{
	JMenuItem item = new JMenuItem("Second Hand On");
	
		class MenuItemListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				clock.showSecondHand();
			}
		}
	ActionListener listener = new MenuItemListener();
	item.addActionListener(listener);
	return item;
	}
		
			
	//creates second hand item and sets listener
	
	public JMenuItem createSecondHandItemOff()
	{
	JMenuItem item = new JMenuItem("Second Hand Off");
	
		class MenuItemListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
			clock.hideSecondHand();
			}
		}
	ActionListener listener = new MenuItemListener();
	item.addActionListener(listener);
	return item;
	}
	
	// create minute-hand menu
	public JMenuItem createMinuteHandItemOn()
	{
	JMenuItem item = new JMenuItem("Minute Hand On");
	
		class MenuItemListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				clock.showMinuteHand();
			}
		}
	ActionListener listener = new MenuItemListener();
	item.addActionListener(listener);
	return item;
	}
	
	//creates minute hand item and set listener
	public JMenuItem createMinuteHandItemOff()
	{
	JMenuItem item = new JMenuItem("Minute Hand Off");
		
		class MenuItemListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
			clock.hideMinuteHand();
			}
		}
	ActionListener listener = new MenuItemListener();
	item.addActionListener(listener);
	return item;
	}
	
	// create Hour-hand menu
	public JMenuItem createHourHandItemOn()
	{
	JMenuItem item = new JMenuItem("Hour Hand On");
	
		class MenuItemListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				clock.showHourHand();
			}
		}
	ActionListener listener = new MenuItemListener();
	item.addActionListener(listener);
	return item;
	}
	
	//creates Hour hand item and set listener
	public JMenuItem createHourHandItemOff()
	{
	JMenuItem item = new JMenuItem("Hour Hand Off");
		
		class MenuItemListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
			clock.hideHourHand();
			}
		}
	ActionListener listener = new MenuItemListener();
	item.addActionListener(listener);
	return item;
	}
	
	
	
	
	private ClockAppH clock;
	
	private static final int FRAME_WIDTH = 200;
	private static final int FRAME_HEIGHT = 200;
	}
	
	
		