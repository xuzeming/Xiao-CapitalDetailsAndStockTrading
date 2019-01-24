package com.zl.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zl.pojo.Condition;
import com.zl.pojo.StockInfo;

public interface StockInfoMapper {


	List<StockInfo> queryAllUserOwnStock(Condition condition);

	StockInfo queryStockNum(@Param("stocknum")Integer stocknum);





}
