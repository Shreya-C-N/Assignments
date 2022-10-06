package com.valtech.training.corejava.day1;

public class Outerr {
private int x=5;
private void printY(Innerr i) {
	System.out.println("Y = "+i.y);
}
private static class Innerr{
private int y=5;
void printX(Outerr o) {
	System.out.println("X = "+o.x);
}
public void increment(Outerr o) {
	o.x++;
}
}
public static void main(String[] args) {
	Outerr o=new Outerr();
	Innerr i=new Innerr();
	o.printY(i);
	i.printX(o);
	i.increment(o);
    new Innerr().increment(o);
    i.printX(o);
    i.printX(new Outerr());
}

}
//static inner class