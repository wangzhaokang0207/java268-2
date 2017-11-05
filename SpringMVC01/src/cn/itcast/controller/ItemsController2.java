package cn.itcast.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import cn.itcast.pojo.Items;
@org.springframework.stereotype.Controller
public class ItemsController2 {

	@RequestMapping("/list2")
	public ModelAndView itemList(){
		
		List<Items> itemlist = new ArrayList<>();
		//������Ʒ����
		Items items1 = new Items();
		//�������
		items1.setId(1);
		items1.setName("С���ֻ�1");
		items1.setPrice(3000f);
		items1.setCreatetime(new Date());

		itemlist.add(items1);
		//������Ʒ����
		Items items2 = new Items();
		//�������
		items2.setId(1);
		items2.setName("С���ֻ�2");
		items2.setPrice(3000f);
		items2.setCreatetime(new Date());

		itemlist.add(items2);
		//������Ʒ����
		Items items3 = new Items();
		//�������
		items3.setId(1);
		items3.setName("С���ֻ�3");
		items3.setPrice(3000f);
		items3.setCreatetime(new Date());
		itemlist.add(items3);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemList", itemlist);
		modelAndView.setViewName("itemList");
		return modelAndView;
		
		/*	//����һ����Ʒ�б�
			List<Items> itemList = new ArrayList<>();
			Items item1 = new Items();
			item1.setId(1);
			item1.setName("��Ϊ�ֻ�1");
			item1.setPrice(6000f);
			item1.setCreatetime(new Date());
			itemList.add(item1);
			Items item2 = new Items();
			item2.setId(1);
			item2.setName("��Ϊ�ֻ�2");
			item2.setPrice(6000f);
			item2.setCreatetime(new Date());
			itemList.add(item2);
			Items item3 = new Items();
			item3.setId(1);
			item3.setName("��Ϊ�ֻ�3");
			item3.setPrice(6000f);
			item3.setCreatetime(new Date());
			itemList.add(item3);
			Items item4 = new Items();
			item4.setId(1);
			item4.setName("��Ϊ�ֻ�4");
			item4.setPrice(6000f);
			item4.setCreatetime(new Date());
			itemList.add(item4);
			//����Ʒ�б��ݸ�jsp
			ModelAndView modelAndView = new ModelAndView();
			//�����ݷŵ�ModelAndView�������൱�ڷŵ�Request�С�
			modelAndView.addObject("itemList", itemList);
			//jsp����
			modelAndView.setViewName("/WEB-INF/jsp/itemList.jsp");
			return modelAndView;*/
	}

}
