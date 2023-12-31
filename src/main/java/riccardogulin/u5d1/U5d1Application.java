package riccardogulin.u5d1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class U5d1Application {

	public static void main(String[] args) {
		SpringApplication.run(U5d1Application.class, args);
		// METODO TRADIZIONALE
//		FrontendStudent f = new FrontendStudent("Aldo");
//		BackendStudent b = new BackendStudent("Giovanni");
//		FullstackStudent fs = new FullstackStudent("Giacomo");
//
//		Interviewer i1 = new Interviewer(f);
//		Interviewer i2 = new Interviewer(b);
//		Interviewer i3 = new Interviewer(fs);
//
//		i1.askQuestion();
//		i2.askQuestion();
//		i3.askQuestion();
		configWithComponent();
	}

	public static void configWithConfigAnnotation() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5d1Application.class);

		log.info((String) ctx.getBean("getName"));
		log.info(ctx.getBean("getFe").toString());

		log.info(ctx.getBean("getInterviewer").toString());

		ctx.close();
	}

	public static void configWithXML() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		log.info(ctx.getBean("getBe").toString());

		ctx.close();
	}

	public static void configWithComponent() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5d1Application.class);

		log.info(ctx.getBean(FullstackStudent.class).toString());

		ctx.close();
	}

}
