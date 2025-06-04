package com.example.demo.service;

import java.util.Random;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

@Service
public class LottoService {

	/* 可以得到lotto電腦選號
	* @param amount 購買數量
	*/ 
	@Tool(name = "lotto", description = "可以得到lotto電腦選號")
	public String lotto593(Integer amount) {
		Random random = new Random();
		return "LottoService 產生樂透號碼:" + random.nextInt(10); // 0~9，回傳給字串
	}
	
	/* 樂透結帳
	* @param amount 購買數量
	*/
	public String checkout(Integer amount) {
		return "LottoService 樂透結帳:$" + (amount *50);
		
	}
}
