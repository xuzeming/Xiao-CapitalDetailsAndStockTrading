package com.zl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zl.mapper.StockInfoMapper;
import com.zl.pojo.Condition;
import com.zl.pojo.Page;
import com.zl.pojo.SHOwnStock;
import com.zl.pojo.StockInfo;
import com.zl.service.StockInfoService;
@Service
public class StockInfoServiceImpl implements StockInfoService {
	@Autowired
	private StockInfoMapper userOwnStockMapper;
	@Override
	public PageInfo<StockInfo> queryAll(Integer pageIndex, Integer pageSize,Condition condition) {
		PageHelper.startPage(pageIndex, pageSize);
		List<StockInfo> stockInfo = userOwnStockMapper.queryAllUserOwnStock(condition);
		PageInfo<StockInfo> pageInfo = new PageInfo<>(stockInfo);
		return pageInfo;
	}

	@Override
	public StockInfo queryByStockNum(Integer stocknum) {
		StockInfo stockInfo = userOwnStockMapper.queryStockNum(stocknum);
		return stockInfo;
	}

}
