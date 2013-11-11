package camel.example.beanio;

import camel.example.beanio.message.Body200101;
import camel.example.beanio.message.BodyCommon;
import camel.example.beanio.message.Header;
import camel.example.beanio.message.Msg0200200101;
import camel.example.beanio.message.Msg0210200101;

import java.util.Date;

import org.apache.camel.ProducerTemplate;
import org.apache.camel.spring.Main;

public class ToMessage {

	public static void main(String[] args) throws Exception {

		String ctxPath = "camel/example/beanio/ToMessage.xml";

		Main main = new Main();
		main.setApplicationContextUri(ctxPath);

		// Camel ���ؽ�Ʈ ����
		main.start();
		// Camel �߽��� ��ü ȹ��
		ProducerTemplate producer = main.getCamelTemplate();
		// Java �߽� ���� ��ü ����
		Msg0200200101 msg0200200101 = new Msg0200200101();
		Header header = new Header();
		BodyCommon bodyCommon = new BodyCommon();
		Body200101 body200101 = new Body200101();
		msg0200200101.header = header;
		msg0200200101.bodyCommon = bodyCommon;
		msg0200200101.body200101 = body200101;

		// Java �߽� ���� ��ü�� �� �Է�
		header.�������� = 252;
		header.Ʈ������ڵ� = "123456";
		header.���������ڵ� = "0200";
		header.�ŷ������ڵ� = "200101";
		header.�׽�Ʈ���� = "T";
		header.�ۼ����ڵ� = "1";
		header.���������翩�� = 0;
		header.�䱸����ڵ� = "123456";
		header.�������� = new Date();
		header.�����Ϸù�ȣ = 1;
		header.�����Ϸù�ȣ = 1;
		header.�������ڵ� = "abcde";
		header.������������ = new Date();
		header.�������۽ð� = header.������������;
		header.�������� = 0;
		header.���Ϳ����ʵ� = "";
		header.��������ʵ� = "";
		bodyCommon.OTP���������ڵ� = "004";
		bodyCommon.����ڽĺ��ڵ� = "barunmo";
		bodyCommon.OTP�Ϸù�ȣ = "123456789012";
		body200101.OTP���䰪 = "";
		body200101.Ÿ������ȸ������ = 0;
		body200101.����Ƚ�� = 0;
		body200101.Offset = "";
		body200101.������������������ = new Date();
		body200101.���������������ð� = body200101.������������������;

		// ��û ��ü ���
		System.out.println("Request Object <" + msg0200200101 + ">");
		// ��ü �߽� �� ����
		Msg0210200101 msg0210200101 = producer.requestBody("direct:toserver", msg0200200101, Msg0210200101.class);
		// ���� ��ü ���
		System.out.println("Response Object <" + msg0210200101 + ">");

		// Camel ���ؽ�Ʈ ����
		main.stop();

	}
}
