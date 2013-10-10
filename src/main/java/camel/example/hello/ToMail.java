package camel.example.hello;

import java.util.Date;

import org.apache.camel.ProducerTemplate;
import org.apache.camel.spring.Main;

public class ToMail {

	public static void main(String[] args) throws Exception {

		String ctxPath = "camel/example/hello/ToMail.xml";

		Main main = new Main();
		main.setApplicationContextUri(ctxPath);

		// Camel ���ؽ�Ʈ ����
		main.start();
		// Camel ������(�߽���) ��ü ȹ��
		ProducerTemplate producer = main.getCamelTemplate();
		// �޽��� �߽�
		producer.requestBody("direct:start",  "Hello, world! at " + new Date());
		// Camel ���ؽ�Ʈ ����
		main.stop();

	}
}
