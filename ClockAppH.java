import javax.swing.JComponent;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

import java.util.GregorianCalendar;
import java.util.Calendar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import javax.swing.JFrame;

public class ClockAppH extends JComponent
{
	public ClockAppH()
	{
	secondHandVisible = true; // show 2nd hand
	minuteHandVisible = true;
	hourHandVisible = true;
	start();
	}
	
	// MAIN/DRIVER CLASS
	public static void main(String[] args)
	{
	ClockAppH clock = new ClockAppH();
	
	JFrame frame = new ClockMenuFrameH(clock);
	
	frame.getContentPane().add(clock);
	frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	}
	
	public void showSecondHand()
	{
	secondHandVisible = true;
	repaint();
	}
	
	public void hideSecondHand()
	{
	secondHandVisible = false;
	repaint();
	}
	
	public void showMinuteHand()
	{
	minuteHandVisible = true;
	repaint();
	}
	
	public void hideMinuteHand()
	{
	minuteHandVisible = false;
	repaint();
	}
	
	public void showHourHand()
	{
	hourHandVisible = true;
	repaint();
	}
	
	public void hideHourHand()
	{
	hourHandVisible = false;
	repaint();
	}
	
	public void paintComponent(Graphics g)
	{
	Graphics2D g2 = (Graphics2D)g;
	
	g2.setColor(Color.black);
	
	Ellipse2D.Double circle = new Ellipse2D.Double(TOP,LEFT,BOTTOM,RIGHT);
	
	g2.draw(circle);
	
	Point2D.Double center = new Point2D.Double((RIGHT + LEFT + LEFT)/2, (BOTTOM + TOP + TOP));
	
	int minutes = 0;
	
	//get time of day
	
	GregorianCalendar currentTime = new GregorianCalendar();
	
	int seconds = currentTime.get(Calendar.SECOND);
	
	minutes = currentTime.get(Calendar.MINUTE);
	
	int hours = currentTime.get(Calendar.HOUR);
	
	double percent_of_60secs = seconds / 60.0;
	
	double x = Math.cos(TWO_PI * percent_of_60secs - HALF_PI) * SECOND_HAND_RADIUS + HOFFSET;     

	double y = Math.sin(TWO_PI * percent_of_60secs - HALF_PI) * SECOND_HAND_RADIUS + VOFFSET;
	
	// make points for minute and hour hand
	double xMinute = Math.cos(TWO_PI *(minutes/MINS_PER_HOUR) - HALF_PI) * MINUTE_HAND_RADIUS + HOFFSET;
	
	double yMinute = Math.cos(TWO_PI *(minutes/MINS_PER_HOUR) - HALF_PI) * MINUTE_HAND_RADIUS + VOFFSET;
	
	//copied the hours and percent hours from solution
	double new_hours = hours % 12;
	
	new_hours = new_hours + minutes/MINS_PER_HOUR;
	
	double percent_of_12hours = new_hours/12;
	
	double xHour = Math.cos(TWO_PI * percent_of_12hours - HALF_PI) * HOUR_HAND_RADIUS + HOFFSET;
	
	double yHour = Math.cos(TWO_PI * percent_of_12hours - HALF_PI) * HOUR_HAND_RADIUS + VOFFSET;
	
	Point2D.Double p1 = new Point2D.Double(x,y); // create p1 
	
	Point2D.Double p2 = new Point2D.Double(xMinute,yMinute); // create p2
	
	Point2D.Double p3 = new Point2D.Double(xHour,yHour); // create p3
	
	Line2D.Double secondHand = new Line2D.Double(p1,center);
	Line2D.Double minuteHand = new Line2D.Double(p2,center);
	Line2D.Double hourHand = new Line2D.Double(p3,center);
	
	if(secondHandVisible)
		g2.draw(secondHand);
	
	if(minuteHandVisible)
		g2.draw(minuteHand);
	
	if(hourHandVisible)
		g2.draw(hourHand);
		
	
	}
	
	//Create timer to generate an event (call repaint()) once per second
	
	public void start()
	{
		class EventTimer implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				repaint();
			}
		}
	EventTimer listener = new EventTimer();
	
	Timer t = new Timer(1000, listener); // 1000 is the # mili seconds to wait
	t.start();
	}
	
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 300;
	
	public static final int TOP = 10;
	public static final int LEFT = 10;
	public static final int BOTTOM = 100;
	public static final int RIGHT = 100;
	
	public static final int HOFFSET = (RIGHT + LEFT + LEFT)/2;
	public static final int VOFFSET = (BOTTOM + TOP + TOP)/2;
	
	public static final double TOTAL_PERCENT = 100;
	public static final double RADIUS = 20;
	public static final double TWO_PI = 2.0 * Math.PI;
	
	public static final int MINUTE_HAND_RADIUS = 35;
	public static final int HOUR_HAND_RADIUS = 22;
	public static final int SECOND_HAND_RADIUS = 40;
	
	public static final double HALF_PI = Math.PI/2;
	public static final double MINS_PER_HOUR = 60;
	
private boolean secondHandVisible;
private boolean minuteHandVisible;
private boolean hourHandVisible;
}


	
	
			
	
	