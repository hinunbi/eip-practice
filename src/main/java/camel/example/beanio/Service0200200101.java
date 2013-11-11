package camel.example.beanio;

import camel.example.beanio.message.Body200101;
import camel.example.beanio.message.BodyCommon;
import camel.example.beanio.message.Header;
import camel.example.beanio.message.Msg0200200101;
import camel.example.beanio.message.Msg0210200101;

public class Service0200200101 {

	public Msg0210200101 process(Msg0200200101 msg0200200101) {

		// Java 응답 전문 객체 생성
		Msg0210200101 msg0210200101 = new Msg0210200101();
		Header header = msg0200200101.header;
		BodyCommon bodyCommon = msg0200200101.bodyCommon;
		Body200101 body200101 = msg0200200101.body200101;
		msg0210200101.header = header;
		msg0210200101.bodyCommon = bodyCommon;
		msg0210200101.body200101 = body200101;

		// Java 응답 전문 객체에 값 입력
		header.전문종별코드 = "0210";
		header.미통지존재여부 = 0;
		header.응답코드 = "0000";
		body200101.타기관사고회복여부 = 0;
		body200101.오류횟수 = 0;

		return msg0210200101;
	}
}
