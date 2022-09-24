package com.example.springprojectciti.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.springprojectciti.controller.bean.User;
import com.example.springprojectciti.dao.StockDao;
import com.example.springprojectciti.dao.impl.UserDaoImpl;
import com.example.springprojectciti.service.StockService;
import com.example.springprojectciti.service.UserService;



@Controller
public class LoginController {

	String[][] keys;
	String[][] s1;
	String userid;
	String pass;
	Double price;
	String stockname;
	ArrayList<StockDao> ls1;
	
	
	
	@Autowired
	StockService stockService;
	
	@Autowired
	UserService userService;
	
	public String[][] populateTableKey(){
		String[][] c= {{"name","price","dividend","volume"},
						{"name1","price1","dividend1","volume1"},
						{"name2","price2","dividend2","volume2"},
						{"name3","price3","dividend3","volume3"},
						{"name4","price4","dividend4","volume4"}};
		return c;
		
	}
	public String[][] populateTable(ArrayList<StockDao> ls) {
		
		String[][] s1= {{ls.get(0).getName(),ls.get(0).getPrice().toString(),ls.get(0).getAvg2week().toString(),String.valueOf(ls.get(0).getAvgVolume())},
				{ls.get(1).getName(),ls.get(1).getPrice().toString(),ls.get(1).getAvg2week().toString(),String.valueOf(ls.get(1).getAvgVolume())},
				{ls.get(2).getName(),ls.get(2).getPrice().toString(),ls.get(2).getAvg2week().toString(),String.valueOf(ls.get(2).getAvgVolume())},
				{ls.get(3).getName(),ls.get(3).getPrice().toString(),ls.get(3).getAvg2week().toString(),String.valueOf(ls.get(3).getAvgVolume())},
				{ls.get(4).getName(),ls.get(4).getPrice().toString(),ls.get(4).getAvg2week().toString(),String.valueOf(ls.get(4).getAvgVolume())}};
		
		return s1;
	}
	
	
	
	@RequestMapping(value = "/auto", method = RequestMethod.POST)
	public String autoPost(ModelMap model,@RequestParam String SavingStock1,@RequestParam String quant1,@RequestParam String quant2,@RequestParam String quant3,@RequestParam String quant4,@RequestParam String quant5) throws IOException {
		keys=populateTableKey();
		s1=populateTable(ls1);
		setAttribute(model);
		model.addAttribute("sector","Automobile and Auto Components");
	
        
		if(!"".equals(quant1) && quant1.matches("-?\\d+(\\.\\d+)?")) {
			int t=Integer.parseInt(quant1);
			if("Save 1st stock".equals(SavingStock1)) {
				User u=new User();
				BufferedReader input = new BufferedReader(new FileReader("C://Users//DeLL//OneDrive//Desktop//user.txt"));
			    String last = null, line;

			    while ((line = input.readLine()) != null) { 
			        last = line;
			    }
				u.setUserId(last);
				u.setPassword(pass);
				u.setQuantity(t);
				double price=ls1.get(0).getPrice().doubleValue();
				u.setTotalprice(Double.valueOf(t)*price);
				u.setStockname(ls1.get(0).getName());
				userService.UserUpdateStock(u);
			}
			
		}
		if(!"".equals(quant2) && quant2.matches("-?\\d+(\\.\\d+)?")) {
			int t=Integer.parseInt(quant2);
			if("Save 2nd stock".equals(SavingStock1)) {
				User u=new User();
				BufferedReader input = new BufferedReader(new FileReader("C://Users//DeLL//OneDrive//Desktop//user.txt"));
			    String last = null, line;

			    while ((line = input.readLine()) != null) { 
			        last = line;
			    }
				u.setUserId(last);
				u.setPassword(pass);
				u.setQuantity(t);
				double price=ls1.get(1).getPrice().doubleValue();
				u.setTotalprice(Double.valueOf(t)*price);
				u.setStockname(ls1.get(1).getName());
				userService.UserUpdateStock(u);
			}
			
		}
		if(!"".equals(quant3) && quant3.matches("-?\\d+(\\.\\d+)?")) {
			int t=Integer.parseInt(quant3);
			if("Save 3rd stock".equals(SavingStock1)) {
				User u=new User();
				BufferedReader input = new BufferedReader(new FileReader("C://Users//DeLL//OneDrive//Desktop//user.txt"));
			    String last = null, line;

			    while ((line = input.readLine()) != null) { 
			        last = line;
			    }
				u.setUserId(last);
				u.setPassword(pass);
				u.setQuantity(t);
				double price=ls1.get(2).getPrice().doubleValue();
				u.setTotalprice(Double.valueOf(t)*price);
				u.setStockname(ls1.get(2).getName());
				userService.UserUpdateStock(u);
			}
			
		}
		if(!"".equals(quant4) && quant4.matches("-?\\d+(\\.\\d+)?")) {
			int t=Integer.parseInt(quant4);
			if("Save 4th stock".equals(SavingStock1)) {
				User u=new User();
				BufferedReader input = new BufferedReader(new FileReader("C://Users//DeLL//OneDrive//Desktop//user.txt"));
			    String last = null, line;

			    while ((line = input.readLine()) != null) { 
			        last = line;
			    }
				u.setUserId(last);
				u.setPassword(pass);
				u.setQuantity(t);
				double price=ls1.get(3).getPrice().doubleValue();
				u.setTotalprice(Double.valueOf(t)*price);
				u.setStockname(ls1.get(3).getName());
				userService.UserUpdateStock(u);
			}
			
		}
		if(!"".equals(quant5) && quant5.matches("-?\\d+(\\.\\d+)?")) {
			int t=Integer.parseInt(quant5);
			if("Save 5th stock".equals(SavingStock1)) {
				User u=new User();
				BufferedReader input = new BufferedReader(new FileReader("C://Users//DeLL//OneDrive//Desktop//user.txt"));
			    String last = null, line;

			    while ((line = input.readLine()) != null) { 
			        last = line;
			    }
				u.setUserId(last);
				u.setPassword(pass);
				u.setQuantity(t);
				double price=ls1.get(4).getPrice().doubleValue();
				u.setTotalprice(Double.valueOf(t)*price);
				u.setStockname(ls1.get(4).getName());
				userService.UserUpdateStock(u);
			}
			
		}
		return "auto";
	}
	
