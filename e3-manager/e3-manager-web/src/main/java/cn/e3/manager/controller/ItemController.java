package cn.e3.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.e3.manager.service.ItemService;
import cn.e3.pojo.TbItem;

@Controller
public class ItemController {
	
	 //注入service服务对象
	@Autowired
	private ItemService itemService;

	/**
	 * 需求:根据id查询商品数据
	 * 请求:/item/id/{itemId}
	 * 参数:Long itemId
	 * 返回值:TbItem
	 */
	@RequestMapping("/item/id/{itemId}")
	@ResponseBody
	public TbItem findItemByID(@PathVariable Long itemId){
		//调用service服务方法，查询商品
		TbItem item = itemService.findItemByID(itemId);
		//返回商品对象
		return item;
	}
}
