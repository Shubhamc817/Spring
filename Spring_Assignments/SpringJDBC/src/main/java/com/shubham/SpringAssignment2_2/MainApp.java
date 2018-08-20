package com.shubham.SpringAssignment2_2;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean2.2.xml");
		
		Player p0=  (Player)context.getBean("player1");
		Player p1=  (Player)context.getBean("player2");
		Player p2=  (Player)context.getBean("player3");
		Player p3=  (Player)context.getBean("player4");
		Player p4=  (Player)context.getBean("player5");
		
		Player[] player= {p0,p1,p2,p3,p4};
		
		for(Player p:player)
		{	
		System.out.println("Player's ID "+p.getPlayerId());
		
		System.out.println("Player's Name "+p.getPlayerName());

		System.out.println("Player's Country ID "+p.getCountryName().getCountryId());

		System.out.println("Player's Country Name "+p.getCountryName().getCountryName());
		}
		
		System.out.println("\n\n-------------------------------------------------\n\n");
		Country country0=(Country)context.getBean("country0");
		Country country2=(Country)context.getBean("country0");
		
		Country[] country_= {country0,country2};
		
		for(Country country1: country_)
		{
		System.out.println(country1.getCountryId());
		System.out.println(country1.getCountryName());
		List<Player> country=country1.getPlayer();
		
		System.out.println("Players from Country "+country1.getCountryName());
		for(Player p:country) {
			System.out.println(p.getPlayerId());
			
			System.out.println(p.getPlayerName());
			
		}
		}
	

		

	}

}