	@RequestMapping(value = "/auto", method = RequestMethod.GET)
	public String autoGet(ModelMap model) {
		
		return "auto";
	}
	
	@RequestMapping(value = "/fast", method = RequestMethod.POST)
	public String fastPost(ModelMap model,@RequestParam String SavingStock2,@RequestParam String quant6,@RequestParam String quant7,@RequestParam String quant8,@RequestParam String quant9,@RequestParam String quant10) throws IOException {
		keys=populateTableKey();
		s1=populateTable(ls1);
		setAttribute(model);
		model.addAttribute("sector","Fast Moving Consumer Goods");
		if(!"".equals(quant6) && quant6.matches("-?\\d+(\\.\\d+)?")) {
			int t=Integer.parseInt(quant6);
			if("Save 1st stock".equals(SavingStock2)) {
				User u=new User();
				BufferedReader input = new BufferedReader(new FileReader("C://Users//DeLL//OneDrive//Desktop//user.txt"));
			    String last = null, line;

			    while ((line = input.readLine()) != null) { 
			        last = line;
			    }
				u.setUserId(last);
				u.setPassword(pass);
				u.setQuantity(t);
				double price=ls1.get(0).getPrice().doubleValue();
				u.setTotalprice(Double.valueOf(t)*price);
				u.setStockname(ls1.get(0).getName());
				userService.UserUpdateStock(u);
			}
			
		}
		if(!"".equals(quant7) && quant7.matches("-?\\d+(\\.\\d+)?")) {
			int t=Integer.parseInt(quant7);
			if("Save 2nd stock".equals(SavingStock2)) {
				User u=new User();
				BufferedReader input = new BufferedReader(new FileReader("C://Users//DeLL//OneDrive//Desktop//user.txt"));
			    String last = null, line;

			    while ((line = input.readLine()) != null) { 
			        last = line;
			    }
				u.setUserId(last);
				u.setPassword(pass);
				u.setQuantity(t);
				double price=ls1.get(1).getPrice().doubleValue();
				u.setTotalprice(Double.valueOf(t)*price);
				u.setStockname(ls1.get(1).getName());
				userService.UserUpdateStock(u);
			}
			
		}
		if(!"".equals(quant8) && quant8.matches("-?\\d+(\\.\\d+)?")) {
			int t=Integer.parseInt(quant8);
			if("Save 3rd stock".equals(SavingStock2)) {
				User u=new User();
				BufferedReader input = new BufferedReader(new FileReader("C://Users//DeLL//OneDrive//Desktop//user.txt"));
			    String last = null, line;

			    while ((line = input.readLine()) != null) { 
			        last = line;
			    }
				u.setUserId(last);
				u.setPassword(pass);
				u.setQuantity(t);
				double price=ls1.get(2).getPrice().doubleValue();
				u.setTotalprice(Double.valueOf(t)*price);
				u.setStockname(ls1.get(2).getName());
				userService.UserUpdateStock(u);
			}
			
		}
		if(!"".equals(quant9) && quant9.matches("-?\\d+(\\.\\d+)?")) {
			int t=Integer.parseInt(quant9);
			if("Save 4th stock".equals(SavingStock2)) {
				User u=new User();
				BufferedReader input = new BufferedReader(new FileReader("C://Users//DeLL//OneDrive//Desktop//user.txt"));
			    String last = null, line;

			    while ((line = input.readLine()) != null) { 
			        last = line;
			    }
				u.setUserId(last);
				u.setPassword(pass);
				u.setQuantity(t);
				double price=ls1.get(3).getPrice().doubleValue();
				u.setTotalprice(Double.valueOf(t)*price);
				u.setStockname(ls1.get(3).getName());
				userService.UserUpdateStock(u);
			}
			
		}
		if(!"".equals(quant10) && quant10.matches("-?\\d+(\\.\\d+)?")) {
			int t=Integer.parseInt(quant10);
			if("Save 5th stock".equals(SavingStock2)) {
				User u=new User();
				BufferedReader input = new BufferedReader(new FileReader("C://Users//DeLL//OneDrive//Desktop//user.txt"));
			    String last = null, line;

			    while ((line = input.readLine()) != null) { 
			        last = line;
			    }
				u.setUserId(last);
				u.setPassword(pass);
				u.setQuantity(t);
				double price=ls1.get(4).getPrice().doubleValue();
				u.setTotalprice(Double.valueOf(t)*price);
				u.setStockname(ls1.get(4).getName());
				userService.UserUpdateStock(u);
			}
			
		}
		return "fast";
	}
	
