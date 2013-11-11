package camel.example.beanio.message;

import java.util.Date;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class Header {
	public Integer 전문길이;
	public String 트랜잭션코드;
	public String 전문종별코드;
	public String 거래구분코드;
	public String 테스트구분;
	public String 송수신코드;
	public Integer 미통지존재여부;
	public String 응답코드;
	public String 요구기관코드;
	public Date 기준일자;
	public Integer 전문일련번호;
	public Integer 업무일련번호;
	public String 응답기관코드;
	public Date 전문전송일자;
	public Date 전문전송시간;
	public Integer 세션정보;
	public String 센터예비필드;
	public String 기관예비필드;

	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
}
