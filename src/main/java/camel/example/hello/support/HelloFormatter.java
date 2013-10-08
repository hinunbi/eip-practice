package camel.example.hello.support;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.processor.DefaultExchangeFormatter;

public class HelloFormatter extends DefaultExchangeFormatter {

	@Override
	public String format(Exchange exchange) {

		Message in = exchange.getIn();
		StringBuilder sb = new StringBuilder();
		sb.append(getBodyAsString(in));

		return sb.toString();
	}
}
