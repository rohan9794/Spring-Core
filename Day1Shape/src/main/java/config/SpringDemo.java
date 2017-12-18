package config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import BeanPlace.Shape;

public class SpringDemo {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Shape s = (Shape)context.getBean("myShapeBean");
		s.draw();
		Shape s2 = (Shape)context.getBean("myShapeBeanCircle");
		s2.draw();
	}
}
