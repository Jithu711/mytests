package com.jithu.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author JITHU
 *
 */
public class Triangle implements ApplicationContextAware, BeanNameAware, InitializingBean, DisposableBean, IShape {
	
//	private String type;
//	private int height;
//	
//	public Triangle(int height){
//		this.height = height;
//	}
//	
//	public Triangle(String type){
//		this.type = type;
//	}
//	
//	public Triangle(String type, int height){
//		this.type = type;
//		this.height = height;
//	}
//	public String getType() {
//		return type;
//	}
//	public void setType(String type) {
//		this.type = type;
//	}
	Point pointA;
	Point pointB;
	Point pointC;
	ApplicationContext context = null;
	private String beanName;
	
//	public Triangle(Point pointA, Point pointB, Point pointC){
//		this.pointA = pointA;
//		this.pointB = pointB;
//		this.pointC = pointC;
//	}
	public Point getPointA() {
		return pointA;
	}


	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}


	public Point getPointB() {
		return pointB;
	}


	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}


	public Point getPointC() {
		return pointC;
	}


	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}


	public void draw(){
//		System.out.println("Triangel drawn of type "+type+" and height "+height);
		System.out.println("triangle is drawing");
		System.out.println("PointA is ("+getPointA().getX()+","+getPointA().getY()+" ) PointB is ("+getPointB().getX()+","+getPointB().getY()+") PointC is ("+getPointC().getX()+","+getPointC().getY()+")");
//		System.out.println("Bane Name >>"+beanName);
	}


	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		this.context = arg0;
	}


	@Override
	public void setBeanName(String arg0) {
		this.beanName = arg0;
	}


	@Override
	public void afterPropertiesSet() throws Exception {
//		System.out.println("initailizing the triangle bean in the spring style");
	}


	@Override
	public void destroy() throws Exception {
//		System.out.println("destroying the triangle bean in the spring style");
	}
	
	public void myInit(){
//		System.out.println("inside the triangle init");
	}
	
	public void myCleanUp(){
//		System.out.println("inside the triangle cleanup");
	}
}
