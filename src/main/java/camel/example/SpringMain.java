package camel.example;

import java.util.Map;
import java.util.Set;

import org.apache.camel.CamelContext;
import org.apache.camel.Component;
import org.apache.camel.spring.Main;

public class SpringMain extends Main {

	private static final String SPRING_CONTEXT_FILE = "classpath:applicationContext.xml";

	public static void main(String... args) throws Exception {
		SpringMain springMain = new SpringMain();
		instance = springMain;
		String contextPath = null;
		if (args != null && args.length > 0) {
			contextPath = args[0];
		}
		springMain.run(contextPath);
	}


	public void run(String conf) throws Exception {

		if (conf != null) {
			conf = "classpath:" + conf;
		} else {
			conf = SPRING_CONTEXT_FILE;
		}
		System.out.println("Using configuration file : " + conf);
		setApplicationContextUri(conf);
		enableHangupSupport();
		System.out.println("Starting Camel... Use ctrl + c to terminate the JVM.\n");
		super.run();
	}
}
