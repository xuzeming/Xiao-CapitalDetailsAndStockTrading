package com.zl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zl.mapper.GuPiaoMapper;
import com.zl.pojo.Condition;
import com.zl.pojo.StockInfo;
import com.zl.service.GuPiaoService;
@Service
public class GuPiaoServiceImpl implements GuPiaoService {
	@Autowired
	private GuPiaoMapper guPiaoMapper;
	@Override
	public PageInfo<StockInfo> queryAllgupiao(Integer pageIndex, Integer pageSize, Condition condition) {
		PageHelper.startPage(pageIndex, pageSize);
		List<StockInfo> stockInfo = guPiaoMapper.queryAllgupiao(condition);
		PageInfo<StockInfo> pageInfo = new PageInfo<>(stockInfo);
		return pageInfo;
	}
	@Override
	public List<StockInfo> queryDaimaAndName(Integer daima, String name) {
		return guPiaoMapper.queryDaimaOrName(daima,name);
	}

	
}
