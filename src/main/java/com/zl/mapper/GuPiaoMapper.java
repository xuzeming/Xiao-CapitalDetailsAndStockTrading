package com.zl.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zl.pojo.Condition;
import com.zl.pojo.StockInfo;

public interface GuPiaoMapper {

	int queryAllCount(Condition condition);

	List<StockInfo> queryAllgupiao(Condition condition);

	List<StockInfo> queryDaimaOrName(@Param(value="daima")Integer daima, @Param(value="name")String name);


}
