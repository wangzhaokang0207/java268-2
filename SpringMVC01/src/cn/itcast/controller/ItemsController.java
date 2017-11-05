package cn.itcast.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import cn.itcast.pojo.Items;

public class ItemsController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		
		List<Items> itemlist = new ArrayList<>();
		//创建商品对象
		Items items1 = new Items();
		//添加属性
		items1.setId(1);
		items1.setName("小米手机1");
		items1.setPrice(3000f);
		items1.setCreatetime(new Date());

		itemlist.add(items1);
		//创建商品对象
		Items items2 = new Items();
		//添加属性
		items2.setId(2);
		items2.setName("小米手机2");
		items2.setPrice(3000f);
		items2.setCreatetime(new Date());

		itemlist.add(items2);
		//创建商品对象
		Items items3 = new Items();
		//添加属性
		items3.setId(3);
		items3.setName("小米手机3");
		items3.setPrice(3000f);
		items3.setCreatetime(new Date());
		itemlist.add(items3);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemlist", itemlist);
		modelAndView.setViewName("/WEB-INF/jsp/itemList.jsp");
		return modelAndView;
	}

}
