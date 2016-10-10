import java.util.Scanner;

public class TocEntry
{
	private String chapter;
	private int page; 
	
	public TocEntry(string s, int i)
	{
		chapter = s;
		page = i;
	}
	
	public String getChapter()
	{
		return chapter;
	}
	
	public int getPage()
	{
		return page;
	}
	
	public void setChapter(String title)
	{
		chapter = title;
	}
	
	public void setPage(int numPage)
	{
		page = numPage;
	}
	
	public void toString(int line_length)
	{
		System.out.print(ch);
		for(int i = 0; i < line_length-(ch+chapter_length); i++)
			System.out.print(".");
		System.out.print(page_number);
	}
	
	public final int TOCSIZE = 100;// given

	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		 TocEntry toc[] = new TocEntry[TOCSIZE];//given
		 int toc_curlen = 0; //given
	
		String sentinel = "****", chapter_length = "";
		
	
		
		int LineLength = 30;
		do
		{
			System.out.print("Enter chapter title: ");
			String ch = input.nextLine();
			
			System.out.print("Enter starting page number: ");
			int page_number = input.nextInt();
			
			chapter_length = Integer.toString(page_number);
			
			toString(LineLength);
			
			
		}while(answer != sentinel);
		
	}
}
	
	
	
	
	
	