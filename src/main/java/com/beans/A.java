package com.beans;

import com.beans.A;

public class A {
	B b1;
	C c1;
	public C getC1() {
		return c1;
	}
	public void setC1(C c1) {
		this.c1 = c1;
	}
	public B getB() {
		return b1;
	}
	public void setB(B b) {
		this.b1 = b;
	}
	
	public void m1()
	{
		b1.m2();
		c1.m3();
	}

}
