package com.example.springprojectciti.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import com.example.springprojectciti.dao.StockDao;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;
import yahoofinance.histquotes.HistoricalQuote;
import yahoofinance.histquotes.Interval;
import yahoofinance.histquotes2.HistoricalDividend;



@Service
@Configurable
public class StockService {
	
	public ArrayList<StockDao> PassToGetStock(String sector) throws IOException {
		String path="C://Users//DeLL//OneDrive//Desktop//nifty50.csv";
		String line="";
		ArrayList<StockDao> ls=new ArrayList<StockDao>();
		BufferedReader br=new BufferedReader(new FileReader(path));
		while((line=br.readLine()) != null) {
			String [] values=line.split(",");
			if(values[1].equals(sector)) {
				StockDao dto=null;
				Calendar cal=Calendar.getInstance();
				Calendar cal1=Calendar.getInstance();
				cal.add(Calendar.DATE, -14);
				Stock stock=YahooFinance.get(values[2].toUpperCase(),cal,cal1,Interval.DAILY);
				double avg=0;
				List<HistoricalQuote> history=stock.getHistory();
				
				List<HistoricalDividend> his=stock.getDividendHistory();
				for(HistoricalQuote q:history) {
					avg+=q.getVolume();
					
				}
				avg/=14;
				BigDecimal split=BigDecimal.ZERO;
				for(HistoricalDividend h:his) {
					split=split.add(h.getAdjDividend());
				}
				
				dto=new StockDao(stock.getName(),stock.getQuote().getPrice(),stock.getQuote().getChange(),stock.getCurrency(),split,stock.getQuote().getChangeInPercent(),avg);
				ls.add(dto);
			}
		}
		
		Collections.sort(ls,new StockDao());
		return ls;
	}
	
	
	

}
