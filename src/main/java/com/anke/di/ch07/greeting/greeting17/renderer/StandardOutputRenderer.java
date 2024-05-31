package org.javaturk.spring.di.ch07.greeting.greeting17.renderer;


import org.javaturk.spring.di.ch07.greeting.greeting17.custom.Selam;
import org.javaturk.spring.di.ch07.greeting.greeting17.provider.GreetingProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class StandardOutputRenderer implements GreetingRenderer {

	@Autowired
	@Selam
	private GreetingProvider selamGreetingProvider;

//	@Autowired
//	public void setGreetingProvider(GreetingProvider greetingProvider) {
//		this.greetingProvider = greetingProvider;
//	}
	
//	@Autowired
//	public void setHelloWorldGreetingProvider(@Selam GreetingProvider greetingProvider) {
//		this.greetingProvider = greetingProvider;
//	}
	
//	@Autowired
//	public void setGreetingProvider(@Selam GreetingProvider greetingProvider) {
//		this.greetingProvider = greetingProvider;
//	}

	public void render() {
		System.out.println(selamGreetingProvider.getGreeting());
	}
}
