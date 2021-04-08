package com.gzcc.generic;


public class TestGeneric02 {
	public static void main(String[] args) {
		ConverTask converTask = new ConverTask();
		Integer integer = converTask.execute("100");
		System.out.println(integer);
	}
}

//定义泛型接口
interface Task<Param,Result>{
	Result execute(Param param);
}
class ConverTask implements Task<String, Integer>{

	@Override
	public Integer execute(String param) {
		
		return Integer.parseInt(param);
	}
	
}
