package com.jithu.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Point {
	private int x;
	private int y;
	static int count;
	
//	public Point (){
//		count++;
//		System.out.println("count >> "+count);
//	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void myInit(){
//		System.out.println("inside the myinit of point bean");
	}
	
	public void myCleanUp(){
//		System.out.println("inside the myCleanUp of point");
	}
//	@Override
//	public void afterPropertiesSet() throws Exception {
//		System.out.println("initializing the point bean");
//	}
//	@Override
//	public void destroy() throws Exception {
//		System.out.println("Destroying the point bean");
//	}	
}
