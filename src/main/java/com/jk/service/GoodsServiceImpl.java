package com.jk.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jk.beans.Goods;
import com.jk.beans.Type;
import com.jk.mapper.GoodsMapper;
@Service
public class GoodsServiceImpl implements GoodsService{

	@Resource
	private GoodsMapper goodsMapper;
	
	public List<Goods> queryAll(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return goodsMapper.queryAll(map);
	}

	public List<Type> queryTypes() {
		// TODO Auto-generated method stub
		return goodsMapper.queryTypes();
	}

	public void addGoods(Goods goods) {
		// TODO Auto-generated method stub
		goodsMapper.addGoods(goods);
	}


	public Goods queryGoodsById(Integer gid) {
		// TODO Auto-generated method stub
		return goodsMapper.queryGoodsById(gid);
	}

	public void update(Goods goods) {
		// TODO Auto-generated method stub
		goodsMapper.update(goods);
	}

	public void del1(String ids) {
		// TODO Auto-generated method stub
		goodsMapper.del1(ids);
	}

	public void del2(String ids) {
		// TODO Auto-generated method stub
		goodsMapper.del2(ids);
	}

	

}
