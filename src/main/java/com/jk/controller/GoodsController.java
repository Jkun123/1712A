package com.jk.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jk.beans.Goods;
import com.jk.beans.Type;
import com.jk.service.GoodsService;

@Controller
public class GoodsController {
	
	@Resource
	private GoodsService goodsService;
	
	//查询商品 
	@RequestMapping("list")
	public String queryAll(@RequestParam(defaultValue="1")Integer pageNum,
			Model model,
			@RequestParam(defaultValue="")String lname){
		Map<String, Object> map = new HashMap<String, Object>();
		if(lname!=null && lname!=""){
			map.put("lname", lname);
		}
		//分页
		PageHelper.startPage(pageNum, 2);
		List<Goods> list = goodsService.queryAll(map );
		PageInfo<Goods> page = new PageInfo<Goods>(list);
		model.addAttribute("page", page);
		return "list";
	}

	//查询种类
	@RequestMapping("queryTypes")
	@ResponseBody 
	public List<Type> queryTypes(Model model){
		List<Type> tlist = goodsService.queryTypes();
		return tlist;
	}
	
	//真正的添加
	@RequestMapping("add")
	public String addGoods(Goods goods){
		System.out.println(goods);
		try {
			goodsService.addGoods(goods);
			return "a";
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return "b";
	}
	
	//查看商品详情
	@RequestMapping("queryGoodsById")
	public String queryGoodsById(Integer gid,Model model){
		Goods good = goodsService.queryGoodsById(gid);
		model.addAttribute("good", good);
		return "showGoods";
	}
	
	//查看商品回显
	@RequestMapping("toUpdate")
	public String toUpdate(Integer gid,Model model){
		Goods good = goodsService.queryGoodsById(gid);
		model.addAttribute("g", good);
		return "update";
	}
	//查看商品回显
	@RequestMapping("update1")
	public String update(Goods goods){
		try {
			goodsService.update(goods);
			return "c";
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return "d";
	}
	//逻辑删除
	@RequestMapping("del1")
	@ResponseBody
	public boolean del1(String ids){
		System.out.println(ids);
		try {
			goodsService.del1(ids);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	@RequestMapping("del2")
	@ResponseBody
	public boolean del2(String ids){
		System.out.println(ids);
		try {
			goodsService.del2(ids);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
}
