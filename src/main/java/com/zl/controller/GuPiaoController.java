package com.zl.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.zl.pojo.Condition;
import com.zl.pojo.StockInfo;
import com.zl.service.GuPiaoService;

@Controller
public class GuPiaoController {
	@Autowired
	private GuPiaoService guPiaoService; 
	@RequestMapping("/queryAllgupiao.action")
	@ResponseBody
	public PageInfo<StockInfo> queryAllgupiao(@RequestParam(defaultValue="1")Integer pageNum,@RequestParam(defaultValue="5")
	Integer PageSize,Condition condition){
		PageInfo<StockInfo> pageInfo = guPiaoService.queryAllgupiao(pageNum,PageSize,condition);
		return pageInfo;
	}
	@RequestMapping("/queryDaimaAndName.action")
	@ResponseBody
	public List<StockInfo> queryDaimaAndName(Integer daima,String name) {
		System.err.println(daima+"--------"+name);
		List<StockInfo> pageInfo = guPiaoService.queryDaimaAndName(daima,name);
		System.out.println(pageInfo);
		return pageInfo;
	}
	
	
}