	@RequestMapping(value = "/fast", method = RequestMethod.GET)
	public String fastGet(ModelMap model) {
		
		return "fast";
	}
	
	@RequestMapping(value = "/finance", method = RequestMethod.POST)
	public String financePost(ModelMap model,@RequestParam String SavingStock3,@RequestParam String quant11,@RequestParam String quant12,@RequestParam String quant13,@RequestParam String quant14,@RequestParam String quant15) throws IOException {
		keys=populateTableKey();
		s1=populateTable(ls1);
		setAttribute(model);
		
		model.addAttribute("sector","Finance");
		if(!"".equals(quant11) && quant11.matches("-?\\d+(\\.\\d+)?")) {
			int t=Integer.parseInt(quant11);
			if("Save 1st stock".equals(SavingStock3)) {
				User u=new User();
				BufferedReader input = new BufferedReader(new FileReader("C://Users//DeLL//OneDrive//Desktop//user.txt"));
			    String last = null, line;

			    while ((line = input.readLine()) != null) { 
			        last = line;
			    }
				u.setUserId(last);
				u.setPassword(pass);
				u.setQuantity(t);
				double price=ls1.get(0).getPrice().doubleValue();
				u.setTotalprice(Double.valueOf(t)*price);
				u.setStockname(ls1.get(0).getName());
				userService.UserUpdateStock(u);
			}
			
		}
		if(!"".equals(quant12) && quant12.matches("-?\\d+(\\.\\d+)?")) {
			int t=Integer.parseInt(quant12);
			if("Save 2nd stock".equals(SavingStock3)) {
				User u=new User();
				BufferedReader input = new BufferedReader(new FileReader("C://Users//DeLL//OneDrive//Desktop//user.txt"));
			    String last = null, line;

			    while ((line = input.readLine()) != null) { 
			        last = line;
			    }
				u.setUserId(last);
				u.setPassword(pass);
				u.setQuantity(t);
				double price=ls1.get(1).getPrice().doubleValue();
				u.setTotalprice(Double.valueOf(t)*price);
				u.setStockname(ls1.get(1).getName());
				userService.UserUpdateStock(u);
			}
			
		}
		if(!"".equals(quant13) && quant13.matches("-?\\d+(\\.\\d+)?")) {
			int t=Integer.parseInt(quant13);
			if("Save 3rd stock".equals(SavingStock3)) {
				User u=new User();
				BufferedReader input = new BufferedReader(new FileReader("C://Users//DeLL//OneDrive//Desktop//user.txt"));
			    String last = null, line;

			    while ((line = input.readLine()) != null) { 
			        last = line;
			    }
				u.setUserId(last);
				u.setPassword(pass);
				u.setQuantity(t);
				double price=ls1.get(2).getPrice().doubleValue();
				u.setTotalprice(Double.valueOf(t)*price);
				u.setStockname(ls1.get(2).getName());
				userService.UserUpdateStock(u);
			}
			
		}
		if(!"".equals(quant14) && quant14.matches("-?\\d+(\\.\\d+)?")) {
			int t=Integer.parseInt(quant14);
			if("Save 4th stock".equals(SavingStock3)) {
				User u=new User();
				BufferedReader input = new BufferedReader(new FileReader("C://Users//DeLL//OneDrive//Desktop//user.txt"));
			    String last = null, line;

			    while ((line = input.readLine()) != null) { 
			        last = line;
			    }
				u.setUserId(last);
				u.setPassword(pass);
				u.setQuantity(t);
				double price=ls1.get(3).getPrice().doubleValue();
				u.setTotalprice(Double.valueOf(t)*price);
				u.setStockname(ls1.get(3).getName());
				userService.UserUpdateStock(u);
			}
			
		}
		if(!"".equals(quant15) && quant15.matches("-?\\d+(\\.\\d+)?")) {
			int t=Integer.parseInt(quant15);
			if("Save 5th stock".equals(SavingStock3)) {
				User u=new User();
				BufferedReader input = new BufferedReader(new FileReader("C://Users//DeLL//OneDrive//Desktop//user.txt"));
			    String last = null, line;

			    while ((line = input.readLine()) != null) { 
			        last = line;
			    }
				u.setUserId(last);
				u.setPassword(pass);
				u.setQuantity(t);
				double price=ls1.get(4).getPrice().doubleValue();
				u.setTotalprice(Double.valueOf(t)*price);
				u.setStockname(ls1.get(4).getName());
				userService.UserUpdateStock(u);
			}
			
		}
		return "finance";
	}
	
