package kr.co.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.config.RootConfig;
import kr.co.dao.LoginDAO;
import kr.co.dto.LoginDTO;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@ContextConfiguration(classes = RootConfig.class) 	// SQL에 데이터 삽입 시 설정 해야 함
@RunWith(SpringJUnit4ClassRunner.class)				// SQL에 데이터 삽입 시 설정 해야 함 
public class SQLTest {
	
	@Setter(onMethod_ = @Autowired)
	private LoginDAO loginDao;
	
	@Test
	public void testMapper() {
		
		LoginDTO dto = new LoginDTO();
		dto.setId("tj");
		dto.setPw("123");		
		
		loginDao.insertMember(dto);
		log.info("success");
	}
	
}
