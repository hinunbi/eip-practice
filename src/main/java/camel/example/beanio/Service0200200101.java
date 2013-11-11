package camel.example.beanio;

import camel.example.beanio.message.Body200101;
import camel.example.beanio.message.BodyCommon;
import camel.example.beanio.message.Header;
import camel.example.beanio.message.Msg0200200101;
import camel.example.beanio.message.Msg0210200101;

public class Service0200200101 {

	public Msg0210200101 process(Msg0200200101 msg0200200101) {

		// Java ���� ���� ��ü ����
		Msg0210200101 msg0210200101 = new Msg0210200101();
		Header header = msg0200200101.header;
		BodyCommon bodyCommon = msg0200200101.bodyCommon;
		Body200101 body200101 = msg0200200101.body200101;
		msg0210200101.header = header;
		msg0210200101.bodyCommon = bodyCommon;
		msg0210200101.body200101 = body200101;

		// Java ���� ���� ��ü�� �� �Է�
		header.���������ڵ� = "0210";
		header.���������翩�� = 0;
		header.�����ڵ� = "0000";
		body200101.Ÿ������ȸ������ = 0;
		body200101.����Ƚ�� = 0;

		return msg0210200101;
	}
}
