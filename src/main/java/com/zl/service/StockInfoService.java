package com.zl.service;

import com.github.pagehelper.PageInfo;
import com.zl.pojo.Condition;
import com.zl.pojo.Page;
import com.zl.pojo.StockInfo;

public interface StockInfoService {

	PageInfo<StockInfo> queryAll(Integer pageIndex, Integer pageSize,Condition condition);


	StockInfo queryByStockNum(Integer stocknum);

}
