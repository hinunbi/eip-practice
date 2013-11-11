package camel.example.beanio.message;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class BodyCommon {
	public String OTP인증벤더코드;
	public String 사용자식별코드;
	public String OTP일련번호;

	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

}
