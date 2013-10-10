package camel.example.hello;

import java.util.Date;

import org.apache.camel.ProducerTemplate;
import org.apache.camel.spring.Main;

public class ToMail {

	public static void main(String[] args) throws Exception {

		String ctxPath = "camel/example/hello/ToMail.xml";

		Main main = new Main();
		main.setApplicationContextUri(ctxPath);

		// Camel 컨텍스트 실행
		main.start();
		// Camel 생산자(발신자) 객체 획득
		ProducerTemplate producer = main.getCamelTemplate();
		// 메시지 발신
		producer.requestBody("direct:start",  "Hello, world! at " + new Date());
		// Camel 컨텍스트 종료
		main.stop();

	}
}
