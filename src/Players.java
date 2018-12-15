//not incorporated in project but for later use

import java.util.Scanner;

public class Players{
	
	Scanner sc = new Scanner(System.in);
	
	private int headCount;
	private String str = sc.next();
	
	public int getHeadCount() {
		
		return headCount;
	}
	
	public void setHeadCount(int headCount) {
		
		this.headCount = headCount;
		
	}

	public String getStr() {
		
		return str;
		
	}

	public void setStr(String str) {
		
		this.str = str;
		
	}
	 
}
