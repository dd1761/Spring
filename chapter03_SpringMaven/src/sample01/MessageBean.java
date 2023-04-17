package sample01;

public interface MessageBean {
	//Before
	public void showPrintBefore();
	public void viewPrintBefore();
	
	//After
	public void showPrintAfter();
	public void viewPrintAfter();
	
	//Around
	public String showPrint();
	public void viewPrint();
	
	public void display();
}
