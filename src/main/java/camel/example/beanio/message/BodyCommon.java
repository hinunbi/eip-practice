package camel.example.beanio.message;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class BodyCommon {
	public String OTP���������ڵ�;
	public String ����ڽĺ��ڵ�;
	public String OTP�Ϸù�ȣ;

	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

}
