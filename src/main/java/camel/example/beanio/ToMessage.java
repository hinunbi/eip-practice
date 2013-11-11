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

		// Camel 컨텍스트 실행
		main.start();
		// Camel 발신자 객체 획득
		ProducerTemplate producer = main.getCamelTemplate();
		// Java 발신 전문 객체 생성
		Msg0200200101 msg0200200101 = new Msg0200200101();
		Header header = new Header();
		BodyCommon bodyCommon = new BodyCommon();
		Body200101 body200101 = new Body200101();
		msg0200200101.header = header;
		msg0200200101.bodyCommon = bodyCommon;
		msg0200200101.body200101 = body200101;

		// Java 발신 전문 객체에 값 입력
		header.전문길이 = 252;
		header.트랜잭션코드 = "123456";
		header.전문종별코드 = "0200";
		header.거래구분코드 = "200101";
		header.테스트구분 = "T";
		header.송수신코드 = "1";
		header.미통지존재여부 = 0;
		header.요구기관코드 = "123456";
		header.기준일자 = new Date();
		header.전문일련번호 = 1;
		header.업무일련번호 = 1;
		header.응답기관코드 = "abcde";
		header.전문전송일자 = new Date();
		header.전문전송시간 = header.전문전송일자;
		header.세션정보 = 0;
		header.센터예비필드 = "";
		header.기관예비필드 = "";
		bodyCommon.OTP인증벤더코드 = "004";
		bodyCommon.사용자식별코드 = "barunmo";
		bodyCommon.OTP일련번호 = "123456789012";
		body200101.OTP응답값 = "";
		body200101.타기관사고회복여부 = 0;
		body200101.오류횟수 = 0;
		body200101.Offset = "";
		body200101.마지막인증성공일자 = new Date();
		body200101.마지막인증성공시간 = body200101.마지막인증성공일자;

		// 요청 객체 출력
		System.out.println("Request Object <" + msg0200200101 + ">");
		// 객체 발신 및 수신
		Msg0210200101 msg0210200101 = producer.requestBody("direct:toserver", msg0200200101, Msg0210200101.class);
		// 응답 객체 출력
		System.out.println("Response Object <" + msg0210200101 + ">");

		// Camel 컨텍스트 종료
		main.stop();

	}
}
