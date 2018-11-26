package com.cg.mobshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.mobshop.dto.Mobiles;
import com.cg.mobshop.service.MobileService;

@Controller
public class MobileController {
   @Autowired
   MobileService service;
	
   @RequestMapping("getmoblist")
   public String showMobileList(Model model){
	   List<Mobiles> list = service.getAllMobiles();
	   model.addAttribute("list",list);
	   return "Home";
   }
   
   @RequestMapping("insertdata")
   public String add(@ModelAttribute("mobile") Mobiles mobile){
	   return "insert";
   }
   
   @RequestMapping("added")
   public String dataInsert(@ModelAttribute("mobile") Mobiles mobile){
	   //System.out.println(mobile.getName());
	 Mobiles m =service.insert(mobile);
	System.out.println(m);
	 
	   return "insertsuccess";
   }
   
   @RequestMapping("searchdata")
   public String dataSearch(@ModelAttribute("mobile") Mobiles mobile){
	   return "retrieve";
   }
   
   @RequestMapping("searchpage")
   public String search(@RequestParam("mobileId") int mobid,Model model){
	   Mobiles mobile = service.fetch(mobid);
	   model.addAttribute("mobile",mobile);
	   return "searchsuccess";
   }
   
   @RequestMapping("getUpdatePage")
   public String sendUpdatePage(@RequestParam("mobid") int mobid,Model model){
	   Mobiles mobile = service.getMobileDetails(mobid);
	   if(mobile==null){
		   model.addAttribute("errmsg","mobile id is invalid..."+mobid);
		   return "index";
	   }
	   else
	   model.addAttribute("mobile",mobile);
	   return "Update";
   }
   
   @RequestMapping("updateMobileAction")
   public String updateMobile(@ModelAttribute("mobile") Mobiles mobile,Model model){
	   service.updateMobiles(mobile);
	   List<Mobiles> list = service.getAllMobiles();
	   model.addAttribute("list",list);
	   return "Home";
   }
	
   @RequestMapping("delete")
   public String deleteMobile(@RequestParam("mobid") int mobid,Model model){
	   List<Mobiles> list = service.deleteMobile(mobid);
	   model.addAttribute("list",list);
	   model.addAttribute("msg","mobile record deleted");
	   return "Home";
   }
}
