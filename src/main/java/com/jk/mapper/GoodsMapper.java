package com.jk.mapper;

import java.util.List;
import java.util.Map;

import com.jk.beans.Goods;
import com.jk.beans.Type;

public interface GoodsMapper {

	//查询商品信息-分页查询
	public List<Goods> queryAll(Map<String,Object> map);
	//查询种类
	public List<Type> queryTypes();
	//添加
	public void addGoods(Goods goods);
	//根据id查询商品
	public Goods queryGoodsById(Integer gid);
	//修改
	public void update(Goods goods);
	//删除(改变状态)
	public void del1(String ids);
	public void del2(String ids);
}
