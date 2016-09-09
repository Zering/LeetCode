package com.algorithm;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.alibaba.fastjson.JSON;

public class GeneratorParenthesisTest {

	private final static int N = 3;
	private GeneratorParenthesis generatorParenthesis = new GeneratorParenthesis();
	
	@Test
	public void generateParenthesis() {
		List<String> result = new ArrayList<>();
		result = generatorParenthesis.generateParenthesis(N);
		System.out.println(JSON.toJSONString(result));
	}
}
