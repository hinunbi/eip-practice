package camel.example.beanio.message;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class Msg0200200101 {
	public Header header;
	public BodyCommon bodyCommon;
	public Body200101 body200101;

	public String toString() {
		return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE);
	}
}
