package kr.co.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.config.RootConfig;
import kr.co.dao.LoginDAO;
import kr.co.dto.LoginDTO;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@Log4j
@ContextConfiguration(classes = RootConfig.class)
public class PWCheck {
	
	@Autowired
	private LoginDAO dao;
	
	@Test
	public void testDao() {
		LoginDTO dto = new LoginDTO();
		dto.setId("tj");
		dto.setPw("15");
		
		String hash = BCrypt.hashpw(dto.getPw(), BCrypt.gensalt());
		
		if(BCrypt.checkpw(dto.getPw(), hash)) {
			System.out.println("same");
		}else {
			System.out.println("wrong");
		}
		boolean tr = BCrypt.checkpw(dto.getPw(), hash);
		System.out.println("tr : "+tr);
	}
	
}