	@RequestMapping(value = "/finance", method = RequestMethod.GET)
	public String financeGet(ModelMap model) {
		
		return "finance";
	}
	
	@RequestMapping(value = "/health", method = RequestMethod.POST)
	public String healthPost(ModelMap model,@RequestParam String SavingStock4,@RequestParam String quant16,@RequestParam String quant17,@RequestParam String quant18,@RequestParam String quant19,@RequestParam String quant20) throws IOException {
		keys=populateTableKey();
		s1=populateTable(ls1);
		setAttribute(model);
		model.addAttribute("sector","Health care");
		if(!"".equals(quant16) && quant16.matches("-?\\d+(\\.\\d+)?")) {
			int t=Integer.parseInt(quant16);
			if("Save 1st stock".equals(SavingStock4)) {
				User u=new User();
				BufferedReader input = new BufferedReader(new FileReader("C://Users//DeLL//OneDrive//Desktop//user.txt"));
			    String last = null, line;

			    while ((line = input.readLine()) != null) { 
			        last = line;
			    }
				u.setUserId(last);
				u.setPassword(pass);
				u.setQuantity(t);
				double price=ls1.get(0).getPrice().doubleValue();
				u.setTotalprice(Double.valueOf(t)*price);
				u.setStockname(ls1.get(0).getName());
				userService.UserUpdateStock(u);
			}
			
		}
		if(!"".equals(quant17) && quant17.matches("-?\\d+(\\.\\d+)?")) {
			int t=Integer.parseInt(quant17);
			if("Save 2nd stock".equals(SavingStock4)) {
				User u=new User();
				BufferedReader input = new BufferedReader(new FileReader("C://Users//DeLL//OneDrive//Desktop//user.txt"));
			    String last = null, line;

			    while ((line = input.readLine()) != null) { 
			        last = line;
			    }
				u.setUserId(last);
				u.setPassword(pass);
				u.setQuantity(t);
				double price=ls1.get(1).getPrice().doubleValue();
				u.setTotalprice(Double.valueOf(t)*price);
				u.setStockname(ls1.get(1).getName());
				userService.UserUpdateStock(u);
			}
			
		}
		if(!"".equals(quant18) && quant18.matches("-?\\d+(\\.\\d+)?")) {
			int t=Integer.parseInt(quant18);
			if("Save 3rd stock".equals(SavingStock4)) {
				User u=new User();
				BufferedReader input = new BufferedReader(new FileReader("C://Users//DeLL//OneDrive//Desktop//user.txt"));
			    String last = null, line;

			    while ((line = input.readLine()) != null) { 
			        last = line;
			    }
				u.setUserId(last);
				u.setPassword(pass);
				u.setQuantity(t);
				double price=ls1.get(2).getPrice().doubleValue();
				u.setTotalprice(Double.valueOf(t)*price);
				u.setStockname(ls1.get(2).getName());
				userService.UserUpdateStock(u);
			}
			
		}
		if(!"".equals(quant19) && quant19.matches("-?\\d+(\\.\\d+)?")) {
			int t=Integer.parseInt(quant19);
			if("Save 4th stock".equals(SavingStock4)) {
				User u=new User();
				BufferedReader input = new BufferedReader(new FileReader("C://Users//DeLL//OneDrive//Desktop//user.txt"));
			    String last = null, line;

			    while ((line = input.readLine()) != null) { 
			        last = line;
			    }
				u.setUserId(last);
				u.setPassword(pass);
				u.setQuantity(t);
				double price=ls1.get(3).getPrice().doubleValue();
				u.setTotalprice(Double.valueOf(t)*price);
				u.setStockname(ls1.get(3).getName());
				userService.UserUpdateStock(u);
			}
			
		}
		if(!"".equals(quant20) && quant20.matches("-?\\d+(\\.\\d+)?")) {
			int t=Integer.parseInt(quant20);
			if("Save 5th stock".equals(SavingStock4)) {
				User u=new User();
				BufferedReader input = new BufferedReader(new FileReader("C://Users//DeLL//OneDrive//Desktop//user.txt"));
			    String last = null, line;

			    while ((line = input.readLine()) != null) { 
			        last = line;
			    }
				u.setUserId(last);
				u.setPassword(pass);
				u.setQuantity(t);
				double price=ls1.get(4).getPrice().doubleValue();
				u.setTotalprice(Double.valueOf(t)*price);
				u.setStockname(ls1.get(4).getName());
				userService.UserUpdateStock(u);
			}
			
		}
		return "health";
	}
	
