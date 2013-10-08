package com.brm.pattern.configurer;

public interface Configurer<T> {

	public void configure(T client) throws Exception;

}