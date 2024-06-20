package org.newclass2024;

import java.util.ArrayList;
import java.util.List;

public class ReturnConcept {
private void name() {
	System.out.println("1");
}
private void sub(int a,int b)
{
	int c= a+b;
	System.out.println(c);
}
private Object add() {
	return "emp";
	

}
private List<Integer> ash() {
	int a= 19,b=23;
	//int b=23;
	
	List<Integer> l= new ArrayList< Integer>();
	l.add(a);
	l.add(b);
	
	
	return l;
	

}

public static void main(String[] args) {
	ReturnConcept r=new ReturnConcept();
	r.name();
	r.sub(10,20);
	Object add = r.add();
	System.out.println(add);
	List<Integer> ash = r.ash();
	System.out.println(ash);
}
}