	@RequestMapping(value = "/health", method = RequestMethod.GET)
	public String healthGet(ModelMap model) {
		
		return "health";
	}
	
	@RequestMapping(value = "/it", method = RequestMethod.POST)
	public String itPost(ModelMap model,@RequestParam String SavingStock5,@RequestParam String quant21,@RequestParam String quant22,@RequestParam String quant23,@RequestParam String quant24,@RequestParam String quant25) throws IOException {
		keys=populateTableKey();
		s1=populateTable(ls1);
		setAttribute(model);
		model.addAttribute("sector","Information technology");
		if(!"".equals(quant21) && quant21.matches("-?\\d+(\\.\\d+)?")) {
			int t=Integer.parseInt(quant21);
			if("Save 1st stock".equals(SavingStock5)) {
				User u=new User();
				BufferedReader input = new BufferedReader(new FileReader("C://Users//DeLL//OneDrive//Desktop//user.txt"));
			    String last = null, line;

			    while ((line = input.readLine()) != null) { 
			        last = line;
			    }
				u.setUserId(last);
				u.setPassword(pass);
				u.setQuantity(t);
				double price=ls1.get(0).getPrice().doubleValue();
				u.setTotalprice(Double.valueOf(t)*price);
				u.setStockname(ls1.get(0).getName());
				userService.UserUpdateStock(u);
			}
			
		}
		if(!"".equals(quant22) && quant22.matches("-?\\d+(\\.\\d+)?")) {
			int t=Integer.parseInt(quant22);
			if("Save 2nd stock".equals(SavingStock5)) {
				User u=new User();
				BufferedReader input = new BufferedReader(new FileReader("C://Users//DeLL//OneDrive//Desktop//user.txt"));
			    String last = null, line;

			    while ((line = input.readLine()) != null) { 
			        last = line;
			    }
				u.setUserId(last);
				u.setPassword(pass);
				u.setQuantity(t);
				double price=ls1.get(1).getPrice().doubleValue();
				u.setTotalprice(Double.valueOf(t)*price);
				u.setStockname(ls1.get(1).getName());
				userService.UserUpdateStock(u);
			}
			
		}
		if(!"".equals(quant23) && quant23.matches("-?\\d+(\\.\\d+)?")) {
			int t=Integer.parseInt(quant23);
			if("Save 3rd stock".equals(SavingStock5)) {
				User u=new User();
				BufferedReader input = new BufferedReader(new FileReader("C://Users//DeLL//OneDrive//Desktop//user.txt"));
			    String last = null, line;

			    while ((line = input.readLine()) != null) { 
			        last = line;
			    }
				u.setUserId(last);
				u.setPassword(pass);
				u.setQuantity(t);
				double price=ls1.get(2).getPrice().doubleValue();
				u.setTotalprice(Double.valueOf(t)*price);
				u.setStockname(ls1.get(2).getName());
				userService.UserUpdateStock(u);
			}
			
		}
		if(!"".equals(quant24) && quant24.matches("-?\\d+(\\.\\d+)?")) {
			int t=Integer.parseInt(quant24);
			if("Save 4th stock".equals(SavingStock5)) {
				User u=new User();
				BufferedReader input = new BufferedReader(new FileReader("C://Users//DeLL//OneDrive//Desktop//user.txt"));
			    String last = null, line;

			    while ((line = input.readLine()) != null) { 
			        last = line;
			    }
				u.setUserId(last);
				u.setPassword(pass);
				u.setQuantity(t);
				double price=ls1.get(3).getPrice().doubleValue();
				u.setTotalprice(Double.valueOf(t)*price);
				u.setStockname(ls1.get(3).getName());
				userService.UserUpdateStock(u);
			}
			
		}
		if(!"".equals(quant25) && quant25.matches("-?\\d+(\\.\\d+)?")) {
			int t=Integer.parseInt(quant25);
			if("Save 5th stock".equals(SavingStock5)) {
				User u=new User();
				BufferedReader input = new BufferedReader(new FileReader("C://Users//DeLL//OneDrive//Desktop//user.txt"));
			    String last = null, line;

			    while ((line = input.readLine()) != null) { 
			        last = line;
			    }
				u.setUserId(last);
				u.setPassword(pass);
				u.setQuantity(t);
				double price=ls1.get(4).getPrice().doubleValue();
				u.setTotalprice(Double.valueOf(t)*price);
				u.setStockname(ls1.get(4).getName());
				userService.UserUpdateStock(u);
			}
			
		}
		return "it";
	}
	
