package camel.example.hello;

import java.util.Date;

import org.apache.camel.ProducerTemplate;
import org.apache.camel.spring.Main;

public class ToLog {

	public static void main(String[] args) throws Exception {

		String ctxPath = "camel/example/hello/ToLog.xml";

		Main main = new Main();
		main.setApplicationContextUri(ctxPath);

		// Camel ���ؽ�Ʈ ����
		main.start();
		// Camel �������̽� ��ü ȹ��
		ProducerTemplate producer = main.getCamelTemplate();
		// �޽��� �߽�
		producer.requestBody("direct:start",  "Hello World! at " + new Date());
		// Camel ���ؽ�Ʈ ����
		main.stop();

	}
}
