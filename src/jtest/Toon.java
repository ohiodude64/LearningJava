package jtest;

public class Toon {

	public int s,d,c,i,w,ch;
	private String classes[] = {"Ranger","Fighter","Cleric","Sorcerer","Druid","Monk","Wizard","Thief"};

	public Toon()
	{
		this.s = (int) (Math.random() * 18);
		this.d = (int) (Math.random() * 18);
		this.c = (int) (Math.random() * 18);
		this.i = (int) (Math.random() * 18);
		this.w = (int) (Math.random() * 18);
		this.ch = (int) (Math.random() * 18);
		
	}
	
	public void showToon() {
		
		System.out.println("Str: " + s);
		System.out.println("Dex: " + d);
		System.out.println("Con: " + c);
		System.out.println("Int: " + i);
		System.out.println("Wis: " + w);
		System.out.println("Chr: " + ch);
	}
	
}
