package kr.co.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.config.RootConfig;
import kr.co.dto.MemberDTO;
import kr.co.mapper.MemberMapper;
import lombok.extern.log4j.Log4j;

@Log4j
@ContextConfiguration(classes = RootConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class SearchTest {

	@Autowired
	private MemberMapper mapper;
	
	@Test
	public void test() {
		
		String search = "a";
		System.out.println(mapper.listMember(search));
		
		log.info("szuccess");
		
	}
}
