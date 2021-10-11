package com.pablocastelnovo.posts.customizing.logback.spring;

import java.util.function.Consumer;

public class Example {

	public static void main(String[] args) {
		Consumer<String> c1 = s -> System.out.println(s + " Khanh");
		Consumer<String> c2 = s -> System.out.println(s + " Huong Dan Java");

		c1.andThen(c2).accept("Hello");
		
		Consumer<String> c3 = s -> System.out.println(s + " Nam Son");
		
		c3.accept("Vu");
	}
}