package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import collection_argument.Question;

public class MainApp 
{
	public static void main(String[] args) 
	{
		//Open the configuration file.
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");		
		//Get an instance of student bean class.
		Student student = (Student) context.getBean("studentbean");
		//Display the fields values that been fed from the XML file.
		student.displayStudentInfo();
		//Call method of Address instance defined in the student class via XML.
		student.getAddress().getAddressInfo();
		
		
		
		
		
		
		Question question = (Question) context.getBean("question");
		question.displayInfo();
		
		
		
		
		//Resources must be closed, can be done:
		((ClassPathXmlApplicationContext) context).close();
		/*############## OR ##############
		try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			Student std = (Student) ctx.getBean("studentbean");
			std.displayInfo();
		}
		*/
		
	}
}
