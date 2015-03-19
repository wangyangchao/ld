package com.ld.controller;

public class TianE extends Duck{

	public TianE(){
		flyBehavior = new TianEFly();
		quackBehavior = new TianEQuack();
	}
	
	
	public static void main(String[] args){
	
		TianE t = new TianE();
		t.performFly();
		t.performQuack();
	}
}
