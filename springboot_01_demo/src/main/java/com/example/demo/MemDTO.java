package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor // 파라미터가 없는 생성자
@AllArgsConstructor // 모든 파라미터를 받는 생성자?

@Setter // setter를 선언하지 않아도 된다.
@Getter // getter를 선언하지 않아도 된다.
public class MemDTO {
	private String name;
	private int age;
	private String loc;
	
	
}
