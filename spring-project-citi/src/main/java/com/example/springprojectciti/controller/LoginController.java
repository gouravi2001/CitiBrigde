package com.example.springprojectciti.controller;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.springprojectciti.controller.bean.User;
import com.example.springprojectciti.dao.StockDao;
import com.example.springprojectciti.service.StockService;
import com.example.springprojectciti.service.UserService;

@Controller
public class LoginController {

	
	
	
	
	@Autowired
	StockService stockService;
	
	@Autowired
	UserService userService;
	
	public String[][] populateTableKey(){
		String[][] c= {{"name","price","dividend","volume"},
						{"name1","price1","dividend1","volume1"},
						{"name2","price2","dividend2","volume2"},
						{"name3","price3","dividend3","volume3"},
						{"name4","price4","dividend4","volume4"},
						{"name5","price5","dividend5","volume5"},
						{"name6","price6","dividend6","volume6"},
						{"name7","price7","dividend7","volume7"},
						{"name8","price8","dividend8","volume8"},
						{"name9","price9","dividend9","volume9"},
						{"name10","price10","dividend10","volume10"},
						{"name11","price11","dividend11","volume11"},
						{"name12","price12","dividend12","volume12"},
						{"name13","price13","dividend13","volume13"},
						{"name14","price14","dividend14","volume14"},
						{"name15","price15","dividend15","volume15"},
						{"name16","price16","dividend16","volume16"},
						{"name17","price17","dividend17","volume17"},
						{"name18","price18","dividend18","volume18"},
						{"name19","price19","dividend19","volume19"},
						{"name20","price20","dividend20","volume20"},
						{"name21","price21","dividend21","volume21"},
						{"name22","price22","dividend22","volume22"},
						{"name23","price23","dividend23","volume23"},
						{"name24","price24","dividend24","volume24"}};
		return c;
		
	}
	public String[][] populateTable(ArrayList<StockDao> ls) {
		String[][] s1= {{ls.get(0).getName(),ls.get(0).getPrice().toString(),ls.get(0).getDividend2week().toString(),Double.toString(ls.get(0).getVolume2week())},
				{ls.get(1).getName(),ls.get(1).getPrice().toString(),ls.get(1).getDividend2week().toString(),Double.toString(ls.get(1).getVolume2week())},
				{ls.get(2).getName(),ls.get(2).getPrice().toString(),ls.get(2).getDividend2week().toString(),Double.toString(ls.get(2).getVolume2week())},
				{ls.get(3).getName(),ls.get(3).getPrice().toString(),ls.get(3).getDividend2week().toString(),Double.toString(ls.get(3).getVolume2week())},
				{ls.get(4).getName(),ls.get(4).getPrice().toString(),ls.get(4).getDividend2week().toString(),Double.toString(ls.get(4).getVolume2week())}};
		return s1;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage(ModelMap model) {
		return "login";
	}
	
	

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String welcomePage(ModelMap model,@RequestParam String userId,@RequestParam String password) throws IOException {
		User user=userService.getUserByUserId(userId);
		if(user.getPassword().equals(password)) {
			ArrayList<StockDao> ls=stockService.PassToGetStock("Automobile and Auto Components");
			ArrayList<StockDao> ls1=stockService.PassToGetStock("Fast Moving Consumer Goods");
			ArrayList<StockDao> ls2=stockService.PassToGetStock("Financial Services");
			ArrayList<StockDao> ls3=stockService.PassToGetStock("Healthcare");
			ArrayList<StockDao> ls4=stockService.PassToGetStock("Information Technology");
			model.addAttribute("userId", userId);
			String[][] keys=populateTableKey();
			
			
			
			String[][] s1=populateTable(ls);
			model.addAttribute(keys[0][0], s1[0][0]);
			model.addAttribute(keys[0][1],s1[0][1]);
			model.addAttribute(keys[0][2],s1[0][2]);
			model.addAttribute(keys[0][3], s1[0][3]);
			model.addAttribute(keys[1][0], s1[1][0]);
			model.addAttribute(keys[1][1],s1[1][1]);
			model.addAttribute(keys[1][2],s1[1][2]);
			model.addAttribute(keys[1][3], s1[1][3]);
			model.addAttribute(keys[2][0], s1[2][0]);
			model.addAttribute(keys[2][1],s1[2][1]);
			model.addAttribute(keys[2][2],s1[2][2]);
			model.addAttribute(keys[2][3], s1[2][3]);
			model.addAttribute(keys[3][0], s1[3][0]);
			model.addAttribute(keys[3][1],s1[3][1]);
			model.addAttribute(keys[3][2],s1[3][2]);
			model.addAttribute(keys[3][3], s1[3][3]);
			model.addAttribute(keys[4][0], s1[4][0]);
			model.addAttribute(keys[4][1],s1[4][1]);
			model.addAttribute(keys[4][2],s1[4][2]);
			model.addAttribute(keys[4][3], s1[4][3]);
//			
//			
			String[][] s2=populateTable(ls1);
			model.addAttribute(keys[5][0], s2[0][0]);
			model.addAttribute(keys[5][1],s2[0][1]);
			model.addAttribute(keys[5][2],s2[0][2]);
			model.addAttribute(keys[5][3], s2[0][3]);
			model.addAttribute(keys[6][0], s2[1][0]);
			model.addAttribute(keys[6][1],s2[1][1]);
			model.addAttribute(keys[6][2],s2[1][2]);
			model.addAttribute(keys[6][3], s2[1][3]);
			model.addAttribute(keys[7][0], s2[2][0]);
			model.addAttribute(keys[7][1],s2[2][1]);
			model.addAttribute(keys[7][2],s2[2][2]);
			model.addAttribute(keys[7][3], s2[2][3]);
			model.addAttribute(keys[8][0], s2[3][0]);
			model.addAttribute(keys[8][1],s2[3][1]);
			model.addAttribute(keys[8][2],s2[3][2]);
			model.addAttribute(keys[8][3], s2[3][3]);
			model.addAttribute(keys[9][0], s2[4][0]);
			model.addAttribute(keys[9][1],s2[4][1]);
			model.addAttribute(keys[9][2],s2[4][2]);
			model.addAttribute(keys[9][3], s2[4][3]);
//			
			String[][] s3=populateTable(ls2);
			model.addAttribute(keys[10][0], s3[0][0]);
			model.addAttribute(keys[10][1],s3[0][1]);
			model.addAttribute(keys[10][2],s3[0][2]);
			model.addAttribute(keys[10][3], s3[0][3]);
			model.addAttribute(keys[11][0], s3[1][0]);
			model.addAttribute(keys[11][1],s3[1][1]);
			model.addAttribute(keys[11][2],s3[1][2]);
			model.addAttribute(keys[11][3], s3[1][3]);
			model.addAttribute(keys[12][0], s3[2][0]);
			model.addAttribute(keys[12][1],s3[2][1]);
			model.addAttribute(keys[12][2],s3[2][2]);
			model.addAttribute(keys[12][3], s3[2][3]);
			model.addAttribute(keys[13][0], s3[3][0]);
			model.addAttribute(keys[13][1],s3[3][1]);
			model.addAttribute(keys[13][2],s3[3][2]);
			model.addAttribute(keys[13][3], s3[3][3]);
			model.addAttribute(keys[14][0], s3[4][0]);
			model.addAttribute(keys[14][1],s3[4][1]);
			model.addAttribute(keys[14][2],s3[4][2]);
			model.addAttribute(keys[14][3], s3[4][3]);
			
			String[][] s4=populateTable(ls3);
			model.addAttribute(keys[15][0], s4[0][0]);
			model.addAttribute(keys[15][1],s4[0][1]);
			model.addAttribute(keys[15][2],s4[0][2]);
			model.addAttribute(keys[15][3], s4[0][3]);
			model.addAttribute(keys[16][0], s4[1][0]);
			model.addAttribute(keys[16][1],s4[1][1]);
			model.addAttribute(keys[16][2],s4[1][2]);
			model.addAttribute(keys[16][3], s4[1][3]);
			model.addAttribute(keys[17][0], s4[2][0]);
			model.addAttribute(keys[17][1],s4[2][1]);
			model.addAttribute(keys[17][2],s4[2][2]);
			model.addAttribute(keys[17][3], s4[2][3]);
			model.addAttribute(keys[18][0], s4[3][0]);
			model.addAttribute(keys[18][1],s4[3][1]);
			model.addAttribute(keys[18][2],s4[3][2]);
			model.addAttribute(keys[18][3], s4[3][3]);
			model.addAttribute(keys[19][0], s4[4][0]);
			model.addAttribute(keys[19][1],s4[4][1]);
			model.addAttribute(keys[19][2],s4[4][2]);
			model.addAttribute(keys[19][3], s4[4][3]);
			
			
			String[][] s5=populateTable(ls4);
			model.addAttribute(keys[20][0], s5[0][0]);
			model.addAttribute(keys[20][1],s5[0][1]);
			model.addAttribute(keys[20][2],s5[0][2]);
			model.addAttribute(keys[20][3], s5[0][3]);
			model.addAttribute(keys[21][0], s5[1][0]);
			model.addAttribute(keys[21][1],s5[1][1]);
			model.addAttribute(keys[21][2],s5[1][2]);
			model.addAttribute(keys[21][3], s5[1][3]);
			model.addAttribute(keys[22][0], s5[2][0]);
			model.addAttribute(keys[22][1],s5[2][1]);
			model.addAttribute(keys[22][2],s5[2][2]);
			model.addAttribute(keys[22][3], s5[2][3]);
			model.addAttribute(keys[23][0], s5[3][0]);
			model.addAttribute(keys[23][1],s5[3][1]);
			model.addAttribute(keys[23][2],s5[3][2]);
			model.addAttribute(keys[23][3], s5[3][3]);
			model.addAttribute(keys[24][0], s5[4][0]);
			model.addAttribute(keys[24][1],s5[4][1]);
			model.addAttribute(keys[24][2],s5[4][2]);
			model.addAttribute(keys[24][3], s5[4][3]);
			

			
			//model.addAttribute("Hello",a.get(0).toString());
			return "welcome";
		}
		return "login";
	}
	
}
