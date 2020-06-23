package com.spring5.mvc.converters;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StreamUtils;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class MyHttpMessageConverter extends AbstractHttpMessageConverter<Object> {

	public MyHttpMessageConverter() {
		super(new MediaType("application", "lz-type"));
	}

	@Override
	protected boolean supports(Class<?> clazz) {
		return MyClass.class.equals(clazz);
	}

	@Override
	protected Object readInternal(Class<?> clazz, HttpInputMessage inputMessage)
			throws IOException, HttpMessageNotReadableException {
		String s = StreamUtils.copyToString(inputMessage.getBody(), StandardCharsets.UTF_8);
		String[] split = s.split("-");
		if (split.length < 2) {
			return new MyClass();
		}
		return new MyClass(split[0], Integer.parseInt(split[1]));
	}

	@Override
	protected void writeInternal(Object o, HttpOutputMessage outputMessage)
			throws IOException, HttpMessageNotWritableException {
		OutputStream body = outputMessage.getBody();
		body.write(o.toString().getBytes());
		body.flush();
	}

	public static class MyClass {
		private String name;
		private Integer age;

		public MyClass() {
		}

		public MyClass(String name, Integer age) {
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "MyClass{" +
					"name='" + name + '\'' +
					", age=" + age +
					'}';
		}
	}
}
