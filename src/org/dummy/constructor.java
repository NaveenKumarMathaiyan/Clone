package org.dummy;

public class constructor {
	public constructor() {
		System.out.println("hai");
	}

	public constructor(int a) {
		System.out.println("argument" + a);
	}

	public void normal() {
		System.out.println("normal method");
	}

	public static void main(String[] args) {
		constructor c = new constructor();
		constructor c1 = new constructor(20);
		// normal n =new normal();
		c.normal();
	}

}