	@RequestMapping(value = "/it", method = RequestMethod.GET)
	public String itGet(ModelMap model) {
		
		return "it";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage(ModelMap model) {
		
		return "login";
	}
	
	

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String welcomePage(ModelMap model,@RequestParam String userId,@RequestParam String password) throws IOException {
		User user=userService.getUserByUserId(userId);
		if(user.getPassword().equals(password)) {
			try (FileWriter f = new FileWriter("C://Users//DeLL//OneDrive//Desktop//user.txt", true); 
					BufferedWriter b = new BufferedWriter(f); 
					PrintWriter p = new PrintWriter(b);) { 
				p.println(userId); 
			} catch (IOException i) 
			{ 
				i.printStackTrace(); 
			}

			
			model.addAttribute("userId", userId);
			return "welcome";
		}
		model.put("errorMsgs","Please provide the correct userid or password");
		return "login";
	}
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcomeGet() {
		
		return "welcome";
	}
		
	@RequestMapping(value = "/welcome", method = RequestMethod.POST)
	public String welcomePost(ModelMap model,@RequestParam String Auto) throws IOException, InterruptedException {
		
		model.addAttribute("sector",Auto);
		if("My portfolio".equals(Auto)) {
			return "portfolio";
		}
		else if("Automobile and Auto Components".equals(Auto)) {
			ls1=stockService.PassToGetStock("Automobile and Auto Components");
			keys=populateTableKey();
			s1=populateTable(ls1);
			setAttribute(model);
			return "auto";
			
		}
		else if("Fast Moving Consumer Goods".equals(Auto)) {
			ls1=stockService.PassToGetStock("Fast Moving Consumer Goods");
			keys=populateTableKey();
			s1=populateTable(ls1);
			setAttribute(model);
			return "fast";
			
		}
		else if("Financial Services".equals(Auto)) {
			ls1=stockService.PassToGetStock("Financial Services");
			keys=populateTableKey();
			s1=populateTable(ls1);
			setAttribute(model);
			return "finance";
		}
		else if("Healthcare".equals(Auto)) {
			ls1=stockService.PassToGetStock("Healthcare");
			keys=populateTableKey();
			s1=populateTable(ls1);
			setAttribute(model);
			return "health";
		}
		else if("Information Technology".equals(Auto)) {
			ls1=stockService.PassToGetStock("Information Technology");
			keys=populateTableKey();
			s1=populateTable(ls1);
			setAttribute(model);
			return "it";
		}
		
		
		return "welcome";
	}
	private void setAttribute(ModelMap model) {
		
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
	}
	
}
