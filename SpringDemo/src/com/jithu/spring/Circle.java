package com.jithu.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle implements IShape, ApplicationContextAware, ApplicationEventPublisherAware {

	@Autowired
	@Qualifier("circleRelated")
	private Point center;
	@Autowired
	private MessageSource messageSource;
	ApplicationContext context = null;	
	
	private ApplicationEventPublisher applicationEvenPublisher;
	private DrawEvent drawEvent = new DrawEvent(this);
	// public Circle(Point point){
	// this.pointA = point;
	// }

	@Override
	public void draw() {
		System.out.println(this.messageSource.getMessage("drawing.circle", null, "default message from circle",null));
		System.out.println(this.messageSource.getMessage("drawing.point", new Object[] {center.getX(),center.getY()}, "default message from point",null));
//		System.out.println(context.getMessage("greetingsInCircle", null, "default message from circle",null));
		System.out.println(this.messageSource.getMessage("greetingsInCircle", null, "default message from circle",null));
		applicationEvenPublisher.publishEvent(drawEvent);
	}

	public Point getCenter() {
		return center;
	}

//	@Required 
	public void setCenter(Point center) {
		this.center = center;
	}
	
	@PostConstruct
	public void initialize(){
		System.out.println("Initailize circle annotation");
	}
	
	@PreDestroy
	public void destroyMethod(){
		System.out.println("destroy circle in the annotation");
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		this.context = arg0;
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher arg0) {
		this.applicationEvenPublisher = arg0;
	}

}
