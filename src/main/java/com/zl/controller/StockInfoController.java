package com.zl.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.zl.pojo.Condition;
import com.zl.pojo.StockInfo;
import com.zl.service.StockInfoService;
@Controller
public class StockInfoController {
	@Autowired
	private StockInfoService userOwnStockService;
	@RequestMapping("/queryAll.action")
	@ResponseBody
	public PageInfo<StockInfo> queryAll(@RequestParam(defaultValue="1")Integer pageNum,@RequestParam(defaultValue="5")
	Integer PageSize,Condition condition) {
	PageInfo<StockInfo> page = userOwnStockService.queryAll(pageNum,PageSize,condition);
	return page;
	}
	@RequestMapping("/SetStockNum.action")
	public String SetStockNum(String stocknum,HttpSession session) {
		//System.err.println(stocknum);
		session.setAttribute("stocknum", stocknum);
		String stocknum2 = (String)session.getAttribute("stocknum");
		return "forward:/gupiaomairu.html";
	}
	@RequestMapping("/GetStockNum.action")
	@ResponseBody
	public String GetStockNum(HttpSession session) {
		String stocknum = (String)session.getAttribute("stocknum");
		return stocknum;
	}
	@RequestMapping("queryByStockNum.action")
	@ResponseBody
	public StockInfo queryByStockNum(Integer stocknum) {
		StockInfo stockInfo = userOwnStockService.queryByStockNum(stocknum);
		return stockInfo;
	}
	
}
