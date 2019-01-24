package com.zl.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.zl.pojo.Condition;
import com.zl.pojo.StockInfo;

public interface GuPiaoService {

	PageInfo<StockInfo> queryAllgupiao(Integer pageIndex, Integer pageSize, Condition condition);

	List<StockInfo> queryDaimaAndName(Integer daima, String name);


}
