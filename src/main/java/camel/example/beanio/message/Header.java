package camel.example.beanio.message;

import java.util.Date;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class Header {
	public Integer ��������;
	public String Ʈ������ڵ�;
	public String ���������ڵ�;
	public String �ŷ������ڵ�;
	public String �׽�Ʈ����;
	public String �ۼ����ڵ�;
	public Integer ���������翩��;
	public String �����ڵ�;
	public String �䱸����ڵ�;
	public Date ��������;
	public Integer �����Ϸù�ȣ;
	public Integer �����Ϸù�ȣ;
	public String �������ڵ�;
	public Date ������������;
	public Date �������۽ð�;
	public Integer ��������;
	public String ���Ϳ����ʵ�;
	public String ��������ʵ�;

	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
}
