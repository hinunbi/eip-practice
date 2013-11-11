package camel.example.beanio.message;

import java.util.Date;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class Body200101 {
	public String OTP응답값;
	public Integer 타기관사고회복여부;
	public Integer 오류횟수;
	public String Offset;
	public Date 마지막인증성공일자;
	public Date 마지막인증성공시간;
	public String 마지막제출OTP응답값;
	public String 예약;

	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
}
