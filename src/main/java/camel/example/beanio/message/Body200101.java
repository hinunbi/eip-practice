package camel.example.beanio.message;

import java.util.Date;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class Body200101 {
	public String OTP���䰪;
	public Integer Ÿ������ȸ������;
	public Integer ����Ƚ��;
	public String Offset;
	public Date ������������������;
	public Date ���������������ð�;
	public String ����������OTP���䰪;
	public String ����;

	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
}
