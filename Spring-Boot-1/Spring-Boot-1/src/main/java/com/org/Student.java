package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	{
		System.out.println("Student Object Created");
	}
	@Autowired
	Book book;
}
