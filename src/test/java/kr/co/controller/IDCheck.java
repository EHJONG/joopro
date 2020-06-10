package kr.co.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.config.RootConfig;
import kr.co.dao.LoginDAO;
import kr.co.mapper.LoginMapper;
import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootConfig.class)
public class IDCheck {
	
	LoginMapper mapper;
	
	@Autowired
	LoginDAO dao;
	
	@Test
	public void testCheck() {
		String id = "tj";
		boolean is = dao.checkId(id);
		System.out.println("is : "+is);
	}
}
