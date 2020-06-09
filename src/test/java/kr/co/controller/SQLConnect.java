package kr.co.controller;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class SQLConnect {

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test() {
//		Connection conn;
		try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/joo?serverTimezone=Asia/Seoul&useSSL=false"
				,"root","1234");) {			 
			log.info("conn : "+conn);
			log.info("hell oworld !");
		} catch (Exception e) {
			log.info("fail");
		}
		
		
	}
}
